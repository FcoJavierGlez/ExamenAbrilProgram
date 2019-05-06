package figuras;

import java.util.Scanner;

/**
 * 
 * Clase Test para la figura Rectángulo.
 * 
 * 
 * @author Francisco Javier González Sabariego
 *
 */
public class TestRectangulo {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int ancho;
    int alto;
    
    System.out.println("Se van a crear tres rectángulos: a, b y c."
                    + "Tanto b como c darán un error y se les asignará un valor por defecto.");
    
    
    
    //Creamos rectángulos a, b y c:
    
    //a:
    Rectangulo a = null;
    
    try {
      System.out.print("\nVamos a crear el rectángulo a con valores: ancho=7 y alto=4.");
      a = new Rectangulo(7, 4);
      System.out.print("\nRectángulo creado.\n");
    } catch (ArithmeticException e1) {
      System.err.print("\nEl rectángulo no pudo ser creado. Valores inválidos.\n");
    } 
    
    
    esperaSegundo();
    
    
    //b:
    Rectangulo b = null;
    
    try {
      System.out.print("\nVamos a crear el rectángulo b con valores: ancho=3 y alto=0.");
      b = new Rectangulo(3, 0);
      System.out.print("\nRectángulo creado.\n");
    } catch (ArithmeticException e1) {
      System.err.print("\nEl rectángulo no pudo ser creado. Valores inválidos.\n");
    }
    
    
    esperaSegundo();
    
    
    //c:
    Rectangulo c = null;
    
    try {
      System.out.print("\nVamos a crear el rectángulo c con valores: ancho=30 y alto=-2.");
      c = new Rectangulo(30, -2);
      System.out.print("\nRectángulo creado.\n");
    } catch (ArithmeticException e1) {
      System.err.print("\nEl rectángulo no pudo ser creado. Valores inválidos.\n");
    }
    
    esperaSegundo();
    
    
    //Imprimimos los 3 rectángulos:
    System.out.print("\nVamos a imprimir el rectángulo a:");
    
    if (a!=null) {
      System.out.print("\nRectángulo a: \n" + a);
    } else {
      System.out.print("\nEl rectángulo \"a\" no existe\n");
    }
    
    System.out.print("\nVamos a imprimir el rectángulo b:");
    if (b!=null) {
      System.out.print("\nRectángulo b: \n" + b);
    } else {
      System.out.print("\nEl rectángulo \"b\" no existe\n");
    }
    
    System.out.print("\nVamos a imprimir el rectángulo c:");
    if (c!=null) {
      System.out.print("\nRectángulo c: \n" + c);
    } else {
      System.out.print("\nEl rectángulo \"c\" no existe\n");
    }

    //Modificamos los valores del rectángulo a:
    System.out.println("\nVamos a modificar los valores del rectángulo a.");
    
    try {
      System.out.println("Inserte el valor del ancho del rectángulo a.");
      ancho = Integer.parseInt(s.nextLine());
      a.setAncho(ancho);
      System.out.println("Inserte el valor del alto del rectángulo a.");
      alto = Integer.parseInt(s.nextLine());
      a.setAlto(alto);
    } catch (ArithmeticException e) {
      System.err.println("ERROR. Debe insertar un número entero. "
          + "\nNo se han producido los cambios.");
      a.setAncho(7);
      a.setAlto(4);
    }
    
    //Imprimimos de nuevo los 3 rectángulos:
    System.out.println("\n");
    System.out.print("\nRectángulo a: \n" + a);
    
  }

  /**
   * Esperamos 1 segundo:
   */
  private static void esperaSegundo() {
    try {
      Thread. sleep(1000);
    } catch (Exception e) {}
  }
}
