import java.util.ArrayList;

public class Usuario
{
    // instance variables - replace the example below with your own
    private String correoUsuario;
    private ArrayList<Producto> productosComprados = new ArrayList<Producto>();
    /**
     * Constructor for objects of class Usuario
     */
    public Usuario(String correoUsuario)
    {
        this.correoUsuario = correoUsuario;
        
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getNombreCuenta()
    {
        return correoUsuario;
    }
   public void comprarProducto(Producto producto)
   {
       productosComprados.add(producto);
   }
    
}
