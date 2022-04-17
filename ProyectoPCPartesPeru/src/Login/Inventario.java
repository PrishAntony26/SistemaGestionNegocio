package Login;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Inventario {
    private Empresa em;
    private int codigo;
    Scanner leer = new Scanner(System.in);
    private ArrayList <PlacaMadre> placasMadreE1 = new ArrayList <PlacaMadre>();
    private ArrayList <PlacaMadre> placasMadreE2 = new ArrayList <PlacaMadre>();
    private ArrayList <PlacaMadre> placasMadreE3 = new ArrayList <PlacaMadre>();
    private ArrayList <MemoriaRAM> memoriasRAM1 = new ArrayList <MemoriaRAM>();
    private ArrayList <MemoriaRAM> memoriasRAM2 = new ArrayList <MemoriaRAM>();
    private ArrayList <MemoriaRAM> memoriasRAM3 = new ArrayList <MemoriaRAM>();
    private ArrayList <Procesador> procesadores1 = new ArrayList <Procesador>();
    private ArrayList <Procesador> procesadores2 = new ArrayList <Procesador>();
    private ArrayList <Procesador> procesadores3 = new ArrayList <Procesador>();
    private ArrayList <DiscoDuro> discos1 = new ArrayList <DiscoDuro>();
    private ArrayList <DiscoDuro> discos2 = new ArrayList <DiscoDuro>();
    private ArrayList <DiscoDuro> discos3 = new ArrayList <DiscoDuro>();
    private ArrayList <TarjetaVideo> tarjetas1 = new ArrayList <TarjetaVideo>();
    private ArrayList <TarjetaVideo> tarjetas2 = new ArrayList <TarjetaVideo>();
    private ArrayList <TarjetaVideo> tarjetas3 = new ArrayList <TarjetaVideo>();
    private ArrayList <Empresa> empresas = new ArrayList<Empresa>();
   
    public Inventario(int codigo,Empresa e) {
        e.setInv(this);
        this.codigo = codigo;
    }
    
    public void PlacaMadreDefecto(Empresa e){
        ArrayList<PlacaMadre> p = new ArrayList<PlacaMadre>();
        p = rescatarArrayListPlacaMadre(e);
        if(p==null){
            PlacaMadre p1 = new PlacaMadre("Z390","ATX","INTEL","MSI",119.9,2,10,7051171,"TECHCOMPU");
            PlacaMadre p4 = new PlacaMadre("B450","ATX","INTEL","MSI",150.9,1,10,7051173,"TECHCOMPU");
            PlacaMadre p5 = new PlacaMadre("B450","MICRO ATX","AMD","Gigabyte",100,2,10,7051175,"TECHCOMPU");
            PlacaMadre p6 = new PlacaMadre("Z390","ATX","INTEL","Gigabyte",174,1,10,7051177,"TECHCOMPU");
            placasMadreE1.add(p1);
            placasMadreE1.add(p4);
            placasMadreE1.add(p5);
            placasMadreE1.add(p6);
    
            PlacaMadre p2 = new PlacaMadre("B550","MICRO ATX","AMD","ASUS",122,0,10,7051179,"Yamoshi");
            PlacaMadre p7 = new PlacaMadre("B450","ATX","INTEL","ASRock",120,0,10,7051180,"Yamoshi");
            PlacaMadre p8 = new PlacaMadre("Z390","ATX","INTEL","MSI",154.9,2,10,7051172,"Yamoshi");
            placasMadreE2.add(p2);
            placasMadreE2.add(p7);
            placasMadreE2.add(p8);
      
            PlacaMadre p3 = new PlacaMadre("B450","MICRO ATX","AMD","MSI",90,1,10,7051174,"MiPClista");
            PlacaMadre p9 = new PlacaMadre("Z390","ATX","INTEL","Gigabyte",125,1,10,7051176,"MiPClista");
            PlacaMadre p10 = new PlacaMadre("Z390","ATX","INTEL","ASUS",122,2,10,7051178,"MiPClista");
            placasMadreE3.add(p3);
            placasMadreE3.add(p9);
            placasMadreE3.add(p10);
            lecturaArchivoPlacaMadreDefecto();
        }
        
    }
    
    public void MemoriaRamDefecto(Empresa e){
        ArrayList <MemoriaRAM> m = new ArrayList <MemoriaRAM>();
        m = rescatarArrayListMemoriaRam(e);
        if(m==null){
            MemoriaRAM m1 = new MemoriaRAM(3200.0,"DDR4",16.0,"G. Skill",50.0,1,10,330501,"TECCOMPU");
            MemoriaRAM m2 = new MemoriaRAM(3200.0,"DDR4",8.0,"HYPERX",49.0,1,10,330502,"TECCOMPU");
            MemoriaRAM m3 = new MemoriaRAM(4000.0,"DDR4",16.0,"G. TEAMGROUP",100.0,0,10,330503,"TECCOMPU");
            MemoriaRAM m4 = new MemoriaRAM(3600.0,"DDR4",16.0,"G. Skill",150.0,1,10,330504,"MiPClista");
            MemoriaRAM m5 = new MemoriaRAM(3200.0,"DDR4",16.0,"CORSAIR",84.9,1,10,330505,"Yamoshi");
            MemoriaRAM m6 = new MemoriaRAM(3200.0,"DDR4",16.0,"CRUCIAL",78.9,2,10,330506,"MiPClista");
            MemoriaRAM m7 = new MemoriaRAM(3200.0,"DDR4",8.0,"HYPERX",51.9,1,10,330507,"TECCOMPU");
            MemoriaRAM m8 = new MemoriaRAM(2400.0,"DDR4",4.0,"G. CRUCIAL",21.9,2,10,330508,"Yamoshi");
            MemoriaRAM m9 = new MemoriaRAM(3200.0,"DDR4",8.0,"HYPERX",68.9,1,10,330509,"MiPClista");
            MemoriaRAM m10 = new MemoriaRAM(3200.0,"DDR4",16.0,"CRUCIAL",64.9,2,10,330510,"Yamoshi");
            memoriasRAM1.add(m1);
            memoriasRAM1.add(m2);
            memoriasRAM1.add(m3);
            memoriasRAM1.add(m7);
            memoriasRAM2.add(m10);
            memoriasRAM2.add(m8);
            memoriasRAM2.add(m5);
            memoriasRAM3.add(m4);
            memoriasRAM3.add(m6);
            memoriasRAM3.add(m9);
            lecturaArchivoMemoriaRamDefecto();
        }
    }
    
    public ArrayList<MemoriaRAM> rescatarArrayListMemoriaRam(Empresa e){
        if(e.getNombre().equals("TECHCOMPU")){
            try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Registros\\Inventarios\\E1\\memoriaRAME1.txt"));
            ArrayList <MemoriaRAM> m = (ArrayList <MemoriaRAM>)entrada.readObject();
            return m;
            }catch(IOException | ClassNotFoundException e1){

            return null;
            }
        }
        if(e.getNombre().equals("Yamoshi")){
            try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Registros\\Inventarios\\E2\\memoriaRAME2.txt"));
            ArrayList <MemoriaRAM> m2 = (ArrayList <MemoriaRAM>)entrada.readObject();
            return m2;
            }catch(IOException | ClassNotFoundException e1){

            return null;
            }
        }
        if(e.getNombre().equals("MiPClista")){
            try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Registros\\Inventarios\\E3\\memoriaRAME3.txt"));
            ArrayList <MemoriaRAM> m3 = (ArrayList <MemoriaRAM>)entrada.readObject();
            return m3;
            }catch(IOException | ClassNotFoundException e1){
;
            return null;
            }
        }
        return null;
    }
    
    public void ProcesadoresDefecto(Empresa e){
        ArrayList <Procesador> p = new ArrayList<Procesador>();
        p = rescatarArrayListProcesador(e);
        if(p==null){
            Procesador p1 = new Procesador(4,65.0,6.0,"INTEL",84.99,0,10,806001,"Yamoshi");
            Procesador p2 = new Procesador(6,65.0,12.0,"INTEL",149.89,0,10,806002,"Yamoshi");
            Procesador p3 = new Procesador(6,65.0,12.0,"INTEL",159.95,0,10,806003,"TECCOMPU");
            Procesador p4 = new Procesador(4,65.0,6.0,"INTEL",81.99,1,10,806004,"TECCOMPU");
            Procesador p5 = new Procesador(6,65.0,9.0,"INTEL",129.91,1,10,806005,"MiPClista");
            Procesador p6 = new Procesador(4,65.0,18.0,"AMD",114.90,0,10,806006,"MiPClista");
            Procesador p7 = new Procesador(6,95.0,32.0,"AMD",189.90,0,10,806007,"MiPClista");
            Procesador p8 = new Procesador(6,65.0,35.0,"AMD",159.90,1,10,806008,"Yamoshi");
            Procesador p9 = new Procesador(6,65.0,19.0,"AMD",72.91,3,10,806009,"Yamoshi");
            Procesador p10= new Procesador(6,95.0,32.0,"AMD",124.90,0,10,806010,"Yamoshi");
            procesadores1.add(p3);
            procesadores1.add(p4);
            procesadores2.add(p1);
            procesadores2.add(p2);
            procesadores2.add(p8);
            procesadores2.add(p9);
            procesadores2.add(p10);
            procesadores3.add(p5);
            procesadores3.add(p6);
            procesadores3.add(p7);
            lecturaArchivoProcesadorDefecto();
        }
    }
    
    public ArrayList<Procesador> rescatarArrayListProcesador(Empresa e){
        if(e.getNombre().equals("TECHCOMPU")){
            try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Registros\\Inventarios\\E1\\procesadorE1.txt"));
            ArrayList<Procesador> m = (ArrayList<Procesador>)entrada.readObject();
            return m;
            }catch(IOException | ClassNotFoundException e1){
            return null;
            }
        }
        if(e.getNombre().equals("Yamoshi")){
            try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Registros\\Inventarios\\E2\\procesadorE2.txt"));
            ArrayList<Procesador> m2 = (ArrayList<Procesador>)entrada.readObject();
            return m2;
            }catch(IOException | ClassNotFoundException e1){
            return null;
            }
        }
        if(e.getNombre().equals("MiPClista")){
            try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Registros\\Inventarios\\E3\\procesadorE3.txt"));
            ArrayList<Procesador> m3 = (ArrayList<Procesador>)entrada.readObject();
            setProcesadores3(m3);
            return m3;
            }catch(IOException | ClassNotFoundException e1){
;
            return null;
            }
        }
        return null;
    }
    
    public void DiscoDuroDefecto(Empresa e){
        ArrayList <DiscoDuro> d = new ArrayList <DiscoDuro>();
        d = rescatarArrayListDiscoDuro(e);
        if(d==null){
            DiscoDuro d1 = new DiscoDuro(1000,"SATA","MECANICO","Western Digital",55.0,2,10,520771,"MiPClista");
            DiscoDuro d2 = new DiscoDuro(1000,"SATA","MECANICO","Seagate",49.0,2,10,520772,"MiPClista");
            DiscoDuro d3 = new DiscoDuro(480,"SATA","SOLIDO","Kingston",59.0,1,10,520773,"MiPClista");
            DiscoDuro d4 = new DiscoDuro(512,"M2","SOLIDO","Adata",77.9,2,10,520774,"MiPClista");
            DiscoDuro d5= new DiscoDuro(500,"SATA","SOLIDO","Western Digital",62.9,1,10,520775,"TECCOMPU");
            DiscoDuro d6 = new DiscoDuro(240,"M2","SOLIDO","Kington",40.9,1,10,520776,"TECCOMPU");
            DiscoDuro d7 = new DiscoDuro(500,"SATA","SOLIDO","Samsung",51.9,0,10,520777,"Yamoshi");
            DiscoDuro d8 = new DiscoDuro(500,"SATA","MECANICO","Western Digital",59.9,2,10,520778,"TECCOMPU");
            DiscoDuro d9 = new DiscoDuro(1000,"M2","SOLIDO","Samsung",68.9,0,10,520779,"Yamoshi");
            DiscoDuro d10 = new DiscoDuro(2000,"SATA","MECANICO","Western Digital",128.9,2,10,520780,"TECCOMPU");
            discos1.add(d5);
            discos1.add(d6);
            discos1.add(d8);
            discos1.add(d10);
            
            discos2.add(d7);
            discos2.add(d9);
            
            discos3.add(d1);
            discos3.add(d2);
            discos3.add(d3);
            discos3.add(d4);
            lecturaArchivoDiscoDuroDefecto();
        }
    }
    
    public ArrayList<DiscoDuro> rescatarArrayListDiscoDuro(Empresa e){
        if(e.getNombre().equals("TECHCOMPU")){
            try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Registros\\Inventarios\\E1\\discoduroE1.txt"));
            ArrayList <DiscoDuro> m = (ArrayList <DiscoDuro>)entrada.readObject();
            return m;
            }catch(IOException | ClassNotFoundException e1){

            return null;
            }
        }
        if(e.getNombre().equals("Yamoshi")){
            try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Registros\\Inventarios\\E2\\discoduroE2.txt"));
            ArrayList <DiscoDuro> m2 = (ArrayList <DiscoDuro>)entrada.readObject();
            return m2;
            }catch(IOException | ClassNotFoundException e1){

            return null;
            }
        }
        if(e.getNombre().equals("MiPClista")){
            try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Registros\\Inventarios\\E3\\discoduroE3.txt"));
            ArrayList <DiscoDuro> m3 = (ArrayList <DiscoDuro>)entrada.readObject();
            return m3;
            }catch(IOException | ClassNotFoundException e1){
;
            return null;
            }
        }
        return null;
    }
    
    public void TarjetaVideoDefecto(Empresa e){
        
        ArrayList <TarjetaVideo> t = new ArrayList <TarjetaVideo>();
        t = rescatarArrayListTarjetaVideo(e);
        if(t==null){
            TarjetaVideo t1 = new TarjetaVideo("GeForce GTX 950","PCI-E 3.0",2.0,"GIGABYTE",50.0,3,10,907501,"Yamoshi");
            TarjetaVideo t2 = new TarjetaVideo("GeForce GTX 750 Ti","PCI-E 3.0",2.0,"GIGABYTE",40.0,3,10,907502,"MiPClista");
            TarjetaVideo t3 = new TarjetaVideo("GeForce GTX 1060","PCI-E 3.0",3.0,"MSI",100.0,2,10,907503,"MiPClista");
            TarjetaVideo t4 = new TarjetaVideo("GeForce GTX 1060","PCI-E 3.0",6.0,"ZOTAC",130.0,2,10,907504,"TECCOMPU");
            TarjetaVideo t5 = new TarjetaVideo("GeForce GT 1030","PCI-E 3.0",2.0,"MSI",66.0,2,10,907505,"TECCOMPU");
            TarjetaVideo t6 = new TarjetaVideo("Radeon RX 460","PCI-E 3.0",4.0,"MSI",60.0,3,10,907506,"Yamoshi");
            TarjetaVideo t7 = new TarjetaVideo("Radeon RX 470","PCI-E 3.0",4.0,"MSI",85.0,3,10,907507,"MiPClista");
            TarjetaVideo t8 = new TarjetaVideo("Radeon R9 390","PCI-E 3.0",8.0,"MSI",150.0,3,10,907508,"TECCOMPU");
            TarjetaVideo t9 = new TarjetaVideo("GeForce RTX 2060","PCI-E 4.0",6.0,"ASUS",430.0,2,10,907509,"TECCOMPU");
            TarjetaVideo t10 = new TarjetaVideo("GeForce GTX 1650","PCI-E 3.0",4.0,"GIGABYTE",220.0,3,10,907510,"Yamoshi");
            tarjetas1.add(t4);
            tarjetas1.add(t5);
            tarjetas1.add(t8);
            tarjetas1.add(t9);
            
            tarjetas2.add(t1);
            tarjetas2.add(t6);
            tarjetas2.add(t10);
            
            tarjetas3.add(t2);
            tarjetas3.add(t3);
            tarjetas3.add(t7);
            lecturaArchivoTarjetaVideoDefecto();
        }
    }
    
    public ArrayList<TarjetaVideo> rescatarArrayListTarjetaVideo(Empresa e){
        if(e.getNombre().equals("TECHCOMPU")){
            try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Registros\\Inventarios\\E1\\tarjetavideoE1.txt"));
            ArrayList <TarjetaVideo> m = (ArrayList <TarjetaVideo>)entrada.readObject();
            return m;
            }catch(IOException | ClassNotFoundException e1){

            return null;
            }
        }
        if(e.getNombre().equals("Yamoshi")){
            try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Registros\\Inventarios\\E2\\tarjetavideoE2.txt"));
            ArrayList <TarjetaVideo> m2 = (ArrayList <TarjetaVideo>)entrada.readObject();
            return m2;
            }catch(IOException | ClassNotFoundException e1){

            return null;
            }
        }
        if(e.getNombre().equals("MiPClista")){
            try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Registros\\Inventarios\\E3\\tarjetavideoE3.txt"));
            ArrayList <TarjetaVideo> m3 = (ArrayList <TarjetaVideo>)entrada.readObject();
            return m3;
            }catch(IOException | ClassNotFoundException e1){
;
            return null;
            }
        }
        return null;
    }
    
    public void lecturaArchivoMemoriaRamDefecto(){
        try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Inventarios\\E1\\memoriaRAME1.txt")); 
            salida.writeObject(memoriasRAM1);
            salida.close();
        }catch(IOException e){
            System.out.println("error");
        } 
        
      
        try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Inventarios\\E2\\memoriaRAME2.txt")); 
            salida.writeObject(memoriasRAM2);
            salida.close();
        }catch(IOException e){
            System.out.println("error");    
        }
       
           try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Inventarios\\E3\\memoriaRAME3.txt")); 
            salida.writeObject(memoriasRAM3);
            salida.close();
        }catch(IOException e){
            System.out.println("error");
        } 
    }
    
    public void lecturaArchivoProcesadorDefecto(){
        try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Inventarios\\E1\\procesadorE1.txt")); 
            salida.writeObject(procesadores1);
            salida.close();
        }catch(IOException e){
            System.out.println("error");
        } 
        
      
        try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Inventarios\\E2\\procesadorE2.txt")); 
            salida.writeObject(procesadores2);
            salida.close();
        }catch(IOException e){
            System.out.println("error");    
        }
       
           try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Inventarios\\E3\\procesadorE3.txt")); 
            salida.writeObject(procesadores3);
            salida.close();
        }catch(IOException e){
            System.out.println("error");
        } 
    }
   
    public void lecturaArchivoDiscoDuroDefecto(){
        try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Inventarios\\E1\\discoduroE1.txt")); 
            salida.writeObject(discos1);
            salida.close();
        }catch(IOException e){
            System.out.println("error");
        } 
        
      
        try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Inventarios\\E2\\discoduroE2.txt")); 
            salida.writeObject(discos2);
            salida.close();
        }catch(IOException e){
            System.out.println("error");    
        }
       
           try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Inventarios\\E3\\discoduroE3.txt")); 
            salida.writeObject(discos3);
            salida.close();
        }catch(IOException e){
            System.out.println("error");
        } 
    }
    
    public void lecturaArchivoTarjetaVideoDefecto(){
        try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Inventarios\\E1\\tarjetavideoE1.txt")); 
            salida.writeObject(tarjetas1);
            salida.close();
        }catch(IOException e){
            System.out.println("error");
        } 
        
      
        try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Inventarios\\E2\\tarjetavideoE2.txt")); 
            salida.writeObject(tarjetas2);
            salida.close();
        }catch(IOException e){
            System.out.println("error");    
        }
       
           try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Inventarios\\E3\\tarjetavideoE3.txt")); 
            salida.writeObject(tarjetas3);
            salida.close();
        }catch(IOException e){
            System.out.println("error");
        } 
    }
    
    public PlacaMadre IngresarPlacaMadre(Empresa e){
        String marca,chip,form,tipo,nombreEmpresa;
        int precio,antiguo,stock,cod;
        System.out.println(" Ingrese los siguientes datos");
        System.out.println(" Ingrese el codigo del producto");
        cod = leer.nextInt();
        System.out.println(" Marca ");
        marca =  leer.next();
        System.out.println(" Precio ");
        precio = leer.nextInt();
        System.out.println(" Antiguedad ");
        antiguo = leer.nextInt();
        System.out.println(" Stock ");
        stock = leer.nextInt();
        System.out.println(" Chipset ");
        chip = leer.next();
        System.out.println(" Formato ");
        form = leer.next();
        System.out.println(" Tipo ");
        tipo = leer.next();
        nombreEmpresa = e.getNombre();
        PlacaMadre p = new PlacaMadre(chip, form, tipo, marca, precio, antiguo, stock, cod, nombreEmpresa);
        return p;
    }

    public void mostrarPlacaMadreE(Empresa e){
        if(e.getRUC()=="20550626927"){
        Iterator<PlacaMadre> it = placasMadreE1.iterator();
        PlacaMadre p = null;
        while(it.hasNext()){
            p = it.next();
            System.out.println("Mostrando datos de la placa madre ");
            System.out.println("Codigo "+ p.getCodigo() +"\nMarca del dispositivo "+ p.getMarca() +"\n Precio: "+
            p.getPrecio() + "\n Antiguedad: "+ p.getAntiguedad() + "\nStock "+ p.getStockEmpresa() + 
            "\n Chipset: "+ p.getChipset() + "\n Formato "+ p.getFormato());
            }
        }
        if(e.getRUC()=="20511068496"){
        Iterator<PlacaMadre> it = placasMadreE2.iterator();
        PlacaMadre p = null;
        while(it.hasNext()){
            p = it.next();
            System.out.println("Mostrando datos de la placa madre ");
            System.out.println("Codigo "+ p.getCodigo() +"\nMarca del dispositivo "+ p.getMarca() +"\n Precio: "+
            p.getPrecio() + "\n Antiguedad: "+ p.getAntiguedad() + "\nStock "+ p.getStockEmpresa() + 
            "\n Chipset: "+ p.getChipset() + "\n Formato "+ p.getFormato());
            }
        }
        if(e.getRUC()=="20451830768"){
        Iterator<PlacaMadre> it = placasMadreE3.iterator();
        PlacaMadre p = null;
        while(it.hasNext()){
            p = it.next();
            System.out.println("Mostrando datos de la placa madre ");
            System.out.println("Codigo "+ p.getCodigo() +"\nMarca del dispositivo "+ p.getMarca() +"\n Precio: "+
            p.getPrecio() + "\n Antiguedad: "+ p.getAntiguedad() + "\nStock "+ p.getStockEmpresa() + 
            "\n Chipset: "+ p.getChipset() + "\n Formato "+ p.getFormato());
            }
        }
    }
 
    public ArrayList<PlacaMadre> getPlacasMadreE1() {
        return placasMadreE1;
    }

    public void setPlacasMadreE1(ArrayList<PlacaMadre> placasMadreE1) {
        this.placasMadreE1 = placasMadreE1;
    }

    public ArrayList<PlacaMadre> getPlacasMadreE2() {
        return placasMadreE2;
    }

    public void setPlacasMadreE2(ArrayList<PlacaMadre> placasMadreE2) {
        this.placasMadreE2 = placasMadreE2;
    }

    public ArrayList<PlacaMadre> getPlacasMadreE3() {
        return placasMadreE3;
    }

    public void setPlacasMadreE3(ArrayList<PlacaMadre> placasMadreE3) {
        this.placasMadreE3 = placasMadreE3;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public ArrayList<MemoriaRAM> getMemoriasRAM1() {
        return memoriasRAM1;
    }

    public void setMemoriasRAM1(ArrayList<MemoriaRAM> memoriasRAM1) {
        this.memoriasRAM1 = memoriasRAM1;
    }

    public ArrayList<MemoriaRAM> getMemoriasRAM2() {
        return memoriasRAM2;
    }

    public void setMemoriasRAM2(ArrayList<MemoriaRAM> memoriasRAM2) {
        this.memoriasRAM2 = memoriasRAM2;
    }

    public ArrayList<MemoriaRAM> getMemoriasRAM3() {
        return memoriasRAM3;
    }

    public void setMemoriasRAM3(ArrayList<MemoriaRAM> memoriasRAM3) {
        this.memoriasRAM3 = memoriasRAM3;
    }

    public ArrayList<Procesador> getProcesadores1() {
        return procesadores1;
    }

    public void setProcesadores1(ArrayList<Procesador> procesadores1) {
        this.procesadores1 = procesadores1;
    }

    public ArrayList<Procesador> getProcesadores2() {
        return procesadores2;
    }

    public void setProcesadores2(ArrayList<Procesador> procesadores2) {
        this.procesadores2 = procesadores2;
    }

    public ArrayList<Procesador> getProcesadores3() {
        return procesadores3;
    }

    public void setProcesadores3(ArrayList<Procesador> procesadores3) {
        this.procesadores3 = procesadores3;
    }

    public ArrayList<DiscoDuro> getDiscos1() {
        return discos1;
    }

    public void setDiscos1(ArrayList<DiscoDuro> discos1) {
        this.discos1 = discos1;
    }

    public ArrayList<DiscoDuro> getDiscos2() {
        return discos2;
    }

    public void setDiscos2(ArrayList<DiscoDuro> discos2) {
        this.discos2 = discos2;
    }

    public ArrayList<DiscoDuro> getDiscos3() {
        return discos3;
    }

    public void setDiscos3(ArrayList<DiscoDuro> discos3) {
        this.discos3 = discos3;
    }

    public ArrayList<TarjetaVideo> getTarjetas1() {
        return tarjetas1;
    }

    public void setTarjetas1(ArrayList<TarjetaVideo> tarjetas1) {
        this.tarjetas1 = tarjetas1;
    }

    public ArrayList<TarjetaVideo> getTarjetas2() {
        return tarjetas2;
    }

    public void setTarjetas2(ArrayList<TarjetaVideo> tarjetas2) {
        this.tarjetas2 = tarjetas2;
    }

    public ArrayList<TarjetaVideo> getTarjetas3() {
        return tarjetas3;
    }

    public void setTarjetas3(ArrayList<TarjetaVideo> tarjetas3) {
        this.tarjetas3 = tarjetas3;
    }
   
    
    public void añadirArchivoPlacaMadre(Empresa e){
       PlacaMadre pM = IngresarPlacaMadre(e);
       ArrayList<PlacaMadre> aux = rescatarArrayListPlacaMadre(e);
       if(e.getRUC()=="20550626927"){
           try{
           aux.add(pM);
           ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Inventarios\\E1\\placaMadreE1.txt")); 
           salida.writeObject(aux);
           salida.close();
           }catch(IOException e1){
               System.out.println("ERROR");
           }
           System.out.println("Placa madre guardada de forma exitosa");
       }
       if(e.getRUC()=="20511068496"){
           try{
           aux.add(pM);
           ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Inventarios\\E2\\placaMadreE2.txt")); 
           salida.writeObject(aux);
           salida.close();
           }catch(IOException e1){
               System.out.println("ERROR");
           }
           System.out.println("Placa madre guardada de forma exitosa");
       }
       if(e.getRUC()=="20451830768"){
           try{
           aux.add(pM);
           ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Inventarios\\E3\\placaMadreE3.txt")); 
           salida.writeObject(aux);
           salida.close();
           }catch(IOException e1){
               System.out.println("ERROR");
           }
           System.out.println("Placa madre guardada de forma exitosa");
         
       } 
    }
    public void lecturaArchivoPlacaMadreDefecto(){
        
        try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Inventarios\\E1\\placaMadreE1.txt")); 
            salida.writeObject(placasMadreE1);
            salida.close();
        }catch(IOException e){
            System.out.println("error");
        } 
        
      
        try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Inventarios\\E2\\placaMadreE2.txt")); 
            salida.writeObject(placasMadreE2);
            salida.close();
        }catch(IOException e){
            System.out.println("error");    
        }
       
           try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Inventarios\\E3\\placaMadreE3.txt")); 
            salida.writeObject(placasMadreE3);
            salida.close();
        }catch(IOException e){
            System.out.println("error");
        } 
    }
       
    
    
    public void escrituraArchivoPlacaMadre(Empresa e){
     if(e.getRUC()=="20550626927"){
        try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Registros\\Inventarios\\E1\\placaMadreE1.txt"));
            ArrayList<PlacaMadre> pM1 = (ArrayList<PlacaMadre>)entrada.readObject();
            mostrarDatosPlacaMadre(pM1);
        }catch(IOException | ClassNotFoundException e1){
            System.out.println("ERROR");
        }
     }
     if(e.getRUC()=="20511068496"){
         try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Registros\\Inventarios\\E2\\placaMadreE2.txt"));
            ArrayList<PlacaMadre> pM2 = (ArrayList<PlacaMadre>)entrada.readObject();
            mostrarDatosPlacaMadre(pM2);
        }catch(IOException | ClassNotFoundException e1){
            System.out.println("ERROR");
        }
     }
     if(e.getRUC()=="20451830768"){
         try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Registros\\Inventarios\\E3\\placaMadreE3.txt"));
            ArrayList<PlacaMadre> pM3 = (ArrayList<PlacaMadre>)entrada.readObject();
            mostrarDatosPlacaMadre(pM3);
        }catch(IOException | ClassNotFoundException e1){
            System.out.println("ERROR");
        }
     }      
    }
    
    public void mostrarDatosPlacaMadre(ArrayList<PlacaMadre> p){
        Iterator<PlacaMadre> it = p.iterator();
        PlacaMadre pM = null;
        System.out.println("TAMAÑO "+ p.size());
        while(it.hasNext()){
            pM = it.next();
            System.out.println("Codigo "+ pM.getCodigo() +"\nMarca del dispositivo "+ pM.getMarca() +"\n Precio: "+
            pM.getPrecio() + "\n Antiguedad: "+ pM.getAntiguedad() + "\nStock "+ pM.getStockEmpresa() + 
            "\n Chipset: "+ pM.getChipset() + "\n Formato "+ pM.getFormato());
        }
    }
    
    public ArrayList<PlacaMadre> rescatarArrayListPlacaMadre(Empresa e){
        if(e.getNombre().equals("TECHCOMPU")){
            try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Registros\\Inventarios\\E1\\placaMadreE1.txt"));
            ArrayList<PlacaMadre> pM1 = (ArrayList<PlacaMadre>)entrada.readObject();
            setPlacasMadreE1(pM1);
            return pM1;
            }catch(IOException | ClassNotFoundException e1){

            return null;
            }
        }
        if(e.getNombre().equals("Yamoshi")){
            try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Registros\\Inventarios\\E2\\placaMadreE2.txt"));
            ArrayList<PlacaMadre> pM2 = (ArrayList<PlacaMadre>)entrada.readObject();
            setPlacasMadreE2(pM2);
            return pM2;
            }catch(IOException | ClassNotFoundException e1){

            return null;
            }
        }
        if(e.getNombre().equals("MiPClista")){
            try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Registros\\Inventarios\\E3\\placaMadreE3.txt"));
            ArrayList<PlacaMadre> pM3 = (ArrayList<PlacaMadre>)entrada.readObject();
            setPlacasMadreE3(pM3);
            return pM3;
            }catch(IOException | ClassNotFoundException e1){
;
            return null;
            }
        }
        return null;
    }
    
    public void actualizarDatos(ArrayList<PlacaMadre> a, Empresa e){
        if(e.getRUC()=="20550626927"){
            try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Inventarios\\E1\\placaMadreE1.txt"));
            salida.writeObject(a);
            setPlacasMadreE1(a);
            salida.close();
            }catch(IOException e1){
            System.out.println("error");
            }
        }
        
        if(e.getRUC()=="20511068496"){
            try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Inventarios\\E2\\placaMadreE2.txt"));
            salida.writeObject(a);
            setPlacasMadreE2(a);
            salida.close();
            }catch(IOException e1){
            System.out.println("error");
            }
        }
        
        if(e.getRUC()=="20451830768"){
            try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Inventarios\\E3\\placaMadreE3.txt"));
            salida.writeObject(a);
            setPlacasMadreE3(a);
            salida.close();
            }catch(IOException e1){
            System.out.println("error");
            }
        }  
    }
    
    public void actualizarDatosprocesador(ArrayList<Procesador> a, Empresa e){
        if(e.getRUC()=="20550626927"){
            try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Inventarios\\E1\\procesadorE1.txt"));
            salida.writeObject(a);
            salida.close();
            }catch(IOException e1){
            System.out.println("error");
            }
        }
        
        if(e.getRUC()=="20511068496"){
            try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Inventarios\\E2\\procesadorE2.txt"));
            salida.writeObject(a);
            salida.close();
            }catch(IOException e1){
            System.out.println("error");
            }
        }
        
        if(e.getRUC()=="20451830768"){
            try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Inventarios\\E3\\procesadorE3.txt"));
            salida.writeObject(a);
            salida.close();
            }catch(IOException e1){
            System.out.println("error");
            }
        }
        
        
    }
    
    public void actualizarDatosMemoriaRam(ArrayList<MemoriaRAM> a, Empresa e){
        if(e.getRUC()=="20550626927"){
            try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Inventarios\\E1\\memoriaRAME1.txt"));
            salida.writeObject(a);
            salida.close();
            }catch(IOException e1){
            System.out.println("error");
            }
        }
        
        if(e.getRUC()=="20511068496"){
            try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Inventarios\\E2\\memoriaRAME2.txt"));
            salida.writeObject(a);
            salida.close();
            }catch(IOException e1){
            System.out.println("error");
            }
        }
        
        if(e.getRUC()=="20451830768"){
            try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Inventarios\\E3\\memoriaRAME3.txt"));
            salida.writeObject(a);
            salida.close();
            }catch(IOException e1){
            System.out.println("error");
            }
        }
        
        
    }
    
    public void actualizarDatosTarjetaV(ArrayList<TarjetaVideo> a, Empresa e){
        if(e.getRUC()=="20550626927"){
            try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Inventarios\\E1\\tarjetavideoE1.txt"));
            salida.writeObject(a);
            salida.close();
            }catch(IOException e1){
            System.out.println("error");
            }
        }
        
        if(e.getRUC()=="20511068496"){
            try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Inventarios\\E2\\tarjetavideoE2.txt"));
            salida.writeObject(a);
            salida.close();
            }catch(IOException e1){
            System.out.println("error");
            }
        }
        
        if(e.getRUC()=="20451830768"){
            try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Inventarios\\E3\\tarjetavideoE3.txt"));
            salida.writeObject(a);
            salida.close();
            }catch(IOException e1){
            System.out.println("error");
            }
        }
        
        
    }
    
    public void actualizarDatosDiscoDuro(ArrayList<DiscoDuro> a, Empresa e){
        if(e.getRUC()=="20550626927"){
            try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Inventarios\\E1\\discoduroE1.txt"));
            salida.writeObject(a);
            salida.close();
            }catch(IOException e1){
            System.out.println("error");
            }
        }
        
        if(e.getRUC()=="20511068496"){
            try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Inventarios\\E2\\discoduroE2.txt"));
            salida.writeObject(a);
            salida.close();
            }catch(IOException e1){
            System.out.println("error");
            }
        }
        
        if(e.getRUC()=="20451830768"){
            try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Inventarios\\E3\\discoduroE3.txt"));
            salida.writeObject(a);
            salida.close();
            }catch(IOException e1){
            System.out.println("error");
            }
        }
        
        
    }
    
    
    /*
    public ArrayList<PlacaMadre> rescatarArrayListPlacaMadre(){
      
            try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("C:\\Users\\ok\\Desktop\\A CICLO 4 UNMSM\\poosemana10\\placaMadreE1.txt"));
            ArrayList<PlacaMadre> pM1 = (ArrayList<PlacaMadre>)entrada.readObject();
            setPlacasMadreE1(pM1);
            return pM1;
            }catch(IOException | ClassNotFoundException e1){
            System.out.println("errorA ");
            return null;
            }
            
            try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("C:\\Users\\ok\\Desktop\\A CICLO 4 UNMSM\\poosemana10\\placaMadreE2.txt"));
            ArrayList<PlacaMadre> pM2 = (ArrayList<PlacaMadre>)entrada.readObject();
            setPlacasMadreE2(pM2);
            return pM2;
            }catch(IOException | ClassNotFoundException e1){
            System.out.println("errorB ");
            return null;
            }
        
            try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("C:\\Users\\ok\\Desktop\\A CICLO 4 UNMSM\\poosemana10\\placaMadreE3.txt"));
            ArrayList<PlacaMadre> pM3 = (ArrayList<PlacaMadre>)entrada.readObject();
            setPlacasMadreE3(pM3);
            return pM3;
            }catch(IOException | ClassNotFoundException e1){
            System.out.println("errorC ");
            return null;
            }      
    }
    */    
}