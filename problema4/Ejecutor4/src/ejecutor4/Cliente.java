/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutor4;

/**
 *
 * @author ASUS
 */
public class Cliente {
    
    // nombre del cliente, nombre del banco, valor del cheque y comisión que cobra el banco.
    // La comisión del banco es igual al valor del cheque por el 0.003%.
    
    private String nombre,apellido,cedula;
    
    public Cliente(String n, String a, String c){
        
        nombre = n;
        apellido = a;
        cedula = c;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    
    
}
