package Login;

public class usuarioEmpresa extends Persona {
    private String RUC;
    
    public usuarioEmpresa(String RUC, String nombre,String pass) {
        super(nombre, 0,"", pass);
        this.RUC = RUC;
    }
    
    public void realizarAjuste(){
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    
}