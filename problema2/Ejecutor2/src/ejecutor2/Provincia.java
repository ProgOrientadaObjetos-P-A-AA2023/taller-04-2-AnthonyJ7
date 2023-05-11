/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutor2;

/**
 *
 * @author ASUS
 */
public class Provincia {
    
    private String prov;
    private int numhab;
    
    public Provincia(String n, int m){
        
        prov = n;
        numhab = m;
        
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public int getNumhab() {
        return numhab;
    }

    public void setNumhab(int numhab) {
        this.numhab = numhab;
    }
    
    
    
}
