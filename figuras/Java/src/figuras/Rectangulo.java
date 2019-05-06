package figuras;


/**
 * (Java) Crea la clase Rectángulo de forma que:
 * <ul>
 * <li>Un objeto de esta clase se construye pasándole el ancho y el alto. Ninguno de los dos atributos
 * puede ser menor o igual a cero ni mayor que diez, en esos casos se debe lanzar la excepción
 * ArithmeticException.</li>
 * 
 * <li>Mediante getters y setters permite que se acceda y se modifique el ancho y el alto del
 * rectángulo teniendo en cuenta las restricciones en cuanto a las dimensiones del apartado
 * anterior.</li>
 * 
 * <li>Al imprimir en pantalla un objeto de la clase usando System.out.print se debe dibujar el
 * rectángulo por la pantalla (de manera similar a como se imprime un cuadrado en la página 130
 * del libro Aprende Java con Ejercicios).</li>
 * 
 * <li>Crea la clase Cuadrado como subclase de Rectángulo. Le debes añadir a su comportamiento
 * la posibilidad de comparar objetos cuadrados entre sí.</li>
 * 
 * <li>Crea los programas de test correspondientes a ambas clases. Debes provocar que se lance la
 * excepción y capturarla.</li>
 * </ul>
 * 
 * 
 * @author Francisco Javier González Sabariego
 * @version 1.0 || 05/04/2019
 *
 */
public class Rectangulo {
  
  private int ancho;
  private int alto;
  
  /**
   * Constructor.
   * 
   * @param ancho Valor (int) del ancho de la figura.
   * @param alto  Valor (int) del alto de la figura.
   * @throws ArithmeticException Lanza esta excepción cuando los valores 
   *                              pasados al constructor son incorrectos.
   */
  public Rectangulo(int ancho, int alto) throws ArithmeticException {
    setAncho(ancho);
    setAlto(alto);
  }
  
  
  
  //###############################     GETTERS     ###############################\\
  
  /**
   * Devuelve el valor del ancho de la figura.
   * 
   * @return Valor (int) del ancho de la figura.
   */
  public int getAncho() {
    return this.ancho;
  }
  
  /**
   * Devuelve el valor del alto de la figura.
   * 
   * @return Valor (int) del alto de la figura.
   */
  public int getAlto() {
    return this.alto;
  }
  
  
  //###############################     SETTERS     ###############################\\
  
  /**
   * Asigna un nuevo valor al ancho de la figura.
   * 
   * @param ancho Valor (int) del ancho a asignar a la figura.
   */
  public void setAncho(int ancho) throws ArithmeticException {
    if (ancho>0 && ancho<11) {
      this.ancho = ancho;
    } else {
      throw new ArithmeticException();
    }
  }
  
  /**
   * Asigna un nuevo valor al alto de la figura.
   * 
   * @param alto Valor (int) del alto a asignar a la figura.
   */
  public void setAlto(int alto) throws ArithmeticException {
    if (alto>0 && alto<11) {
      this.alto = alto;
    } else {
      throw new ArithmeticException();
    }
  }
  
  /**
   * Imprime la figura.
   */
  public String toString() {
    String salida ="";
    for (int i=0; i<this.alto; i++) {     
      if (i==0 || i==this.alto-1) {
        for (int k=0; k<this.ancho; k++) {
          salida += "[]";
          if (k==this.ancho-1) //Si es igual al ancho de la figura introduzco un salto de línea
            salida += "\n";
        }
      } else {
        for (int j=0; j<this.ancho; j++) {
          if (this.ancho==1) {
            salida += "[]\n";
          } else if(j==0) {
            salida += "[]";
          } else if (j==this.ancho-1) {
            salida += "[]\n";
          } else {
            salida += "  ";
          }
        }
      } 
    }
    return salida;
  }
  
  
}
