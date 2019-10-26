package routers;

import conections.*;

import java.util.LinkedList;
import java.util.Queue;

public class Roteador extends DispositivoDeRede implements Roteamento {

    // ATRIBUTOS

    private int posI;
    private int posJ;
    public Porta PCima;
    public Porta PBaixo;
    public Porta PEsquerda;
    public Porta PDireita;
    public Porta PRede;
    private Queue<Pacote> bufferDeEntrada = new LinkedList<>();

    // MÉTODOS

    public void setPosI(int posI) {
        this.posI = posI;
    }

    public void setPosJ(int posJ) {
        this.posJ = posJ;
    }

    @Override
    public String getIP() {
        return IP;
    }

    @Override
    public void setIP(String IP) {this.IP = IP;}

    @Override
    public String getMAC() {
        return MAC;
    }

    @Override
    public void setMAC(String MAC) {
        this.MAC = MAC;
    }

    public void receberPacote(Pacote pacote) {
        bufferDeEntrada.add(pacote);
    }

    public Porta roteamento(Pacote pacote){

        int i = pacote.getIdestino();
        int j = pacote.getJdestino();

        if(posI > i){
            return PCima;   // ir para porta de cima
        }
        else if(posI < i){
            return PBaixo;   // ir para porta de baixo
        }
        else if(posJ < j){
            return PDireita;   // ir para porta da direita
        }
        else if(posJ > j ){
            return PEsquerda;   // ir para porta da esquerda
        }
        else{
            return PRede;   // pacote chegou ao destino
        }

        //TODO - Função para transferir os pacotes de um buffer para outro
        // TESTANDO (função de transferir pacote do buffer pra saída)
        //TODO - Função para quando chegar ao destino escrever em arquivo
    }

    public void transferirPacote (Pacote pacote) {
        Porta portaDeSaida = roteamento(pacote);

        portaDeSaida.setSaida(pacote);
        bufferDeEntrada.remove(pacote);

        portaDeSaida.getRoteadorDestino().bufferDeEntrada.add(pacote);
    }
}
