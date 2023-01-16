package com.example.belajarisyaratsibi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class abjadAdapter extends RecyclerView.Adapter<abjadAdapter.CardViewHolder> {

    private ArrayList<ModelDataAbjad> dataAbjad;

    public abjadAdapter(ArrayList<ModelDataAbjad> dataAbjad)
    {
        this.dataAbjad = dataAbjad;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_abjad, parent, false);

        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {

        ModelDataAbjad abjad = dataAbjad.get(position);

        Glide.with(holder.itemView.getContext()).load(abjad.getFoto_abjad()).apply(new RequestOptions().override(350, 550)).into(holder.iv_foto_abjad);
        holder.tv_abjad.setText(abjad.getAbjad());

//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String Abjad = dataAbjad.get(holder.getAdapterPosition()).getAbjad();
//                String foto = dataAbjad.get(holder.getAdapterPosition()).getFoto_abjad();
//
//                Intent intent = new Intent(holder.itemView.getContext(), DetailDeveloper.class);
//                intent.putExtra("Varabjad", Abjad);
//                intent.putExtra("Varfoto", foto);
//
//                holder.itemView.getContext().startActivity(intent);
//
//            }
//        });


    }

    @Override
    public int getItemCount() {
        return dataAbjad.size();
    }


    public class CardViewHolder extends RecyclerView.ViewHolder{
        ImageView iv_foto_abjad;
        TextView tv_abjad;

        public CardViewHolder(@NonNull View itemView){
            super(itemView);
            iv_foto_abjad = itemView.findViewById(R.id.iv_foto_abjad);
            tv_abjad = itemView.findViewById(R.id.tv_abjad);

        }


    }



}
