package conections;

public class Pacote {

    private String dados;
    private String destino;
    private int Idestino;
    private int Jdestino;

    public String getDados() {
        return dados;
    }

    public void setDados(String dados) {
        this.dados = dados;
    }

    public void setDestino(String IPDestino){
        this.destino = IPDestino;
    }

    public String getDestino(){
        return this.destino;
    }

    public void setPosicaoDestino(int i, int j){
        this.Idestino = i;
        this.Jdestino = j;
    }

    public int getIdestino() {
        return Idestino;
    }

    public int getJdestino() {
        return Jdestino;
    }

}
