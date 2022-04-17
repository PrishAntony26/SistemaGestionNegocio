package Login;
import java.io.Serializable;

public class Dispositivo implements Serializable{
    protected String marca;
    protected double precio;
    protected int antiguedad;
    protected int stockEmpresa;
    protected int codigo;
    protected String nEmpresa;

    public Dispositivo(String marca, double precio, int antiguedad, int stockEmpresa,int codigo,String nEmpresa){
        this.marca = marca;
        this.precio = precio;
        this.antiguedad = antiguedad;
        this.stockEmpresa = stockEmpresa;
        this.codigo = codigo;
        this.nEmpresa = nEmpresa;
    }
    
    public void mostrarDispositivo(){
        System.out.println("Marca del dispositivo "+ marca +"\n Precio: "+
                precio + "\n Antiguedad: "+ antiguedad + "\nStock "+ stockEmpresa);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getStockEmpresa() {
        return stockEmpresa;
    }

    public void setStockEmpresa(int stockEmpresa) {
        this.stockEmpresa = stockEmpresa;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getnEmpresa() {
        return nEmpresa;
    }

    public void setnEmpresa(String nEmpresa) {
        this.nEmpresa = nEmpresa;
    }
    
    
}