package conections;

import routers.Roteador;

public class Porta {

    //TODO - buffer com a fila de pacotes

    private Roteador roteadorDestino;

    public Roteador getRoteadorDestino() {
        return roteadorDestino;
    }

    public void setRoteadorDestino(Roteador roteadorDestino) {
        this.roteadorDestino = roteadorDestino;
    }

}
