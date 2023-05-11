/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author ASUS
 */
public class Promedio {
    
    private Universidad universidad;
    private String nomEstudiante;
    private double nota1, nota2,nota3;
    private double promedio;
    
    
    public Promedio(Universidad num, String m, double n1,double n2,double n3){
        
        universidad = num;
        nomEstudiante = m;
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
    }

    public Universidad obtenerUniversidad() {
        return universidad;
    }

    public void establecerUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    public String obtenerNomEstudiante() {
        return nomEstudiante;
    }

    public void establecerNomEstudiante(String nomEstudiante) {
        
        this.nomEstudiante = nomEstudiante;
    }

    public double obtenerNota1() {
        return nota1;
    }

    public void establecerNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double obtenerNota2() {
        return nota2;
    }

    public void establecerNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double obtenerNota3() {
        return nota3;
    }

    public void establecerNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    public void establecerPromedio() {
        this.promedio = (nota1 + nota2 + nota3)/3;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Estudiante:\n"
                
                + "Nombre Universidad: %s\n"
                + "Direccion: %s\n"
                + "Nombre: %s\n"
                + "Nota 1: %.2f\n"
                + "Nota 2: %.2f\n"
                + "Nota 3: %.2f\n"
                + "Promedio: %.2f\n"
                ,
                obtenerUniversidad().obtenerNombre(),
                obtenerUniversidad().obtenerDireccion(),
                obtenerNomEstudiante(),
                obtenerNota1(),
                obtenerNota2(),
                obtenerNota3(),
                obtenerPromedio());
        
        return cadena;
    }
    
}
