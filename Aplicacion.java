
/**
 * Write a description of class Aplicacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aplicacion extends Producto
{
    // instance variables - replace the example below with your own
    private String nombreApp;
    private double pesoApp;
    private Categoria categoriaApp;

    /**
     * Constructor for objects of class Aplicacion
     */
    public Aplicacion(String nombreApp , double pesoApp , Categoria categoriaApp)
    {
       this.nombreApp = nombreApp;
       this.pesoApp = pesoApp;
       this.categoriaApp = categoriaApp;
    }
    public String getNombre()
    {
        return nombreApp;
    }
    public double getTamanoEnMB()
    {
        return pesoApp;
        
    }
    public String getCategoria()
    {
       String cadenaADevolver = " ";
       switch(categoriaApp){
           case JUEGOS:
           cadenaADevolver = "Juegos";
           break;
           case COMUNICACIONES:
           cadenaADevolver = "Comunicaciones";
           break;
           case PRODUCTIVIDAD:
           cadenaADevolver = "Productividad";
           break;
           case MULTIMEDIA :
           cadenaADevolver = "Multimedia";
           break;
        }
        return cadenaADevolver;
        
        
    }
    public double getPrecio()
    {
        int precio =0;
        return precio;
        
    }
    public void comprado()
    {
        numVentas++;
    }
    
   
}