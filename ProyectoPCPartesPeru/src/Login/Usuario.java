package Login;

public abstract class Usuario extends Persona {

    public Usuario(String nombre, int DNI, String user, String pass) {
        super(nombre, DNI, user, pass);
    }
    public Usuario(){
        
    }
    public abstract void cotizar(String nombreArticulo,double dinero);
}