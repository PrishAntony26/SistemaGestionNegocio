package Login;
import java.util.*;
import java.util.Scanner;

public class Menu {
    
    private Cliente m1;
    private Administrador m2;
    private Creador m3;
    private ArrayList<Empresa> listaE = new ArrayList<Empresa>();
    private FacturaEmpresa FE;
            
    public Cliente getM1() {
        return m1;
    }

    public void setM1(Cliente m1) {
        this.m1 = m1;
    }

    public Administrador getM2() {
        return m2;
    }

    public void setM2(Administrador m2) {
        this.m2 = m2;
    }

    public Creador getM3() {
        return m3;
    }

    public void setM3(Creador m3) {
        this.m3 = m3;
    }
    
    public void menu_principal(){
        Scanner leer = new Scanner (System.in);
        insertarEmpresasInventario();
        Inventario in = null;
        /*
        Para que se pueda leer a los objetos que estan por defecto 
        */
        Iterator<Empresa> it = listaE.iterator();
        Empresa e = null;
        while(it.hasNext()){
            e = it.next();
            if(e.getRUC()=="20550626927"){
                in = e.getInv();
                in.PlacaMadreDefecto(e);
            }
        }
        
        int opcion;
        do{
            System.out.println("\t\tPROGRAMA DE VENTAS");
            System.out.println("1. Ingrese como usuario");
            System.out.println("2. Ingrese como empresa");
            System.out.println("3. Ingrese como administrador");
            System.out.println("4. Salir del programa");
            System.out.print("\n-> Digite opción: ");
            opcion = leer.nextInt();
            menu_principalFunciones(opcion);
        }
        while(opcion!=4);
    }
    
    public void EmpresasDefecto(){
        insertarEmpresasInventario();
        Inventario in = null;
        /*
        Para que se pueda leer a los objetos que estan por defecto 
        */
        Iterator<Empresa> it = listaE.iterator();
        Empresa e = null;
        while(it.hasNext()){
            e = it.next();
            if(e.getRUC()=="20550626927"){
                in = e.getInv();
                in.PlacaMadreDefecto(e);
            }
        }
    } 
            
    public void menu_principalFunciones(int opcion){
        switch(opcion){
            case 1:
                m1.menu_comprador();
                break;
            case 2:
                m2.menu_1();
                break;
            case 3:
                m3.IniciarSesion();
                break;
        }
    }
    
    public void insertarEmpresasInventario(){
        Empresa e1 = new Empresa("TECHCOMPU","20550626927");
        Empresa e2 = new Empresa("Yamoshi","20511068496");
        Empresa e3 = new Empresa("MiPClista","20451830768");
        Inventario i1 = new Inventario(111111,e1);
        Inventario i2 = new Inventario(222222,e2);
        Inventario i3 = new Inventario(333333,e3);
        listaE.add(e1);
        listaE.add(e2);
        listaE.add(e3);
    }

    public ArrayList<Empresa> getListaE() {
        return listaE;
    }

    public void setListaE(ArrayList<Empresa> listaE) {
        this.listaE = listaE;
    }
    /*
    Usuario empresa user: 123(RUC) pass: 123
    */
}