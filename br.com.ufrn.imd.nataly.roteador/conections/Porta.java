package conections;

import java.util.LinkedList;
import java.util.Queue;
import routers.Roteador;

public class Porta {

    // ATRIBUTOS

    private Pacote saida;

    private Roteador roteadorDestino = null;

    // MÉTODOS

    public Pacote getSaida() {
        return saida;
    }

    public void setSaida(Pacote saida) {
        this.saida = saida;
    }

    public Roteador getRoteadorDestino() {
        return roteadorDestino;
    }

    public void setRoteadorDestino(Roteador roteadorDestino) {
        this.roteadorDestino = roteadorDestino;
    }

    public Roteador transferirPacote() {
        if (getRoteadorDestino() != null) {
            getRoteadorDestino().receberPacote(getSaida());
        }
        return getRoteadorDestino();
    }
}
