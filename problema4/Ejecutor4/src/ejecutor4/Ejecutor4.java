/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutor4;

/**
 *
 * @author ASUS
 */
public class Ejecutor4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente cl = new Cliente("Jhordy","Agila","1245578963");
        Banco b = new Banco("Banco de Loja", 17);
        Cheques c1 = new Cheques(cl,b,45000);

        c1.calcularComision();
        
        System.out.printf("%s\n", c1);
        
        // TODO code application logic here
    }
    
}
