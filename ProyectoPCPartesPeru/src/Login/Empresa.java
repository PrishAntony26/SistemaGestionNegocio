package Login;

public class Empresa {
    
    //Atributos
    private String nombre;
    private String RUC;
    private Inventario inv;
    

    public Empresa(String nombre, String RUC) {
        this.nombre = nombre;
        this.RUC = RUC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    

    public Inventario getInv() {
        return inv;
    }

    public void setInv(Inventario inv) {
        this.inv = inv;
    }
}