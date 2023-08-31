package clase_4.desafio_generico;

public class DesafioGenerico {

  static int numero = 10; // Variable global

  public static void main(String[] args) {
    System.out.println(numero); // 10

    incrementar(); // Sumo 1

    System.out.println(numero); // 11
  }

  static public void incrementar() {
    numero += 2;
  }
}
