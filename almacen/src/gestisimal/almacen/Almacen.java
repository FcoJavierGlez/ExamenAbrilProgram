package gestisimal.almacen;

//import java.sql.ResultSet;
//import java.sql.SQLException;
import java.util.ArrayList;
import gestisimal.utiles.*;

/**
* Clase Almacen que se encarga de la gestión de todo el almacen y de la comunicación con la clase Articulo.
* 
* @author JavierGF00 R4f4Lc FcoJavierGlez
*
*/
public class Almacen {
  
  static Teclado t = new Teclado();
  
   private ArrayList<Articulo> almacen = new ArrayList<Articulo>();
   
   
  /**
   * Devuelve un articulo si existe
   * 
   * @param codigo
   * @return 
   */
  private Articulo getArticulo(int codigo) {
    for (int i=0; i<almacen.size(); i++) {
      if((almacen.get(i)).getCodigo() == codigo)
        return (almacen.get(i));
    }
    return null;
  }
  
  /**
   * Añade el artículo al almacén siempre y cuando no exista.
   * 
   * @param descripcion
   * @param precioCompra
   * @param precioVenta
   * @return true de que ha insertado correctamente
   * @throws IvaInvalidoException Lanza esta excepción si el artículo recibe un tipo de IVA null
   */
    public boolean alta(String descripcion, double precioCompra, double precioVenta, IVA iva) throws IvaInvalidoException {
      return almacen.add(new Articulo(descripcion, precioCompra, precioVenta, iva));      
    }
  
  /**
   * Elimina el artículo del almacén siempre y cuando exista.
   * @param codigo
   * @return true si se ha eliminado. false en otro caso
   * @throws ArticuloIncorrectoException Lanza esta excepción si el artículo seleccionado no existe.
   */
  public boolean baja(int codigo) throws ArticuloIncorrectoException {
    if (getArticulo(codigo) != null) {
      return almacen.remove(getArticulo(codigo));
    } else {
      throw new ArticuloIncorrectoException("\nEl artículo seleccionado no existe");
    }    
  }
   
  /**
   * Modifica la descripción del artículo del almacén siempre y cuando exista.
   * 
   * @param codigo código del articulo
   * @param descripcion descripción nueva del articulo
   * @return true si se ha modificado. false en otro caso
   * @throws ArticuloIncorrectoException Lanza esta excepción si el artículo no existe.
   */
  public void modificarDescripcion(int codigo, String descripcion) throws ArticuloIncorrectoException {
    if(getArticulo(codigo) != null) {
      getArticulo(codigo).setDescripcion(descripcion);
    } else {
      throw new ArticuloIncorrectoException("\nEl artículo seleccionado no existe");
    }
  }
  
  /**
   * Modifica el precio de compra del artículo del almacén siempre y cuando exista.
   * 
   * @param codigo código del articulo
   * @param PrecioCompra Precio de compra nuevo del articulo
   * @return true si se ha modificado. false en otro caso
   * @throws ArticuloIncorrectoException Lanza esta excepción si el artículo no existe.
   */
  public void modificarPrecioCompra(int codigo, double PrecioCompra) throws ArticuloIncorrectoException {
    if(getArticulo(codigo) != null) {
      getArticulo(codigo).setPrecioCompra(PrecioCompra);
    } else {
      throw new ArticuloIncorrectoException("\nEl artículo seleccionado no existe");
    }
  }
  
  /**
   * Modifica el precio de venta del artículo del almacén siempre y cuando exista.
   * 
   * @param codigo código del articulo
   * @param PrecioVenta Precio de venta nuevo del articulo
   * @return true si se ha modificado. false en otro caso
   * @throws ArticuloIncorrectoException Lanza esta excepción si el artículo no existe.
   */
  public void modificarPrecioVenta(int codigo, double PrecioVenta) throws ArticuloIncorrectoException {
    if(getArticulo(codigo) != null) {
      getArticulo(codigo).setPrecioVenta(PrecioVenta);
    } else {
      throw new ArticuloIncorrectoException("\nEl artículo seleccionado no existe");
    }
  }
  
  
  /**
   * Modifica el precio de venta del artículo del almacén siempre y cuando exista.
   * 
   * @param codigo código del articulo
   * @param PrecioVenta Precio de venta nuevo del articulo
   * @return true si se ha modificado. false en otro caso
   * @throws ArticuloIncorrectoException Lanza esta excepción si el artículo no existe.
   * @throws IvaInvalidoException Lanza esta excepción si el artículo recibe un tipo de IVA null.
   */
  public void modificarIva(int codigo, IVA iva) throws ArticuloIncorrectoException, IvaInvalidoException {
    if(getArticulo(codigo) != null) {
      getArticulo(codigo).setTipoDeIva(iva);
    } else {
      throw new ArticuloIncorrectoException("\nEl artículo seleccionado no existe");
    }
  }
  
  
  /**
   * Añade a cada articulo más stock.
   * 
   * @param codigo Código del articulo
   * @throws ArticuloIncorrectoException Lanza esta excepción si el artículo no existe.
   * @throws ErrorStockException Lanza esta excepción cuando el stock es negativo.
   */
  public void entradaMercancia(int codigo, int cantidadArticulos) throws ArticuloIncorrectoException, ErrorStockException {
    if(getArticulo(codigo) != null) {
      getArticulo(codigo).incrementaStock(cantidadArticulos);
    } else {
      throw new ArticuloIncorrectoException("\nEl artículo seleccionado no existe");
    }
  }
  
  
  /**
   * Elimina stock a cada articulo.
   * 
   * @param codigo Código del articulo
   * @throws ArticuloIncorrectoException Lanza esta excepción si el artículo no existe.
   * @throws ErrorStockException Lanza esta excepción cuando el stock es negativo.
   */
  public void salidaMercancia(int codigo, int cantidadArticulos) throws ArticuloIncorrectoException, ErrorStockException {
    if(getArticulo(codigo) != null) {
      getArticulo(codigo).decrementaStock(cantidadArticulos);
      } else {
        throw new ArticuloIncorrectoException("\nEl artículo seleccionado no existe");
      }
  }
  
  
  /**
   * Muestra todos los articulos en el almacen.
   * 
   * @return 
   */
  public StringBuilder mostrarLista() {
    StringBuilder cadena = new StringBuilder();
    for (int i=0; i<almacen.size(); i++) {
      cadena.append("\n\nArtículo nº (" + (almacen.get(i)).getCodigo() + "): \n" + (almacen.get(i)).toString());
    }
    return cadena;
  }
  
}
