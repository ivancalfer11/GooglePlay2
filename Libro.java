
/**
 * Write a description of class Ebook here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Libro extends ProductoMultimedia
{
    // instance variables - replace the example below with your own
   
    private int numPag;
    private boolean ficcion;

    /**
     * Constructor for objects of class Ebook
     */
    public Libro(String titulo, int anoPubli , int numPag , boolean ficcion)
    {
        super(titulo, anoPubli);
        this.numPag = numPag;
        this.ficcion = ficcion;
    }
    public int getNumeroPaginas()
    {
        return numPag;
    }
    public boolean getFiccion()
    {
        return ficcion;
    }
    
    
}
