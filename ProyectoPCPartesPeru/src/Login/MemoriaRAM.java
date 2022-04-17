package Login;

public class MemoriaRAM extends Dispositivo{
    private double f_Hz;
    private String tipo;
    private double capacidad;
    private String nEmpresa;

    public MemoriaRAM(double f_Hz, String tipo, double capacidada, String marca, double precio, int antiguedad, int stockEmpresa, int codigo,String nEmpresa) {
        super(marca, precio, antiguedad, stockEmpresa, codigo,nEmpresa);
        this.f_Hz = f_Hz;
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public double getF_Hz() {
        return f_Hz;
    }

    public void setF_Hz(double f_Hz) {
        this.f_Hz = f_Hz;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public String getnEmpresa() {
        return nEmpresa;
    }

    public void setnEmpresa(String nEmpresa) {
        this.nEmpresa = nEmpresa;
    }
    
}