package Login;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Administrador{
    int i=0;
    String []usuarios = new String[3] ;
    Scanner leer = new Scanner(System.in);
    
    //Atributos 
    private ArrayList<usuarioEmpresa> usuariosE = new ArrayList<usuarioEmpresa>();
    private String pass;
    private Menu m;
    boolean boo=true;
    
    //Constructor
    public Administrador(Menu m){
        this.m = m;
        m.setM2(this);
    }
    
    public void menu_1(){
        int op;
        System.out.println("\t\tMENU");
        System.out.println("\n1. Iniciar Sesion");
        System.out.println("\n2. Crear Usuario");
        System.out.println("\n3. Volver");
        System.out.print("\n Digite la opcion que desee: ");
        op=leer.nextInt();
       
        switch(op){
            case 1:
                mostrarArchivo();
                break;
            case 2:
                guardarDatosRegistrado();
                break;
            case 3: 
                mostrarUsuarioEmpresa();
                break;
        }
    }
    
    public void menu_Empresa(usuarioEmpresa empresa){
        int opcion; 
        System.out.println("\t\tMenu Empresa\t\t");
        System.out.println("\n1. Realizar ajuste ");
        System.out.println("\n2. Modificar data");
        System.out.println("\n3. Cerrar sesión");
        System.out.print("\n Digite la opcion que desee: ");
        opcion = leer.nextInt();
        
        switch(opcion){
            case 1:
                ArrayList<Empresa> auxEmpresa = new ArrayList<Empresa>();
                Inventario i;
                auxEmpresa = m.getListaE();
                System.out.println("numero "+auxEmpresa.size());
                int opc;
                int opc2;
                int opc3;
                int codigo;
                int nPrecio;
                Iterator<Empresa> it = auxEmpresa.iterator();
                Empresa e = null;
                
                while(it.hasNext()){
                    e = it.next();
                    
                    if(e.getRUC().equals(empresa.getRUC())){
                        /*
                        Aqui estamos igualandado a que empresa pertenece exactamente un usuarioEmpresa 
                        */
                        i = e.getInv();
                        /*
                        Con esto estamos llamando a la clase inventario a traves del objeto i 
                        */
                        System.out.println(" Usted pertenece a la empresa "+ e.getNombre());
                        System.out.println(" Ingrese la opción que desea realizar ");
                        System.out.println("   1. Adicionar un dispositivo");
                        System.out.println("   2. Cambiar alguna caracteristica de un dispositivo ");
                        opc = leer.nextInt();
                        System.out.println(" el valor de boo "+ boo);
                           /* i.PlacaMadreDefecto(e);*/
                        switch(opc){
                            case 1: 
                                System.out.println("Ingresando nuevo dispositivo ");
                                System.out.println("   1. Placa madre");
                                System.out.println("   2. Memoria RAM");
                                opc2 = leer.nextInt();
                                    switch(opc2){
                                        case 1: i.añadirArchivoPlacaMadre(e);
                                                break;
                                        case 2: /*i.IngresarRAM();*/
                                                break;
                                    }
                            break;
                            
                            case 2: 
                                System.out.println(" Ingrese el numero de dispositibo que desea cambiar de caracteristicas ");
                                System.out.println("1. Placa madre ");
                                System.out.println("2. Memoria RAM ");
                                opc3 = leer.nextInt();
                                System.out.print("Mostrando todos los dispositivos de ");
                                    switch(opc3){
                                        case 1: 
                                            System.out.print(" Placa madre ");
                                            ArrayList<PlacaMadre> p = new ArrayList<PlacaMadre>();
                                            p = i.rescatarArrayListPlacaMadre(e);
                                            Iterator<PlacaMadre> it2 = p.iterator();
                                            PlacaMadre pM = null;
                                                while(it2.hasNext()){
                                                    pM = it2.next();
                                                    System.out.println("\n Codigo "+ pM.getCodigo() +"\n Marca del dispositivo "+ pM.getMarca() +"\n Precio: "+
                                                    pM.getPrecio() + "\n Antiguedad: "+ pM.getAntiguedad() + "\n Stock "+ pM.getStockEmpresa() + 
                                                    "\n Chipset: "+ pM.getChipset() + "\n Formato "+ pM.getFormato());
                                                    System.out.println("********************************");
                                                }
                                                /*
                                                Con esto estamos creando un arraylist para que a traves de esta se pueda almacenar el arraylist
                                                que se encuentra en el inventario especificamente arraylist placamadre
                                                
                                                ArrayList<PlacaMadre> pMa = new ArrayList<PlacaMadre>();
                                                /*
                                                
                                                */
                                                /*
                                                Iterator<PlacaMadre> it2 = pMa.iterator();
                                                PlacaMadre p = null;
                                                while(it2.hasNext()){
                                                    p = it2.next();
                                                    p.mostrarDispositivo();
                                                }
                                                */
                                                /*
                                                System.out.print(" Ingrese el codigo del dispositivo que desea cambiar ");
                                                codigo = leer.nextInt();
                                                Iterator<PlacaMadre> it2 = pMa.iterator();
                                                PlacaMadre p = null;
                                                while(it2.hasNext()){
                                                    p = it2.next();
                                                    if(p.getCodigo()==codigo){
                                                        System.out.println("Mostrando datos de la placa madre ");
                                                        System.out.println("Marca del dispositivo "+ p.getMarca() +"\n Precio: "+
                                                        p.getPrecio() + "\n Antiguedad: "+ p.getAntiguedad() + "\nStock "+ p.getStockEmpresa() + 
                                                        "\n Chipset: "+ p.getChipset() + "\n Formato "+ p.getFormato());
                                                        System.out.println("Ingrese la cantidad de dinero que desea cambiar ");
                                                        nPrecio = leer.nextInt();
                                                        p.setPrecio(nPrecio);
                                                        System.out.println("Cambio guardado de forma exitosa¡¡¡¡");
                                                    }
                                                }
                                            */
                                        break;
                                        
                                        case 2: /*
                                                  Mostrar Dispositivo de Memoria RAM
                                            */
                                            break;
                                            
                                        case 3:
                                            break;
                                            
                                        case 4: 
                                            break;
                                            
                                        case 5:
                                            break;
                                    }
                        }
                    }
                }
                break;
                
            case 2:
                modificarData(empresa);
                break;
                
            case 3: System.out.println("asd");
                break;
                
            default:
                System.out.println("Opción errónea");
        }
    }
    
    public void IniciarSesion(ArrayList<usuarioEmpresa> e){
        String pass;
        String user;
        System.out.println("\t\t Inicio de sesión \t\t");
        System.out.print("\n Ingrese el usuario: ");
        user = leer.next();
        System.out.print("\n Ingrese la contraseña: ");
        pass = leer.next();
        System.out.println("datos digitados "+ user+ "  "+ pass);
        Iterator <usuarioEmpresa> it = e.iterator();
        usuarioEmpresa r = null;
        
        while(it.hasNext()){
            r = it.next();
            if(user.equals(r.getRUC()) && pass.equals(r.getPass())){
                System.out.println("\n Sesion Iniciada satisfactoriamente");
                menu_Empresa(r);
            }
        }
        System.out.println("Usuario o contraseña incorrectos ");
    }
    
    public usuarioEmpresa RegistrarE(){
        String nombre, pass;
        String user,RUC;
        int k=0;
        System.out.println("Digite los siguientes datos ");
        leer.nextLine();
        
        do{
            System.out.print("\n RUC: ");
            RUC = leer.next();
            user=RUC;
            leer.nextLine();
            for(int j=0;j<3;j++){
                if(RUC==usuarios[j]){
                    k++;
                }
            }
            if(k!=0){
                System.out.println("RUC YA REGISTRADO");
                menu_1();
            }
        }
        while(k!=0);
        
        usuarios[i]=RUC;
        i++;
        //
        System.out.println("Ingrese su nombre:");
        nombre=leer.next();
        System.out.print("\n Contraseña: ");
        pass = leer.next();
        usuarioEmpresa empresa = new usuarioEmpresa(RUC,nombre, pass);
        System.out.println("UTILICE SU RUC COMO SU USUARIO");
        return empresa;
    }  
    
    public void mostrarUsuarioEmpresa(){
        Iterator <usuarioEmpresa> it = usuariosE.iterator();
        usuarioEmpresa uE = null;
        System.out.println("\t\t Mostrando lista de usuarios Empresa\t\t");
        
        while(it.hasNext()){
            uE = it.next();
            System.out.println("\n Nombre: "+uE.getNombre());
            System.out.println("\n DNI: "+uE.getDNI());
            System.out.println("\n Usuario: "+uE.getRUC());
            System.out.println("\n Contraseña: "+uE.getPass());
        }
    }
    
    public void modificarData(usuarioEmpresa empresa){
        System.out.println("1. Usuario");
        System.out.println("2. Contraseña");
        System.out.println("3. Número telefónico");
        
        System.out.print("\n-> Digite dato a modificar: ");
        int opc = leer.nextInt();
        
        switch(opc){
            case 1:
                System.out.print("Digite nuevo usuario: ");
                String usuario = leer.nextLine();
                empresa.setNombre(usuario);
                break;
                
            case 2:
                System.out.print("Digite nueva contraseña: ");
                String contraseña = leer.nextLine();
                empresa.setPass(contraseña);
                break;
                
            default:
                System.out.println("Opción errónea");
        }
    }
    
    public void guardarDatosRegistrado(){
        usuarioEmpresa ra = RegistrarE();
        ArrayList<usuarioEmpresa> aux2 = rescatarusuarioEmpresa();
        
        if(aux2==null){
            try{
            usuariosE.add(ra);
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Usuarios\\usuariosEmpresa.txt"));
            salida.writeObject(usuariosE);
           /* salida.writeUnshared(i); */
            salida.close();
            }catch(IOException e){
            System.out.println("Error¡¡¡¡¡");
            }
            System.out.println("Creado de forma exitosa");
        }
        else{
            try{
            aux2.add(ra);
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Usuarios\\usuariosEmpresa.txt"));
            salida.writeObject(aux2);
            salida.close();
            }catch(IOException e){
            System.out.println("Error¡¡¡¡¡");
            }
            System.out.println("Creado de forma exitosa");
        }
    }
    
    public void mostrarArchivo(){
        try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Registros\\Usuarios\\usuariosEmpresa.txt"));
            ArrayList<usuarioEmpresa> r = (ArrayList<usuarioEmpresa>)entrada.readObject();
            IniciarSesion(r);
            entrada.close();
        }
        catch(IOException e){
            e.printStackTrace();
            System.out.println("ERROR a");
        }
        catch(ClassNotFoundException e1){
            System.out.println("ERROR b");
        }
    }
    
    public ArrayList<usuarioEmpresa> rescatarusuarioEmpresa(){
        try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Registros\\Usuarios\\usuariosEmpresa.txt"));
            ArrayList<usuarioEmpresa> r = (ArrayList<usuarioEmpresa>)entrada.readObject();
            return r;
        }
        catch(IOException | ClassNotFoundException e){
            return null;
        }  
    }
}