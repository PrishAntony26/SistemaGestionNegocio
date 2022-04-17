package Login;

public class PlacaMadre extends Dispositivo{
    private String chipset;
    private String formato;
    private String tipo;

    public PlacaMadre(String chipset, String formato, String tipo, String marca, double precio, int antiguedad, int stockEmpresa, int codigo, String nEmpresa) {
        super(marca, precio, antiguedad, stockEmpresa, codigo, nEmpresa);
        this.chipset = chipset;
        this.formato = formato;
        this.tipo = tipo;

    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    
    
    
    @Override
    public void mostrarDispositivo(){
        System.out.println("Marca del dispositivo "+ marca +"\n Codigo "+ codigo +"\n Precio: "+
                precio + "\n Antiguedad: "+ antiguedad + "\n Stock "+ stockEmpresa + 
                "\n Chipset: "+ chipset + "\n Formato "+ formato);
    }
}