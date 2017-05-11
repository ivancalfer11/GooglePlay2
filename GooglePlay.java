import java.util.ArrayList;

public class GooglePlay
{
    // instance variables - replace the example below with your own
    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    private ArrayList<Producto> productosDisponibles = new ArrayList<Producto>();

    /**
     * Constructor for objects of class GooglePlay
     */
    public GooglePlay()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void addUsuario(Usuario user)
    {
        usuarios.add(user);
        
    }
    public int getNumeroUsuarios()
    {
        int numeroUsuarios = usuarios.size();
        return numeroUsuarios;
    }
    public int getNumeroProductos()
    {        
       int numeroProductos = productosDisponibles.size();
       return numeroProductos;
    }
    public void addProducto(Producto producto)
    {
        productosDisponibles.add(producto);
    }
}
