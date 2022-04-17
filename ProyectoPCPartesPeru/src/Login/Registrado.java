package Login;

import java.util.ArrayList;

public class Registrado extends Usuario{
    private static final long serialVersionUID = 1L;
    private long telefono;
    private String direccion;
    private double dinero; 
   /* private FacturaEmpresa facturas[];*/
    private ArrayList<FacturaEmpresa> facturas = new ArrayList<FacturaEmpresa>();
   /*
    int a1=0;
    int numFacturas;
    */
    public Registrado(){
        
    }
    
    public Registrado(long telefono, String direccion, String nombre, int DNI, String user, String pass,double dinero) {
        super(nombre, DNI, user, pass);
        this.telefono = telefono;
        this.direccion = direccion;
        this.dinero = dinero;
        /*
        facturas = new FacturaEmpresa[10];
        numFacturas =0;
        */
    }

    
    public ArrayList<FacturaEmpresa> getFacturas() {
        return facturas;
    }

    public void setFacturas(ArrayList<FacturaEmpresa> facturas) {
        this.facturas = facturas;
    }
    
    
    /*
    public void adicionarFactura(ArrayList<Empresa> p,int cantidadV,int cantidadCompras, String nombreEmpresa, int opcion,int codigoArticulo){
        ArrayList<String> nombresArticulos = new ArrayList<String>();
        ArrayList<Integer> codigo = new ArrayList<Integer>();
        
        Iterator<Empresa> it = p.iterator();
        Empresa e = null;
        Inventario i = null;
        while(it.hasNext()){
            e = it.next();
            i = e.getInv();
            if(e.getNombre().equals(nombreEmpresa)){
               switch(opcion){
                   case 1: ArrayList<PlacaMadre> pM = new ArrayList<PlacaMadre>();
                           pM = i.rescatarArrayListPlacaMadre(e);
                           Iterator<PlacaMadre> it2 = pM.iterator();
                           PlacaMadre placa = null;
                           while(it2.hasNext()){
                               placa = it2.next();
                               if(placa.getCodigo()==codigoArticulo){
                                  
                               }
                           }
                       break;
                   case 2:
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
    */
    /*
    public void crearFactura(ArrayList<Empresa> e,ArrayList<Integer> ArticuloCotizado,ArrayList<String> nombreEmpresaComprada,ArrayList<Integer> codigoArticuloComprado,ArrayList<Integer> cantidadCompradaArticulo){
        Iterator<Integer> it = ArticuloCotizado.iterator();
        int a;
        while(it.hasNext()){
            a = it.next();
            switch(a){
                case 1:  Iterator<Empresa> it2 = e.iterator();
                         Iterator<String> it3 = nombreEmpresaComprada.iterator();
                         Iterator<Integer> it4 = codigoArticuloComprado.iterator();
                         Empresa em;
                         Inventario i;
                         for(int k=0;k<nombreEmpresaComprada.size();k++){
                           while(it2.hasNext()){
                             em = it2.next();
                             i = em.getInv();
                             String n = em.getNombre();
                             ArrayList<PlacaMadre> p = new ArrayList<PlacaMadre>();
                             if(nombreEmpresaComprada.get(k).equals(n)){
                                 p = i.rescatarArrayListPlacaMadre(em);
                                 Iterator<PlacaMadre> it5 = p.iterator();
                                 PlacaMadre pM;
                                 for(int j=0;j<codigoArticuloComprado.size();j++){
                                   while(it5.hasNext()){
                                     pM = it5.next();
                                     if(pM.getCodigo()==codigoArticuloComprado.get(j)){
                                         
                                     }
                                   } 
                               }
                             }
                           }
                         }
                    break;
                case 2:
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
    */
    public void añadirFactura(ArrayList<String> a,ArrayList<Integer> b,ArrayList<String> c, ArrayList<Double> d, ArrayList<Integer> e,int cantidadFilas){
       String [] descripcion = new String[c.size()];
       int [] codigo = new int[b.size()];
       double [] precioUnitario = new double[d.size()];
       int [] cantidad = new int[e.size()];
       String [] nombreEmpresa = new String[a.size()];
        for(int i=0;i<cantidadFilas;i++){
            codigo[i] = b.get(i);
            cantidad[i] = e.get(i);
            descripcion[i] = c.get(i);
            precioUnitario[i] = d.get(i);
            nombreEmpresa[i] = a.get(i);
        }
        System.out.println("Mostrando datos de la compra ");
        for(int j=0;j<cantidadFilas;j++){
            System.out.println("Empresa "+nombreEmpresa[j]);
            System.out.println("Descripcion "+descripcion[j]);
        }
       FacturaEmpresa fact = new FacturaEmpresa(descripcion, codigo, precioUnitario, cantidad, nombreEmpresa);
       facturas.add(fact);
       fact.setR(this);
       /*
       facturas[numFacturas] = fact;
       numFacturas++;
       fact.setR(this);
       */
    }
    
    public int tamañoFactura(){
        return facturas.size();
    }
    
    public ArrayList<FacturaEmpresa> LanzarFacturas(){
        return facturas;
    }
       
    public void mostrarFactura(){
        System.out.println("tamaño "+ facturas.size());
        int a=0,b=0,c=0;
        int j=0;
         String descripcion1[] = facturas.get(j).getDescripcion();
         int codigo1[] = facturas.get(j).getCodigo();
          double precioUnitario1[]= facturas.get(j).getPrecioUnitario();
          int cantidad1[]= facturas.get(j).getCantidad();
          String nombreEmpresa1[] = facturas.get(j).getNombreEmpresa();
         
        
         /* 
        Iterator<FacturaEmpresa> it = facturas.iterator();
          FacturaEmpresa F;

          while(it.hasNext()){
            F = it.next();
            F.creacionFactura();
        }
          */
        for(int k=0;k<facturas.size();k++){
            String descripcion[] = facturas.get(k).getDescripcion();
            int codigo[] = facturas.get(k).getCodigo();
            double precioUnitario[]= facturas.get(k).getPrecioUnitario();
            int cantidad[]= facturas.get(k).getCantidad();
            String nombreEmpresa[] = facturas.get(k).getNombreEmpresa();
            int numFilasxFactura = facturas.get(k).getNumFilasxFactura();
            for(int i=0;i<numFilasxFactura;i++){
                   double total = cantidad[i]*precioUnitario[i];
            if(nombreEmpresa[i].equals("TECHCOMPU")){
                if(a==0){
                    System.out.println("*********************************************************************************"+
                                       "\nEmpresa: "+nombreEmpresa[i]+"                  "+"Ruc: "+"                     "+
                                       "\nNombre: "+getNombre()+"                                                      "+
                                       "\nCodigo "+"         Descripcion          "+"  Precio  "+"  Cantidad  "+" Total  "+
                                       "\n "+codigo[i]+"      "+descripcion[i]+"   "+precioUnitario[i]+"       "+cantidad[i]+"         "+total+" ");
                    a++;    
                }else{
                    System.out.println(
                                       
                                       "\n "+codigo[i]+"      "+descripcion[i]+"   "+precioUnitario[i]+"       "+cantidad[i]+"         "+total+" ");
                    
                }
            }
            if(nombreEmpresa[i].equals("Yamoshi")){
                if(b==0){
                    System.out.println("*********************************************************************************"+
                                       "\nEmpresa: "+nombreEmpresa[i]+"                  "+"Ruc: "+"                     "+
                                       "\nNombre: "+getNombre()+"                                                      "+
                                       "\nCodigo "+"         Descripcion          "+"  Precio  "+"  Cantidad  "+" Total  "+
                                       "\n "+codigo[i]+"      "+descripcion[i]+"   "+precioUnitario[i]+"       "+cantidad[i]+"         "+total+" ");
                    b++;    
                }else{
                    System.out.println(
                                       
                                       "\n "+codigo[i]+"      "+descripcion[i]+"   "+precioUnitario[i]+"       "+cantidad[i]+"         "+total+" ");
                    
                }
            }
            if(nombreEmpresa[i].equals("MiPClista")){
                if(c==0){
                    System.out.println("*********************************************************************************"+
                                       "\nEmpresa: "+nombreEmpresa[i]+"                  "+"Ruc: "+"                     "+
                                       "\nNombre: "+getNombre()+"                                                      "+
                                       "\nCodigo "+"         Descripcion          "+"  Precio  "+"  Cantidad  "+" Total  "+
                                       "\n "+codigo[i]+"      "+descripcion[i]+"   "+precioUnitario[i]+"       "+cantidad[i]+"         "+total+" ");
                    c++;    
                }else{
                    System.out.println(
                                       
                                       "\n "+codigo[i]+"      "+descripcion[i]+"   "+precioUnitario[i]+"       "+cantidad[i]+"         "+total+" ");
                    
                }
            }
               }
            
            
        }
    } 
            
    public void realizarCompra(double dinero){
        
    }
    
    @Override
    public void cotizar(String nombreArticulo,double dinero){
        
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
}