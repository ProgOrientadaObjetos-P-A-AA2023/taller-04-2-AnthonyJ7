/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutor3;

/**
 *
 * @author ASUS
 */
public class Fabricante {
    
    private String nombre;
    private String ciudO;

    public Fabricante(String n, String c){
        
        nombre = n;
        ciudO = c;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudO() {
        return ciudO;
    }

    public void setCiudO(String ciudO) {
        this.ciudO = ciudO;
    }
    
    
}
