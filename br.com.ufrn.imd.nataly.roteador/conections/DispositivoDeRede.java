package conections;

public abstract class DispositivoDeRede {

    protected String IP;
    protected String MAC;

    public abstract String getIP();

    public abstract void setIP(String IP);

    public abstract String getMAC();

    public abstract void setMAC(String MAC);

}
