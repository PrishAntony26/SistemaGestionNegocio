package Login;

public class Invitado extends Usuario{

    public Invitado(String nombre, int DNI, String user, String pass) {
        super(nombre, DNI, user, pass);
    }
   
    @Override 
    public void cotizar(String nombreArticulo,double dinero){
        
    }
}