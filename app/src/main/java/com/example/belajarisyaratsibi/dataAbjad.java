package com.example.belajarisyaratsibi;

import java.util.ArrayList;

public class dataAbjad {


    public static String[][] data = new String[][]{
            {
                "https://pmpk.kemdikbud.go.id/sibi/SIBI/abjad/A.png", "A"
            },
            {
                "https://pmpk.kemdikbud.go.id/sibi/SIBI/abjad/B.png", "B"
            },
            {
                "https://pmpk.kemdikbud.go.id/sibi/SIBI/abjad/C.png", "C"
            },
            {
                "https://pmpk.kemdikbud.go.id/sibi/SIBI/abjad/D.png", "D"
            },
            {
                "https://pmpk.kemdikbud.go.id/sibi/SIBI/abjad/E.png", "E"
            },
            {
                "https://pmpk.kemdikbud.go.id/sibi/SIBI/abjad/F.png", "F"
            },
            {
                "https://pmpk.kemdikbud.go.id/sibi/SIBI/abjad/G.png", "G"
            },
            {
                "https://pmpk.kemdikbud.go.id/sibi/SIBI/abjad/H.png", "H"
            },
            {
                "https://pmpk.kemdikbud.go.id/sibi/SIBI/abjad/I.png", "I"
            },
            {
                "https://pmpk.kemdikbud.go.id/sibi/SIBI/abjad/J.png", "J"
            },
            {
                "https://pmpk.kemdikbud.go.id/sibi/SIBI/abjad/K.png", "K"
            },
            {
                "https://pmpk.kemdikbud.go.id/sibi/SIBI/abjad/L.png", "L"
            },
            {
                "https://pmpk.kemdikbud.go.id/sibi/SIBI/abjad/M.png", "M"
            },
            {
                "https://pmpk.kemdikbud.go.id/sibi/SIBI/abjad/N.png", "N"
            },
            {
                "https://pmpk.kemdikbud.go.id/sibi/SIBI/abjad/O.png", "O"
            },
            {
                "https://pmpk.kemdikbud.go.id/sibi/SIBI/abjad/P.png", "P"
            },
            {
                "https://pmpk.kemdikbud.go.id/sibi/SIBI/abjad/Q.png", "Q"
            },
            {
                "https://pmpk.kemdikbud.go.id/sibi/SIBI/abjad/R.png", "R"
            },
            {
                "https://pmpk.kemdikbud.go.id/sibi/SIBI/abjad/S.png", "S"
            },
            {
                "https://pmpk.kemdikbud.go.id/sibi/SIBI/abjad/T.png", "T"
            },
            {
                "https://pmpk.kemdikbud.go.id/sibi/SIBI/abjad/U.png", "U"
            },
            {
                "https://pmpk.kemdikbud.go.id/sibi/SIBI/abjad/V.png", "V"
            },
            {
                "https://pmpk.kemdikbud.go.id/sibi/SIBI/abjad/W.png", "W"
            },
            {
                "https://pmpk.kemdikbud.go.id/sibi/SIBI/abjad/X.png", "X"
            },
            {
                "https://pmpk.kemdikbud.go.id/sibi/SIBI/abjad/Y.png", "Y"
            },
            {
                "https://pmpk.kemdikbud.go.id/sibi/SIBI/abjad/Z.png", "Z"
            }
    };

    public static ArrayList<ModelDataAbjad> ambilData_abjad(){
        ArrayList<ModelDataAbjad> dataAbjad = new ArrayList<>();

        for(String[] Vardata : data){
            ModelDataAbjad model = new ModelDataAbjad();
            model.setFoto_abjad(Vardata[0]);
            model.setAbjad(Vardata[1]);
            dataAbjad.add(model);
        }

        return dataAbjad;

    }


}
