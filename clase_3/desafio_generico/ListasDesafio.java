package clase_3.desafio_generico;

import java.util.ArrayList;
import java.util.List;

public class ListasDesafio {

  public static void main(String[] args) {
    List<Integer> numeros = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      // int random = (int) (Math.random() * 10) + 1;
      numeros.add((int) (Math.random() * 10) + 1);
    }

    for (int numero : numeros) {
      System.out.println(numero);
      if (numero % 3 == 0) {
        break;
      }
    }

  }
}
