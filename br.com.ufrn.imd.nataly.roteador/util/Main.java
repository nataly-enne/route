package util;

import routers.Roteador;

public class Main {

    public static void main(String[] args){

        //Criando roteadores em uma matriz 3x3 e setando as portas
        Roteador[][] r = new Roteador[3][3];

        //adicionando os ips dados e definindo as portas conectadas a cada roteador :
        int aux = 0;
        int j = 0;
        for (int i = 0; i < r.length; i++){;
            for(j = 0; j < r[i].length; j++){
                r[i][j] = new Roteador();
                r[i][j].setIP(new StringBuilder().append("192.168.0.").append(aux).toString());
                aux++;
                r[i][j].setPosJ(j);
                r[i][j].setPosI(i);
                //conections.Porta Cima:
                if(i != 0) {
                    r[i][j].PCima.setRoteadorDestino(r[i-1][j]);
                }
                //conections.Porta Baixo:
                if(i != 2){
                    r[i][j].PBaixo.setRoteadorDestino(r[i+1][j]); //Apesar do NullPointerException ta indicando aqui, ele tbm acontece nos outros set L24, L32 e L36
                }
                //conections.Porta Esquerda
                if(j != 0){
                    r[i][j].PEsquerda.setRoteadorDestino(r[i][j-1]);
                }
                //conections.Porta Direta
                if(j != 2){
                    r[i][j].PDireita.setRoteadorDestino(r[i][j+1]);
                }
            }
        }

    }
}
