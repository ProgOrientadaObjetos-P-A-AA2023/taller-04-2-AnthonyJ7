/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutor2;

/**
 *
 * @author ASUS
 */
public class Instituto {
    
    private String nombre,cedula;
    private double sueldoBasico, sueldoTotal;
    private Provincia provincia;

    public Instituto(String nom,String ce, double sb,Provincia num){
        
        nombre = nom;
        cedula = ce;
        sueldoBasico = sb;
        provincia = num;
        
        
    }
    public void establecerNombre(String c){
       nombre=c;
        
    }
    public void establecerCedula(String c){
        cedula = c;
    }
    
    public void establecerProvinvia(Provincia c){
        provincia = c;
    }
    
        public void establecerSueldoBasico(double c){
        sueldoBasico = c;
    }

      public void calcularSueldoTotal(){
        
        sueldoTotal = (sueldoBasico * 0.20) + sueldoBasico; 
        
    }
    
    public String obtenerNombre(){
        return nombre;
    }            
    
    public String obtenerCedula(){
        return cedula;
    }
    
    public Provincia obtenerProvincia(){
        
        return provincia;
        
    }
    
    public double obtenerSueldoBasico(){
        return sueldoBasico;
    }
    public double obtenerSueldoTotal(){
        return sueldoTotal;
    }


    
    @Override
    public String toString() {
        String cadena = String.format("Profesor:\n"
                + "Nombre: %s\n"
                + "Cedula: %s\n"
                + "Provincia: %s\n"
                + "Habitantes: %d\n"
                + "Sueldo Basico: %.2f\n"
                + "Sueldo Total: %.2f\n",                
                obtenerNombre(),
                obtenerCedula(),
                obtenerProvincia().getProv(),
                obtenerProvincia().getNumhab(),
                obtenerSueldoBasico(),
                obtenerSueldoTotal());

        return cadena;
    }
    
}
