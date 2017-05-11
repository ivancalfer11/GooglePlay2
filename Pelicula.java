
/**
 * Write a description of class Película here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelicula extends ProductoMultimedia
{
    // En el atributo booleano calidad true indica FullHD y false cualquier otra calidad.
   
    private int duracion;
    private int calidad;

    /**
     * Constructor for objects of class Película
     */
    public Pelicula(String titulo , int anoPubli , int duracion , int calidad)
    {
        super(titulo, anoPubli);
        this.duracion = duracion;
        this.calidad = calidad;
    }
    public int getDuracion()
    {
        return duracion;
    }
    public String getCalidad()
    {
        String cadenaADevolver = " ";
        switch(calidad){
           case 1080:
           cadenaADevolver = "FullHD";
           break;
           default:
           cadenaADevolver = "HD";
           break;
           
        }
        return cadenaADevolver;
    }
    public void comprado()
    {
        numVentas++;
    }
}
