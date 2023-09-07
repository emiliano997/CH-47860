package clase_6.ordenamiento;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo {

  public static void main(String[] args) {
    List<Integer> numeros = new ArrayList<>();
    numeros.add(1);
    numeros.add(3);
    numeros.add(15);
    numeros.add(8);
    numeros.add(2);

    System.out.println("Orden original: ");
    for (Integer numero : numeros) {
      System.out.println(numero);
    }

    // Como ordenarlos
    numeros.sort((n1, n2) -> n1.compareTo(n2)); // Orden normal
    numeros.sort((n1, n2) -> n2.compareTo(n1)); // Orden inverso

    System.out.println("Ordenado por numero");
    for (Integer numero : numeros) {
      System.out.println(numero);
    }
  }
}
