
/**
 * Clase Producto que contiene las caracteristicas necesarias de cada producto para que pueda ser gestionado en la cooperativa.
 * 
 * @author (Angela Alexandra Guzman Garcia) 
 * @version (001)
 */
public class Logistica
{
    // instance variables - replace the example below with your own
    private int distanciaKm;
    private boolean esPerecedero;
    private String tipoLogistica;

    /**
     * Constructor for objects of class Logistica
     */
    public Logistica(int distanciaKm, boolean esPerecedero)
    {
        // initialise instance variables
         this.distanciaKm = distanciaKm;
         this.esPerecedero = esPerecedero;
    }
    
     public int getDistancia()
    {
        return  this.distanciaKm;
        
    }
     public void setDistancia(int distanciaKm) {
        this.distanciaKm = distanciaKm;
    }
     public boolean getPerecedero()
    {
        return  this.esPerecedero;
        
    }
     public void setEsPerecedero(boolean esPerecedero) {
        this.esPerecedero = esPerecedero;
    }
    
     public int transportar(){
         return 0;
        
    }
    public int calcularCoste(){
         return 0;
        
    }
    
}