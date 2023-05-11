/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutor2;

/**
 *
 * @author ASUS
 */
public class Ejecutor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Provincia p1 = new Provincia("Loja",16000);
        
        Instituto i1 = new Instituto("Enith Saraguro","1105655869", 890, p1);
      
        i1.calcularSueldoTotal();
        
        System.out.printf("%s\n", i1);
        
       
        
    }
    
    
}