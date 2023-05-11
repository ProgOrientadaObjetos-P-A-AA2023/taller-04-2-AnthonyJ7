/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author ASUS
 */
public class Universidad {
    
    private String nombre;
    private String direccion;
    
    public Universidad(){
        nombre = "NN";
        direccion = "DD";

    }
    
    public Universidad(String n, String m){
        nombre = n;
        direccion = m;

    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public void establecerDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
}
