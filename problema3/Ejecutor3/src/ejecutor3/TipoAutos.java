/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutor3;

/**
 *
 * @author ASUS
 */
public class TipoAutos {
    
    // cédula del dueño, marca de vehículo, año de fabricación, valor de vehículo y valor de la matricula. 
    // El valor de la matricula es igual al 0.002% del valor de vehículo por el número de años de antiguedad del vehiculo.
   
    private String cedulaD;
    private Fabricante fabricante;
    private int anioFabricacion;
    private double valorAuto,matricula;
    
    public TipoAutos(String cd,Fabricante num, int af, double va){
        
        cedulaD = cd;
        fabricante = num;
        anioFabricacion = af;
        valorAuto=va;
        
    }

    public void establecerCedulaD(String c){
        cedulaD = c;
    }
    
    public void establecerFabricante(Fabricante c){
        
        fabricante = c;
        
    }
        public void establecerAnioFabricacion(int c){
        anioFabricacion = c;
    }
        public void establecerValorAuto(double c){
            valorAuto = c;
        }

      public void calcularMatricula(){
         
        matricula = ((2023 - anioFabricacion)* valorAuto) * 0.0002; 
        
    }
         
    
    public String obtenerCedulaD(){
        return cedulaD;
    }
    
    public Fabricante obtenerFabricante(){
        
        return fabricante;
        
    }
    
    public int obtenerAnioFabricacion(){
        return anioFabricacion;
    }
    
    public double obtenerValorAuto(){
        return valorAuto;
    }

    public double obtenerMatricula(){
        return matricula;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Profesor:\n"
                + "Cedula del Duenio: %s\n"
                + "Nombre Fabricante: %s\n"
                + "Ciudad de origen: %s\n" 
                + "Anio de Fabricacion: %d \n"
                + "Valor del vehiculo: %.2f\n"
                + "Valor matricula: %.2f\n",

                obtenerCedulaD(),
                obtenerFabricante().getNombre(),
                obtenerFabricante().getCiudO(),
                obtenerAnioFabricacion(),
                obtenerValorAuto(),
                obtenerMatricula());

        return cadena;
    }
}