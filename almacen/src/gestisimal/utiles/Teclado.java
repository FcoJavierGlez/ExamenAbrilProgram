package gestisimal.utiles;

import java.util.Scanner;

/**
 * Clase teclado, lee la entrada de datos y retorna el valor si es correcto.
 * 
 * @author Francisco Javier González Sabariego
 *
 */
public class Teclado {
  
  static Scanner s = new Scanner(System.in);
  
  /**
   * Lee y devuelve una cadena.
   * 
   * @return Cadena de caracteres (String).
   */
  public String leeCadena() {
    String cadena = "";
    cadena = s.nextLine();
    return cadena;
  }
  
  /**
   * Imprime un mensaje por pantalla, lee y devuelve una cadena.
   * 
   * @return Cadena de caracteres (String).
   */
  public String leeCadena(String mensaje) {
    String cadena = "";
    System.out.println(mensaje);    
    cadena = s.nextLine();
    return cadena;
  }
  
  /**
   * Lee y devuelve un caracter.
   * 
   * @return Caracter (char).
   */
  public char leeCaracter() {
    char caracter;   
    try {
      caracter = leeCadena().charAt(0);
    } catch (Exception e) {
      System.err.println("Caracter incorrecto.");
      caracter = 0;
    }
    return caracter;
  }
  
  /**
   * Imprime un mensaje por pantalla, lee y devuelve un caracter.
   * 
   * @return Caracter (char).
   */
  public char leeCaracter(String mensaje) {
    char caracter;   
    try {
      caracter = leeCadena(mensaje).charAt(0);
    } catch (Exception e) {
      System.err.println("Caracter incorrecto.");
      caracter = 0;
    }
    return caracter;
  }
  
  /**
   * Lee y devuelve un entero.
   * 
   * @return Número entero (int).
   */
  public int leeEntero() {
    int numero = 0;
    try {
      numero = Integer.parseInt(leeCadena());
    } catch (Exception e) {
      System.err.println("No ha insertado un número entero. Por defecto valdrá 0.");
    }    
    return numero;
  }
  
  /**
   * Imprime un mensaje por pantalla, lee y devuelve un entero.
   * 
   * @return Número entero (int).
   */
  public int leeEntero(String mensaje) {
    int numero = 0;
    try {
      numero = Integer.parseInt(leeCadena(mensaje));
    } catch (Exception e) {
      System.err.println("No ha insertado un número entero. Por defecto valdrá 0.");
    } 
    return numero;
  }
  
  /**
   * Lee y devuelve un decimal.
   * 
   * @return Número decimal (double).
   */
  public double leeDecimal() {
    double numero = 0;
    try {
      numero = Double.parseDouble(leeCadena());
    } catch (Exception e) {
      System.err.println("No ha insertado un número decimal. Por defecto valdrá 0.");
    }    
    return numero;
  }
  
  /**
   * Imprime un mensaje por pantalla, lee y devuelve un decimal.
   * 
   * @return Número decimal (double).
   */
  public double leeDecimal(String mensaje) {
    double numero = 0;
    try {
      numero = Double.parseDouble(leeCadena(mensaje));
    } catch (Exception e) {
      System.err.println("No ha insertado un número decimal. Por defecto valdrá 0.");
    } 
    return numero;
  }  
  
}
