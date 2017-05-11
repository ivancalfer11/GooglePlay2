
/**
 * Write a description of class Multimedia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class ProductoMultimedia extends Producto
{
    // instance variables - replace the example below with your own
    private String titulo;
    private int anoPubli;

    /**
     * Constructor for objects of class Multimedia
     */
    public ProductoMultimedia(String titulo , int anoPubli)
    {
       this.titulo = titulo;
       this.anoPubli = anoPubli;
    }
    public String getTitulo()
    {
        return titulo;
    }
    public int getAno()
    {
        return anoPubli;
    }
   
}
