package Login;

public class DiscoDuro extends Dispositivo{
    
    private int capacidad;
    private String conexion;
    private String tipo;


    public DiscoDuro(int capacidad, String conexion, String tipo, String marca, double precio, int antiguedad, int stockEmpresa, int codigo,String nEmpresa) {
        super(marca, precio, antiguedad, stockEmpresa, codigo, nEmpresa);
        this.capacidad = capacidad;
        this.conexion = conexion;
        this.tipo = tipo;
    }    

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getConexion() {
        return conexion;
    }

    public void setConexion(String conexion) {
        this.conexion = conexion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}