/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutor4;

/**
 *
 * @author ASUS
 */
public class Cheques {
    
    // nombre del cliente, nombre del banco, valor del cheque y comisión que cobra el banco.
    // La comisión del banco es igual al valor del cheque por el 0.003%.
    
    private double vCheque,comision;
    private Cliente cliente;
    private Banco banco;

    public Cheques(Cliente c, Banco b, int vc){

        cliente =  c;
        banco = b;
        vCheque = vc;
        
    }
    
    public void establecerCliente(Cliente c){
        
        cliente = c;
        
    }
    
    public void establecerBanco(Banco c){
        
        banco = c;
        
    }

        public void establecerValorCheque(int c){
        vCheque = c;
        
    }


      public void calcularComision(){
         
        comision = vCheque * 0.003; 
        
    }
      
    public Cliente obtenerCliente(){
        
        return cliente;
        
    }
    
    public Banco obtenerBanco(){
        
        return banco;
        
    }
    
    public double obtenerValorCheque(){
        return vCheque;
    }
    
    public double obtenerComision(){
        return comision;
    }
    
    

    @Override
    public String toString() {
        String cadena = String.format("Profesor:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Cedula: %s\n"
                + "Banco: %s\n"
                + "Sucursales: %d\n"
                + "Valor del cheque: %.2f\n"
                + "Comision: %.2f\n"
                , 

                obtenerCliente().getNombre(),
                obtenerCliente().getApellido(),
                obtenerCliente().getCedula(),
                obtenerBanco().getBanco(),
                obtenerBanco().getSucursales(),
                obtenerValorCheque(),
                obtenerComision());

        return cadena;
    }
}
