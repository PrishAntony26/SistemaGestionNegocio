/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.io.Serializable;
/**
 *
 * @author ok
 */
public class HistorialVenta implements Serializable{
    
    private String nombre;
    private long dni;
    private String dispositivo;
    private int codigo;
    private int cantidadVendida;
    private double total;
    private double precio;

    public HistorialVenta(String nombre, long dni, String dispositivo,double precio, int codigo, int cantidadVendida, double total) {
        this.nombre = nombre;
        this.dni = dni;
        this.dispositivo = dispositivo;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidadVendida = cantidadVendida;
        this.total = total;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
