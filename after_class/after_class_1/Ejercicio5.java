package after_class.after_class_1;

import java.util.Scanner;

public class Ejercicio5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese un numero: ");
    double numero = sc.nextInt();

    System.out.println("Ingrese otro numero: ");
    double numero2 = sc.nextInt();

    System.out.println("Ingrese una operacion matematica: ");
    String option = sc.next();

    switch (option) {
      case "+":
        System.out.println(numero + numero2);
        break;

      case "-":
        System.out.println(numero - numero2);
        break;

      case "*":
        System.out.println(numero * numero2);
        break;

      case "/":
        if (numero == 0 || numero2 == 0) {
          System.out.println("No se puede dividir con 0");
          break;
        }
        System.out.println(numero / numero2);
        break;
      default:
        System.out.println("Opcion inválida");

        break;
    }

    sc.close();
  }
}
