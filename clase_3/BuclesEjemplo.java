package clase_3;

import java.util.ArrayList;
import java.util.List;

public class BuclesEjemplo {

  public static void main(String[] args) {
    int limite = 5;

    int flag = 5;

    // while
    // while (flag < limite) {
    // System.out.println("Hola");
    // flag++;
    // }

    // do while
    // do {
    // System.out.println("Hola");
    // flag++;
    // } while (flag < limite);

    // for
    int[] numeros = new int[5];
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = (int) (Math.random() * 10) + 1;
    }

    // for mejorado
    for (int numero : numeros) {
      System.out.println("Numero: " + numero);
    }

    // foreach
    List<String> nombres = new ArrayList<>();
    nombres.add("Gustavo");
    nombres.add("Enrique");
    nombres.add("Augusto");

    nombres.forEach(nombre -> {
      System.out.println("El nombre es: " + nombre);
    });
  }
}
