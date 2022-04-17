                                                                                /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;
import Login.Registrado;
        
public class Conexion {
    private Connection conexion;
    private Statement sentencia;
    /*
    A traves de sentencia instanciada de la clase Statement
    vamos a realizar la ejecucion respectiva del sql que se ha mandado ya sea 
    INSERT, UPDATE, DELETE, A TRAVES DE SU METODO .execute, para acceder a este 
    metodo primero se DEBE HACER LA CONEXION CON LA BASE DE DATOS 
    */
    public boolean conectar(String nombreBD, String usuario,String clave){
        boolean estado = false;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            try{
               String URL = "jdbc:mysql://127.0.0.1:3306/" + nombreBD;
               conexion = (Connection)DriverManager.getConnection(URL, usuario, clave);
               estado = true;
            }catch(SQLException ex){
                System.out.println("ERROR1");
                System.out.println(ex.getErrorCode());
                System.out.println(ex.toString());
            }     
        }catch(ClassNotFoundException ex1){
            System.out.println("ERROR2");
            System.out.println(ex1.toString());
        }
        return estado;
    }
    /*
    A traves de sentencia vamos a realizar la ejecucion respectiva del sql que se ha mandado ya sea 
    INSERT, UPDATE, DELETE
    */
    public boolean ejecutar(String sql){
        boolean estado = false;
        try{
            sentencia = conexion.createStatement();
            sentencia.execute(sql);
            estado = true;
        }catch(SQLException sqle){
            System.out.println(" ERROR4");
            System.out.println(sqle.getMessage());
        }
        return estado;
    }
    
    //A traves de este metodo vamos a realizar la funcion de base de datos de seleccionar 
    public ResultSet seleccionar(String sql){
        ResultSet resultado= null;
        try{
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
        }catch(SQLException sqle){
            System.out.println(" ERROR3");
            System.out.println( sqle.getMessage());
        }
        return resultado;
    }
    
    public void desconectar(){
        try{
            if(conexion!= null){
                conexion.close();
            }
        }catch(SQLException sqle){
            System.out.println(" ERROR5");
            System.out.println( sqle.getMessage());
        }
    }
}
