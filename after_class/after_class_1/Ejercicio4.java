package after_class.after_class_1;

import java.util.Scanner;

public class Ejercicio4 {

  public static void main(String[] args) {
    // input
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingresa un numero: ");
    int numero = sc.nextInt();

    // boolean isPar = numero % 2 == 0;

    // if (isPar) {
    // System.out.println("El numero es par");
    // } else {
    // System.out.println("Es impar");
    // }

    String mensaje = numero % 2 == 0 ? "Es par" : "Es impar";

    System.out.println(mensaje);

    sc.close();

  }
}
