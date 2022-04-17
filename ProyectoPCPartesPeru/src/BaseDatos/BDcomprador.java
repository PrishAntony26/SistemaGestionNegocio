/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;
import Login.Registrado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Login.Registrado;

public class BDcomprador {
    Conexion c = new Conexion();
    private final String bd = "usuarioregistrados";
    private final String usuario = "root";
    private final String pass = "";
    private String valores,sql;
    private ResultSet ResultSet;
    /*
    Vamos a instanciar una objeto de la clase conexion para usar su metodo conectar y ejecutar 
    Declaramos atributos de tipo final ya que de esa forma se van a mantener constantes 
    En bd -> el nombre de la base de datos 
       usuario -> el nombre del usuario :v
       pass -> contraseña 
    En el atributo valores iran los datos los cuales vamos a realizar las acciones en las tablas de 
    la base de datos 
    En sql ya ira la accion es especifica que se desea realizar 
    */
    public boolean registrarComprador(Registrado r){
        boolean respuesta = false;
        if(c.conectar(bd, usuario, pass)){
            /*
            Vemos que primero la conexcion se debe realizar de correcta forma para luego proseguir con el metodo de ejecucion luego de haber 
            guardado los valores en una variable en valores y hacer diversas funcionalidades con la tabla en este caso vamos a realizar la 
            accion de insertar una nueva fila en la tabla de comprador por eso ponemos: 
             INSERT INTO comprador(telefono,direccion,nombre,dni,usuario,contraseña,dinero), como ya sabemos en el parentesis van los campos
             de la tabla 
            */
            valores = r.getTelefono()+",'"+r.getDireccion()+"','"+r.getNombre()+"',"+r.getDNI()+",'"+r.getUser()+"','"+r.getPass()+"',"+r.getDinero();
            sql = "INSERT INTO comprador(telefono,direccion,nombre,dni,usuario,contraseña,dinero) "
                    + "Values ("+valores+");";
            if(c.ejecutar(sql)){
                     respuesta = true;
                     JOptionPane.showMessageDialog(null, "Se ha registrado al comprador correctamente");
            }
            c.desconectar();
        }else{
            JOptionPane.showMessageDialog(null, "ERROR AL CONECTAR CON LA BASE DE DATOS");
        }
        return respuesta;
    }
    
    public Registrado loginComprador(String user, String apass){
        Registrado r = new Registrado();
        if(c.conectar(bd, usuario, pass)){
            /*
            Hacemos la funcion SELECT de la base de datos 
            */
            sql = "SELECT * FROM comprador WHERE usuario = '"+user+"' AND "+"contraseña = '"+apass+"';";
            ResultSet resultado = c.seleccionar(sql);
        try{
            if(resultado.next()){
                /*r.setNombre(resultado.getString("nombre"));
                r.setUser(resultado.getString("usuario"));
                r.setDNI(resultado.getInt("dni"));
                r.setTelefono(resultado.getLong("telefono"));
                r.setPass(resultado.getString("contraseña"));
                r.setDinero(resultado.getDouble("dinero"));
                r.setDireccion(resultado.getString("direccion"));*/
                tablasAJava(r, resultado);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null," ERROR EN LA BASE DE DATOS ");
            r = null;
         }
        }
        
        return r; 
    }
    
    public Registrado RecargarDinero(String user,String apass, Double dineroN){
        Registrado resultado = new Registrado();
        if(c.conectar(bd, usuario, pass)){
            sql = "UPDATE comprador SET dinero = "+dineroN+" WHERE usuario = '"+user+" AND contraseña = '"+apass+"';";
            ResultSet r = c.seleccionar(sql);
            try{
                if(r.next()){
                 tablasAJava(resultado, r);
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, " Error en la base de datos recargar dinero");
                resultado = null;
            }          
        }
        return resultado; 
    }
    
    public void tablasAJava(Registrado registrado, ResultSet result) throws SQLException{
        registrado.setNombre(result.getString("nombre"));
        /*
        registrado.setUser(result.getString("usuario"));
        registrado.setDNI(result.getInt("dni"));
        registrado.setTelefono(result.getLong("telefono"));
        registrado.setPass(result.getString("contraseña"));
        registrado.setDinero(result.getDouble("dinero"));
        registrado.setDireccion(result.getString("direccion"));*/
    }
}
