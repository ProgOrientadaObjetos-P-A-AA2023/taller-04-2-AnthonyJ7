/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutor1;
import paquete2.Promedio;
import paquete2.Universidad;

/**
 *
 * @author ASUS
 */
public class Ejecutor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Universidad u1 = new Universidad("UTPL","San Cayetano Alto, C. París");
        
        Promedio pe = new Promedio(u1 ,"Jhordy Agila", 9, 7,8);

        pe.establecerPromedio();
        
        System.out.printf("%s\n", pe);

        
    }
    
    
}