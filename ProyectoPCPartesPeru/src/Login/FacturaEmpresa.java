package Login;
import java.io.Serializable;

public class FacturaEmpresa implements Serializable{
    
    private Registrado r;
    private String descripcion[];
    private int codigo[];
    private double precioUnitario[];
    private int cantidad[];
    private String nombreEmpresa[];
    private int numFilasxFactura;
    
    public FacturaEmpresa(String[] descripcion, int[] codigo, double[] precioUnitario, int[] cantidad, String[] nombreEmpresa) {
        this.descripcion = new String[descripcion.length];
        System.arraycopy(descripcion, 0, this.descripcion, 0, descripcion.length);
        setDescripcion(descripcion);
        this.codigo = new int[codigo.length];
        setCodigo(codigo);
        System.arraycopy(codigo, 0, this.codigo, 0, codigo.length);
        this.precioUnitario = new double[precioUnitario.length];
        setPrecioUnitario(precioUnitario);
        System.arraycopy(precioUnitario, 0, this.precioUnitario, 0, precioUnitario.length);
        this.cantidad = new int[cantidad.length];
        setCantidad(cantidad);
        System.arraycopy(cantidad, 0, this.cantidad, 0, cantidad.length);
        this.nombreEmpresa = new String[nombreEmpresa.length];
        setNombreEmpresa(nombreEmpresa);
        System.arraycopy(nombreEmpresa, 0, this.nombreEmpresa, 0, nombreEmpresa.length);
        numFilasxFactura = descripcion.length;
    }
    
    public void creacionFactura(){  
    }

    public int getNumFilasxFactura() {
        return numFilasxFactura;
    }

    public void setNumFilasxFactura(int numFilasxFactura) {
        this.numFilasxFactura = numFilasxFactura;
    }
    
    public String[] getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String[] descripcion) {
        this.descripcion = descripcion;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    public double[] getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double[] precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int[] getCantidad() {
        return cantidad;
    }

    public void setCantidad(int[] cantidad) {
        this.cantidad = cantidad;
    }

    public String[] getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String[] nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    
    /*
    Atributos del producto (Placa Madre, disco duro, etc.)
    Nombre de la empresa
    Nombre del cliente
    cantidad de productos 
    */

    public Registrado getR() {
        return r;
    }

    public void setR(Registrado r) {
        this.r = r;
    }
    
}