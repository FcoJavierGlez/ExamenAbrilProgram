package figuras;

/**
 * Clase Cuadrado, hereda de la Clase Rectángulo e implementa
 * la interfaz Comparable.
 * 
 * Esta clase crea una figura geométrica de tipo cuadrado, se
 * le pasa como parámetro al constructor el valor del lado.
 * 
 * @author Francisco Javier González Sabariego
 * @version 1.0 || 05/04/2019
 *
 */
public class Cuadrado extends Rectangulo implements Comparable<Cuadrado>{
  
  /**
   * Constructor.
   * 
   * @param lado Valor (int) del lado del cuadrado.
   */
  public Cuadrado (int lado) {
    super(lado, lado);
  }
  
  /**
   * Compara dos cuadrados entre sí.
   * 
   * @return si son iguales devuelve 0 y otro valor si no lo son.
   */
  @Override
  public int compareTo(Cuadrado c) {
    return this.getAncho()-c.getAncho(); 
  }
  /**
   * Asigna un valor al lado
   * 
   * @param lado  Valor (int) del lado.
   */
  public void setLado(int lado) {
    if (lado>0 && lado<11) {
      setAncho(lado);
      setAlto(lado);
    } else {
      throw new ArithmeticException();
    }      
  }
  
  /**
   * Devuelve el valor del lado.
   * 
   * @return Lado (int) del cuadrado.
   */
  public int getLado() {
    return this.getAncho();
  }
  
}
