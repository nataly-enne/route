package util;

import conections.*;
import routers.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        //Criando roteadores em uma matriz 3x3 e setando as portas
        Roteador[][] roteadores = new Roteador[3][3];

        //adicionando os ips dados e definindo as portas conectadas a cada roteador :
        int aux = 1;

        for (int i = 0; i < roteadores.length; i++) {
            for (int j = 0; j < roteadores[i].length; j++){
                roteadores[i][j] = new Roteador(); //inicializando os roteadores

                roteadores[i][j].setIP(new StringBuilder().append("192.168.0.").append(aux).toString());
                aux++;

                roteadores[i][j].setPosJ(j);
                roteadores[i][j].setPosI(i);

                roteadores[i][j].PCima = new Porta(); //inicializando as portas
                roteadores[i][j].PBaixo = new Porta();;
                roteadores[i][j].PEsquerda = new Porta();
                roteadores[i][j].PDireita = new Porta();
                roteadores[i][j].PRede = new Porta();

                //conections.Porta Cima:
                if(i != 0) {
                    roteadores[i][j].PCima.setRoteadorDestino(roteadores[i-1][j]);
                }
                //conections.Porta Baixo:
                if(i != 2) {
                    roteadores[i][j].PBaixo.setRoteadorDestino(roteadores[i+1][j]);
                }
                //conections.Porta Esquerda
                if(j != 0) {
                    roteadores[i][j].PEsquerda.setRoteadorDestino(roteadores[i][j-1]);
                }
                //conections.Porta Direta
                if(j != 2) {
                    roteadores[i][j].PDireita.setRoteadorDestino(roteadores[i][j+1]);
                }
            }
        }

        // TESTE

        //inicializando o menu e o leitor
        Teste teste = new Teste();
        teste.leitor = new Scanner(System.in);
        Pacote pacoteDeTeste = new Pacote();

        int a = 1;
        int b = 2;

        int x = 0;
        int y = 1;

        System.out.println("IP da Origem: " + roteadores[a][b].getIP());
        System.out.println("IP do Destino: " + roteadores[x][y].getIP() + "\n");
        System.out.println("Iniciando teste...\n\n");

        pacoteDeTeste.setPosicaoDestino(x, y);

        roteadores[a][b].receberPacote(pacoteDeTeste);

        teste.testar(roteadores[a][b], roteadores[x][y]);

        teste.checarTeste(roteadores[x][y], pacoteDeTeste);
    }
}
