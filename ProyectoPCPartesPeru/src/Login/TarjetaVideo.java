package Login;

public class TarjetaVideo extends Dispositivo {
    private String modelo;
    private String puerto;
    private double memoria;
    private String nEmpresa;

    public TarjetaVideo(String modelo, String puerto, double memoria, String marca, double precio, int antiguedad, int stockEmpresa, int codigo,String nEmpresa) {
        super(marca, precio, antiguedad, stockEmpresa, codigo,nEmpresa);
        this.modelo = modelo;
        this.puerto = puerto;
        this.memoria = memoria;
    }   

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public double getMemoria() {
        return memoria;
    }

    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }

    public String getnEmpresa() {
        return nEmpresa;
    }

    public void setnEmpresa(String nEmpresa) {
        this.nEmpresa = nEmpresa;
    }
    
    
}