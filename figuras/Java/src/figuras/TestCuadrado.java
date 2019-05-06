package figuras;

/**
 * 
 * Clase TestCuadrado para testear la Clase Cuadrado.
 * 
 * @author Francisco Javier González Sabariego
 *
 */
public class TestCuadrado {
  public static void main(String[] args) {
    
    //Creamos 3 cuadrados: a, b, c y d. Tanto a como b son iguales, en cambio c no. Y d es un cuadrado inválido.
    //a:
    Cuadrado a = null;
    try {
      System.out.println("Vamos a crear el cuadrado \"a\" con un lado de valor 4.");
      a = new Cuadrado(4);
      System.out.println("Cuadrado creado.\n");
    } catch (ArithmeticException ae) {}
    
    Cuadrado b = null;
    try {
      System.out.println("Vamos a crear el cuadrado \"b\" con un lado de valor 4.");
      b = new Cuadrado(4);
      System.out.println("Cuadrado creado.\n");
    } catch (ArithmeticException ae) {}
    
    Cuadrado c = null;
    try {
      System.out.println("Vamos a crear el cuadrado \"c\" con un lado de valor 7.");
      c = new Cuadrado(7);
      System.out.println("Cuadrado creado.\n");
    } catch (ArithmeticException ae) {}
    
    Cuadrado d = null;
    try {
      System.out.println("Vamos a crear el cuadrado \"d\" con un lado de valor 0.");
      d = new Cuadrado(0);
      System.out.println("Cuadrado creado.\n");
    } catch (ArithmeticException ae) {
      System.err.println("\nValores incorrectos, el cuadrado no pudo ser creado.\n");
    }
    
    esperaSegundo();
    
    //Comparamos:
    System.out.println("\nAhora vamos a comparar los cuadrados:\n");
    
    if (a.compareTo(b)==0) {
      System.out.println("Cuadrado a y cuadrado b son iguales.");
    } else {
      System.out.println("Cuadrado a y cuadrado b no son iguales.");
    }
    
    if (a.compareTo(c)==0) {
      System.out.println("Cuadrado a y cuadrado c son iguales.");
    } else {
      System.out.println("Cuadrado a y cuadrado c no son iguales.");
    }
    
    //Imprimimos:
    System.out.println("\nCuadrado a: \n" + a);
    System.out.println("\nCuadrado b: \n" + b);
    System.out.println("\nCuadrado c: \n" + c);
    
    if (d!=null) {
      System.out.println("\nVamos a imprimir el cuadrado d: \n");
      System.out.println("\nCuadrado d: \n" + d);
    } else {
      System.err.println("\nEl cuadrado \"d\" no existe.\n");
    }
    
    //Asignamos un valor incorrecto (0) al lado del cuadrado c:
    System.out.println("\nY ahora vamos a crear modificar el cuadrado \"c\" con lado 0 \n");
    c.setLado(0);
    
    esperaSegundo();
    
    System.out.println("\nY ahora vamos a crear modificar el cuadrado \"c\" con lado 11 \n");
    c.setLado(11);
    
    esperaSegundo();
    
    //Comprobamos que el cuadrado c no ha cambiado.
    System.out.println("\nEl cuadrado \"c\" no ha cambiado:\n");
    System.out.println("\nCuadrado c: \n" + c);
  }

  /**
   * Esperamos 1 segundo:
   */
  private static void esperaSegundo() {
    try {
      Thread.sleep(1000);
    } catch (Exception e) {}
  }
}
