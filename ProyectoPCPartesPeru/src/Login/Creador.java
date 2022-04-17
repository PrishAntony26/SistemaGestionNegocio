package Login;
import java.util.Scanner;

public class Creador{
    Scanner leer = new Scanner (System.in);
    
    //Atributos
    private String usuario;
    private String contrasenia;
    private Menu m;
    
    public Creador(Menu m){
        contrasenia = "FISIUNMSM";
        usuario = "Admin";
        this.m= m;
        m.setM3(this);
    }
    
    public void menu_admin(){
        int opcion;
        do{
        System.out.println("\t\tMENÚ DE ADMINISTRADOR\t\t");
        System.out.println("1. Visualizar ganancias");
        System.out.println("2. Visualizar recórd de ventas");
        System.out.println("3. Salir del programa ");
        System.out.print("\n-> Digite opción: ");
        opcion = leer.nextInt();
        menu_adminFunciones(opcion);
        }while(opcion != 3);
    }
    
    public void menu_adminFunciones(int opcion){
        switch(opcion){
            case 1: 
                visualizarGanancias();
                break;
            case 2:
                visualizarRecordVentas();
                break;
            case 3: 
                System.out.println("Saliendo del programa");
                break; 
            default: 
                System.out.println("Opción errónea");
        }
    }

    public void IniciarSesion(){
        String user,pass;
        System.out.println("\t\t Inicio de sesión \t\t");
        System.out.print("\n Ingrese usuario: ");
        user=leer.nextLine();
        System.out.print("\n Ingrese la contraseña: ");
        pass = leer.nextLine();
        
        if(pass.equals(getPass())){
            System.out.println("Sesión iniciada");
            menu_admin();
        }
        else{
            System.out.println("Error de contraseña");
        }
    }    

    public void visualizarGanancias(){
    
    }
    
    public void visualizarRecordVentas(){
        
    }
    
    //Getter y setter
    public String getPass() {
        return contrasenia;
    }
    public void setPass(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}