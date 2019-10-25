package util;

import routers.Roteador;

public class Main {

    public static void main(String[] args){

        //Criando roteadores em uma matriz 3x3 e setando as portas
        Roteador[][] r = new Roteador[3][3];

        int j = 0;
        for (int i = 0; i < 3; i++){
            r[i][j].setPosI(i);
            for(j = 0; j < 3; j++){
                r[i][j].setPosJ(j);
                // TODO - adicionar ip aos roteadores (por arquivo???)

                r[i][j].PRede.setRoteadorDestino(null); // TODO - Definir como deve ficar a porta com a rede

                //conections.Porta Cima:
                if(i == 0){
                    r[i][j].PCima.setRoteadorDestino(null);
                }
                else{
                    r[i][j].PCima.setRoteadorDestino(r[i-1][j]);
                }
                //conections.Porta Baixo:
                if(i == 2){
                    r[i][j].PBaixo.setRoteadorDestino(null);
                }
                else{
                    r[i][j].PBaixo.setRoteadorDestino(r[i+1][j]);
                }
                //conections.Porta Esquerda
                if(j == 0){
                    r[i][j].PEsquerda.setRoteadorDestino(null);
                }
                else{
                    r[i][j].PEsquerda.setRoteadorDestino(r[i][j-1]);
                }
                //conections.Porta Direta
                if(j == 2){
                    r[i][j].PDireita.setRoteadorDestino(null);
                }
                else{
                    r[i][j].PDireita.setRoteadorDestino(r[i][j+1]);
                }
            }
        }
    }
}
