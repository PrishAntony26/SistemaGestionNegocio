package Login;

import java.io.Serializable;

public class Persona implements Serializable{
    private String nombre;
    private int DNI;
    private String user;
    private String pass;

    public Persona(String nombre, int DNI, String user, String pass) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.user = user;
        this.pass = pass;
    }

    public Persona(){
        
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}