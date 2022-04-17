package Login;

public class Procesador extends Dispositivo{
    private int Nucleos;
    private double consumo_W;
    private double cache_Mb;
    private String nEmpresa;

    public Procesador(int Nucleos, double consumo_W, double cache_Mb, String marca, double precio, int antiguedad, int stockEmpresa, int codigo,String nEmpresa) {
        super(marca, precio, antiguedad, stockEmpresa, codigo,nEmpresa);
        this.Nucleos = Nucleos;
        this.consumo_W = consumo_W;
        this.cache_Mb = cache_Mb;
    }

    public int getNucleos() {
        return Nucleos;
    }

    public void setNucleos(int Nucleos) {
        this.Nucleos = Nucleos;
    }

    public double getConsumo_W() {
        return consumo_W;
    }

    public void setConsumo_W(double consumo_W) {
        this.consumo_W = consumo_W;
    }

    public double getCache_Mb() {
        return cache_Mb;
    }

    public void setCache_Mb(double cache_Mb) {
        this.cache_Mb = cache_Mb;
    }

    public String getnEmpresa() {
        return nEmpresa;
    }

    public void setnEmpresa(String nEmpresa) {
        this.nEmpresa = nEmpresa;
    }
    
    
}