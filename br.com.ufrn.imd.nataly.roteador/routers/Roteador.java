package routers;

import conections.*;

public class Roteador extends DispositivoDeRede implements Roteamento {

    private int posI;
    private int posJ;
    public Porta PCima;
    public Porta PBaixo;
    public Porta PEsquerda;
    public Porta PDireita;
    public Porta PRede;


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

    public int roteamento(Pacote pacote){

        int i = pacote.getIdestino();
        int j = pacote.getJdestino();

        if(posI > i){
            return 1;   // 1 - ir para porta de cima
        }
        else if(posI < i){
            return 2;   // 2 - ir para porta de baixo
        }
        else if(posJ < j){
            return 3;   // 3 - ir para porta da direita
        }
        else if(posJ > j ){
            return 4;   // 3 - ir para porta da esquerda
        }
        else{
            return 0;   //0 - pacote chegou ao destino
        }

        //TODO - Função para transferir os pacotes de um buffer para outro
        //TODO - Função para quando chegar ao destino escrever em arquivo
    }
}
