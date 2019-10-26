package routers;

import conections.Pacote;
import conections.Porta;

public interface Roteamento {

    public Porta roteamento(Pacote pacote);
}