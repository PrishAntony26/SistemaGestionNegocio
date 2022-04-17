package Login;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Cliente {
    //Declaración de ArrayList
    private ArrayList <Registrado> usuariosR = new ArrayList<Registrado>();
    private ArrayList<HistorialVenta> historiales1 = new ArrayList<HistorialVenta>();
    private ArrayList<HistorialVenta> historiales2 = new ArrayList<HistorialVenta>();
    private ArrayList<HistorialVenta> historiales3 = new ArrayList<HistorialVenta>();

    Scanner leer = new Scanner(System.in);
    
    private Menu m;
    
    public Cliente(Menu m){
        this.m = m;
        m.setM1(this);
    }

    public Cliente() {
    }
    
    public void menu_comprador(){
        int opcion;
        
        do{
        System.out.println("\t\tMENÚ DE COMPRADOR\t\t");
        System.out.println("1. Registrar usuario");
        System.out.println("2. Iniciar sesión");
        System.out.println("3. Ingresar como invitado");
        System.out.println("4. Volver ");
        System.out.print("\n-> Digite opción: ");
        opcion = leer.nextInt();
            switch(opcion){
                case 1: 
                    guardarDatosRegistrado();
                    break;
                case 2: 
                    mostrarArchivo();
                    break;
                case 3:
                    break;
                case 4: System.out.println("volviendo");
                    break; 
            }
        }
        while(opcion != 4);
    }
    
    public void menu_registrados(Registrado r){
        int opcion; 
        System.out.println("\t\tMenu Registrados\t\t");
        System.out.println("\n1. Cotizar y comprar ");
        System.out.println("\n2. Recargarse dinero ");
        System.out.println("\n3. Modificar data");
        System.out.println("\n4. Vizualizar facturas de compras");
        System.out.print("\n Digite la opcion que desee: ");
        opcion = leer.nextInt();
        funcionesMenu_registrados(opcion,r);
    }
    
    public void funcionesMenu_registrados(int opc,Registrado r){
        ArrayList<Integer> ArticuloCotizado = new ArrayList<Integer>(10);
        int nArticulo;
        int auxiliarEmpresaArticulo = 0;
        ArrayList<String> nombreEmpresaComprada = new ArrayList<String>(10);
        String nombre;
        ArrayList<Integer> codigoArticuloComprado = new ArrayList<Integer>(10);
        int cod;
        ArrayList<String> descripcionArticulo = new ArrayList<String>(10);
        String descripcion;
        ArrayList<Double> precioArticuloComprado = new ArrayList<Double>(10);
        double precioUnitario;
        ArrayList<Integer> cantidadCompradaArticulo = new ArrayList<Integer>(10);
        int cantidadC;
        
        int cantidadFilasFactura=0;
        
        ArrayList <PlacaMadre> pMcotiza = new ArrayList<PlacaMadre>();
        
        int desicionCompra;
        ArrayList<Empresa> aux =new ArrayList<Empresa>();
        aux = m.getListaE(); 
        double dinero;
        boolean accionCotizar = true;
        double dineroC = r.getDinero();
        
        switch(opc){
            case 1:
                do{
                
                System.out.println("Ingrese el numero del articulo del articulo que desea cotizar ");
                System.out.println("1. Placa madre");
                System.out.println("2. Memoria RAM");
                System.out.println("3. Procesador ");
                System.out.println("4. Disco Duro");
                System.out.println("5. Tarjeta de video");
                nArticulo= leer.nextInt();
                ArticuloCotizado.add(nArticulo);
                System.out.println("Ingrese la cantidad de dinero con la cual desea cotizar");
                dinero = leer.nextInt();
                Iterator <Empresa> it = aux.iterator();
                Empresa e = null;
                Inventario i = null;
                /*
                Recorrido de las empresas 
                */
                int numObjetosCotizados=0;
                while(it.hasNext()){
                    e = it.next();
                    i = e.getInv();
                    System.out.println("Mostrando los dispositivos en base a la cotizacion ");
                    System.out.println("Nombre de la empresa: "+ e.getNombre());
                    switch(nArticulo){
                        case 1: 
                            ArrayList<PlacaMadre> p = new ArrayList<PlacaMadre>();
                            p = i.rescatarArrayListPlacaMadre(e);
                            Iterator<PlacaMadre> itp = p.iterator();
                            PlacaMadre pM = null;
                            while(itp.hasNext()){
                            pM = itp.next();
                                if(pM.getPrecio()<dinero){
                                    pM.mostrarDispositivo();
                                    /*
                                    A traves del arraylist pMcotiza llenamos los objetos del cual el programa nos ha podido cotizar
                                    independientemente al tipo de empresa a la cual pertenece
                                    */
                                    pMcotiza.add(pM);
                                    numObjetosCotizados++;
                                }
                            }
                        break;
                        
                        case 2: /*Memoria Ram*/
                            break;
                            
                        case 3:
                            break;
                            
                        case 4: 
                            break;
                            
                        case 5:
                            break;
                    }
                }
                /*
                Fin recorrido de empresas
                */
                if(numObjetosCotizados>0){
                    System.out.println("¿Desea realizar una compra? (1.Si/2.No");
                    desicionCompra = leer.nextInt();
                    if(desicionCompra==1){
                    r.realizarCompra(dineroC);
                    System.out.println("Ingrese el nombre de la empresa que desea comprar el articulo ");
                    nombre = leer.next();
                    nombreEmpresaComprada.add(nombre);
                    System.out.println("Ingrese el codigo del articulo ");
                    cod = leer.nextInt();
                    codigoArticuloComprado.add(cod);
                    auxiliarEmpresaArticulo++;
                    int k=0; 
                    /* 
                     Este k va ser el recorrido de todas las placas madre que posea una sola empresa
                    */
                    Iterator<PlacaMadre> it3 = pMcotiza.iterator();
                    PlacaMadre pM2;
                    while(it3.hasNext()){
                        pM2 = it3.next();
                        
                        if(pM2.getnEmpresa().equals(nombre) && pM2.getCodigo()==cod){
                            System.out.println(" Articulo encontrado con exito ");
                            System.out.println(" Ingrese la cantidad que desee comprar ");
                            cantidadC = leer.nextInt();
                            cantidadCompradaArticulo.add(cantidadC);
                            pMcotiza.get(k).setStockEmpresa(pMcotiza.get(k).getStockEmpresa()-cantidadC);
                            double precioT = pMcotiza.get(k).getPrecio()*cantidadC;
                            precioUnitario = pMcotiza.get(k).getPrecio();
                            precioArticuloComprado.add(precioUnitario);
                            if(precioT <= r.getDinero()){
                      
                                /*
                                Lo que vamos a realizar debajo es la funcion de actualizar datos del stock del producto 
                                ya que como hemos vendido este debera de disminuir
                                Primero entramos a la empresa en especifico la cual vamos a comprar el articulo, luego a traves
                                del codigo del producto podremos identificar a ese articlo en especial entre muchos que tiene
                                una empresa en lo referente a PlacaMadre
                                */
                                Iterator<Empresa> it5 = aux.iterator();
                                Empresa empr = null;
                                Inventario in = null;
                                while(it5.hasNext()){
                                    empr = it5.next();
                                    if(empr.getNombre().equals(nombre)){
                                        in = empr.getInv();
                                        ArrayList<PlacaMadre> aux3 = new ArrayList<PlacaMadre>();
                                        aux3 = in.rescatarArrayListPlacaMadre(empr);
                                        int p = 0;
                                        Iterator<PlacaMadre> it6 = aux3.iterator();
                                        PlacaMadre pMD = null;
                                        while(it6.hasNext()){
                                            pMD = it6.next();
                                            if(pMD.getCodigo()==cod){
                                                 aux3.get(p).setStockEmpresa(aux3.get(p).getStockEmpresa()-cantidadC);
                                                 descripcion = "Placa madre"+" "+aux3.get(p).getMarca()+" "+aux3.get(p).getTipo()+" ";
                                                 descripcionArticulo.add(descripcion);
                                                 
                                            }
                                             p++;
                                        }
                              
                                        
                                        in.actualizarDatos(aux3, empr);
                                        /*
                                        Con esto se actualizara en los archivos el stock de memoria ram 
                                        Aqui podria ir la funcion de generar una factura para la empresa 
                                        */
                                        
                                    }
                                }
                                /*
                                    Lo que vamos hacer aca es actualizar los datos de los registrados en lo referente al dinero
                                */
                                cantidadFilasFactura++;
                                ArrayList<Registrado> aux2 = new ArrayList<Registrado>();
                                aux2 = rescatarRegistrados();
                                Iterator<Registrado> it4 = aux2.iterator();
                                int j = 0;
                                Registrado re = null;
                                while(it4.hasNext()){
                                    re = it4.next();
                                    String user = re.getUser();
                                    String pass = re.getPass();
                                    if(r.getUser().equals(user) && r.getPass().equals(pass)){
                                        aux2.get(j).setDinero(aux2.get(j).getDinero()-precioT);
                                        System.out.println(" Compra exitosa ");
                                        System.out.println("cantidadFilas" + cantidadFilasFactura);
                                        /*
                                        AÑADIR LA FUNCION DE FACTURA para el usuario Registrado 
                                        */
                                        aux2.get(j).añadirFactura(nombreEmpresaComprada, codigoArticuloComprado, descripcionArticulo, precioArticuloComprado, cantidadCompradaArticulo, cantidadFilasFactura);
                                    }
                                    j++;
                                }
                                leerCambioDineroRegistrado(aux2);
                                
                            }else{
                                accionCotizar=false;
                                nombreEmpresaComprada.remove(auxiliarEmpresaArticulo-1);
                                codigoArticuloComprado.remove(auxiliarEmpresaArticulo-1);
                                auxiliarEmpresaArticulo--;
                                System.out.println(" No tiene suficiente dinero para comprar el/los articulos");
                                
                            }
                        }
                        k++;
                    }
                     System.out.println(" ¿Desea agregar otra cotizacion? (1.si/2.no)" );
                     int numCotizacion = leer.nextInt();
                     if(numCotizacion==1){
                         pMcotiza.clear();
                         nombreEmpresaComprada.clear();
                         codigoArticuloComprado.clear();
                         descripcionArticulo.clear();
                         precioArticuloComprado.clear();
                         cantidadCompradaArticulo.clear();
                         cantidadFilasFactura--;
                     }
                    else{
                        accionCotizar=false;
                    }
                     
                    }
                    else{
                        pMcotiza.clear(); 
                        accionCotizar = false;/* 
                      
                        Como no va a comprar ya no seria necesario guardar los dispositivos cotizados en el arrayList es por eso que lo limpiamos .clear()
                        */
                    }  
                }
                else{
                    System.out.println(" No se pudo encontrar dispositivos para el presupuesto que ha ingresado ");
                }
                
                }
                while(accionCotizar);
                
            break;
                
            case 2: recargarDinero(r);
                break;
                
            case 3:
                break;
                
            case 4:
                ArrayList<Registrado> aux2 = new ArrayList<Registrado>();
                                aux2 = rescatarRegistrados();
                                Iterator<Registrado> it4 = aux2.iterator();
                                int j = 0;
                                Registrado re = null;
                                while(it4.hasNext()){
                                    re = it4.next();
                                    String user = re.getUser();
                                    String pass = re.getPass();
                                    if(r.getUser().equals(user) && r.getPass().equals(pass)){
                                        aux2.get(j).mostrarFactura();
                                    }
                                    j++;
                                }
                break;
       }
    }
    /*
    PARA CAMBIAR LOS atributos de objetos DE UN ARRAYLIST DE OBJETOS DEBEMOS CAMBIARLO DESDE EL ARRAYLIST
    A TRAVES DE (Nombre del arraylist de objeto).get("Elemento que quiero cambiar tipo entero").setAtributo()
    LO MISMO SERIA PARA EL GET.
    MIRAR EJEMPLO DEL METODO recargarDinero(Registrado r)
    
    */
    public void recargarDinero(Registrado r){
        double montoR;
        ArrayList<Registrado> aux = new ArrayList<Registrado>();
        aux = rescatarRegistrados();
        Iterator<Registrado> it = aux.iterator();
        Registrado re = null;
        int i=0;
        while(it.hasNext()){
            re = it.next();
            String user = re.getUser();
            String pass = re.getPass();
            if(r.getUser().equals(user) && r.getPass().equals(pass)){
                String monto = JOptionPane.showInputDialog("  Usted cuenta con: "+ aux.get(i).getDinero()+
                        "\n Ingrese el monto que desea recargar ");
                if(monto==null){
                    
                }else{
                montoR= Double.parseDouble(monto);
                JOptionPane.showMessageDialog(null, "Recarga realizada de forma exitosa ");
                r.setDinero(montoR + aux.get(i).getDinero());
                aux.get(i).setDinero(montoR + aux.get(i).getDinero());
                }
            }
            i++;
        }
        leerCambioDineroRegistrado(aux);
    }
    
    public void leerCambioDineroRegistrado(ArrayList<Registrado> r){
        try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Usuarios\\usuariosRegistrados.txt"));
            salida.writeObject(r);
            salida.close();
        }catch(IOException e){
            System.out.println("error");
        }
    }
    
    public Registrado registrarR(){
        String nombre,user,pass,direccion;
        int DNI;
        long telefono;
        double dinero = 0;
        System.out.println("Digite los siguientes datos ");
        leer.nextLine();
        System.out.print("Nombre: ");
        nombre = leer.nextLine();
        System.out.print("DNI: ");
        DNI = leer.nextInt();
        leer.nextLine();
        System.out.print("Usuario: ");
        user = leer.nextLine();
        System.out.print("Contraseña: ");
        pass = leer.nextLine();
        System.out.print("Número telefónico: ");
        telefono = leer.nextLong();
        leer.nextLine();
        System.out.print("Dirección: ");
        direccion = leer.nextLine();
        Registrado r = new Registrado(telefono,direccion,nombre, DNI, user, pass, dinero);
        return r; 
    }
    
    public void guardarDatosRegistrado(){
        Registrado ra = registrarR();
        ArrayList<Registrado> aux2 = rescatarRegistrados();
        if(aux2==null){
            try{
            usuariosR.add(ra);
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Usuarios\\usuariosRegistrados.txt"));
            salida.writeObject(usuariosR);
            salida.close();
            }catch(IOException e){
            System.out.println("Error¡¡¡¡¡");
            }
            System.out.println("Creado de forma exitosa");
        }else{
            try{
            aux2.add(ra);
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Usuarios\\usuariosRegistrados.txt"));
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
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Registros\\Usuarios\\usuariosRegistrados.txt"));
            ArrayList<Registrado> r1 = (ArrayList<Registrado>)entrada.readObject();
            IniciarSesion(r1);
            entrada.close();
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("ERROR a");
        }catch(ClassNotFoundException e1){
            System.out.println("ERROR b");
        }
    }
     
    public ArrayList<Registrado> rescatarRegistrados(){
        try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Registros\\Usuarios\\usuariosRegistrados.txt"));
            ArrayList<Registrado> r = (ArrayList<Registrado>)entrada.readObject();
            return r;
        }catch(IOException | ClassNotFoundException e){
            return null;
        }  
    }
    
    public void IniciarSesion(ArrayList<Registrado> reg){
        String user,pass;
        leer.nextLine();
        System.out.print("Ingrese el usuario: ");
        user = leer.nextLine();
        System.out.print("Ingrese la contraseña: ");
        pass = leer.nextLine();
        Iterator <Registrado> it = reg.iterator();
        Registrado re = null;
        System.out.println("TAMAÑO "+ reg.size());
        int i = 0;
        boolean aux = true;
        while(it.hasNext()){
            re = it.next();
            if(user.equals(re.getUser()) && pass.equals(re.getPass())){
                System.out.println("\n Sesion Iniciada satisfactoriamente");
                System.out.println("  Bienvenido  "+ reg.get(i).getNombre());
                System.out.println(" Su dinero es de : "+ reg.get(i).getDinero());
                menu_registrados(re);
            }else{
                aux = false;
            }
            i++; 
        }
        if(!aux){
        System.out.println("\n Usuario o contraseña incorrectos");
        }
    }
    
    public void IniciarSesiónInvitado(){
        String user,pass;
        System.out.print("\n Ingrese nombre de usuario: ");
        user = leer.next();
        System.out.println("\n Ingrese la contraseña: ");
        pass = leer.next();
        Invitado i = new Invitado(" ",0,user,pass);
        MenuInvitado(i);
    }
    
    public void MenuInvitado(Invitado a){
        int opcion; 
        do{
        System.out.print("\t\tMenu Registrados\t\t");
        System.out.print("\n1. Cotizar ");
        opcion = leer.nextInt();
        System.out.print("\n2. Volver ");
        System.out.print("\n-> Digite opción: ");
        opcion = leer.nextInt();
        switch(opcion){
            case 1: 
                guardarDatosRegistrado();
                break;
            case 2: 
                mostrarArchivo();
                break;
            case 3:
                System.out.println("FUNCION COTIZAR");
                break;
            case 4: System.out.println("volviendo");
                break; 
        }
        }while(opcion != 2);
    }
    
    public void EscrituraHistorialVenta(Empresa e,HistorialVenta a){
        ArrayList<HistorialVenta> aux = new ArrayList<HistorialVenta>();
        aux = rescatarHistorialVenta1(e);
       if(e.getNombre().equals("TECHCOMPU")){
        if(aux==null){
        try{
              historiales1.add(a);
              ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\HistorialVenta\\E1\\VentasEmpresaTECHCOMPU.txt"));
              salida.writeObject(historiales1);
              salida.close();
        }catch(IOException e1){
            
        }
       }else{
        try{
             aux.add(a);
             ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\HistorialVenta\\E1\\VentasEmpresaTECHCOMPU.txt"));
             salida.writeObject(aux);
             salida.close();
        }catch(IOException e1){
            
        }  
       }
       }
       if(e.getNombre().equals("Yamoshi")){
        if(aux==null){
        try{
              historiales2.add(a);
              ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\HistorialVenta\\E2\\VentasEmpresaYamoshi.txt"));
              salida.writeObject(historiales2);
              salida.close();
        }catch(IOException e1){
            
        }
        }else{
        try{
             aux.add(a);
             ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\HistorialVenta\\E2\\VentasEmpresaYamoshi.txt"));
             salida.writeObject(aux);
             salida.close();
        }catch(IOException e1){
            
        }  
       }
       }
       if(e.getNombre().equals("MiPClista")){
        if(aux==null){
        try{
              historiales3.add(a);
              ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\HistorialVenta\\E3\\VentasEmpresaMiPclista.txt"));
              salida.writeObject(historiales3);
              salida.close();
        }catch(IOException e1){
            
        }
       }else{
        try{
             aux.add(a);
             ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\HistorialVenta\\E3\\VentasEmpresaMiPclista.txt"));
             salida.writeObject(aux);
             salida.close();
        }catch(IOException e1){
            
        }  
       }
       }
    }
    
    public ArrayList<HistorialVenta> rescatarHistorialVenta1(Empresa e){
        if(e.getNombre().equals("TECHCOMPU")){
        try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Registros\\HistorialVenta\\E1\\VentasEmpresaTECHCOMPU.txt"));
            ArrayList<HistorialVenta> r = (ArrayList<HistorialVenta>)entrada.readObject();
            return r;
        }
        catch(IOException | ClassNotFoundException e1){
            return null;
        }
        }
        if(e.getNombre().equals("Yamoshi")){
        try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Registros\\HistorialVenta\\E2\\VentasEmpresaYamoshi.txt"));
            ArrayList<HistorialVenta> r = (ArrayList<HistorialVenta>)entrada.readObject();
            return r;
        }
        catch(IOException | ClassNotFoundException e1){
            return null;
           }   
          }
        if(e.getNombre().equals("MiPClista")){
        try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Registros\\HistorialVenta\\E3\\VentasEmpresaMiPclista.txt"));
            ArrayList<HistorialVenta> r = (ArrayList<HistorialVenta>)entrada.readObject();
            return r;
         }
        catch(IOException | ClassNotFoundException e1){
            return null;
         }   
        }
        return null;
    }
    
}