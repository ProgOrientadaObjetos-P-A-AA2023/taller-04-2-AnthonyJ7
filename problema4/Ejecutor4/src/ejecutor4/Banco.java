/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutor4;

/**
 *
 * @author ASUS
 */
public class Banco {
    
    private String banco;
    private int sucursales;
    
    public Banco(String b, int s){
        
        banco = b;
        sucursales = s;
        
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getSucursales() {
        return sucursales;
    }

    public void setSucursales(int sucursales) {
        this.sucursales = sucursales;
    }

}
