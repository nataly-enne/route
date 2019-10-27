package util;

import java.util.Scanner;

import conections.*;
import routers.*;

public class Teste {

    Scanner leitor;

    public void testar(Roteador origem, Roteador destino) {
        if (origem.getIP().equalsIgnoreCase(destino.getIP())) {
            System.out.println("IP da origem: " + origem.getIP());
            System.out.println("IP do destino: " + destino.getIP());
            System.out.println("\n");

        } else {
            System.out.println("IP da origem: " + origem.getIP());
            System.out.println("IP do destino: " + destino.getIP());
            System.out.println("\n");

            Roteador proximoRoteador = origem.roteamento(origem.getPrimeiroPacotedaFila()).getRoteadorDestino();

            origem.transferirPacote();

            testar(proximoRoteador, destino);
        }
    }

    public void checarTeste(Roteador roteador, Pacote pacote) {
        System.out.println(roteador.checarChegadaDoPacote(pacote));
    }
}
