/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutor3;

/**
 *
 * @author ASUS
 */
public class Ejecutor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fabricante fr = new Fabricante("Chevrolet","China");
        
        TipoAutos a1 = new TipoAutos("1254893756",fr,2017,45000);
      
        a1.calcularMatricula();
        
        System.out.printf("%s\n", a1);

        
    }
    
    
}
