package clase_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEjemplo {

  public static void main(String[] args) {

    List<String> coloresDestino = new ArrayList<>();
    coloresDestino.add("Celeste"); // 0
    // coloresDestino.add("Verde"); // 1
    // coloresDestino.add("Blanco"); // 2
    // coloresDestino.add("Azul"); // 3

    // iterator
    Iterator<String> iterador = coloresDestino.iterator();

    while (iterador.hasNext()) {
      // System.out.println(iterador.hasNext());
      String colorWhile = iterador.next();
      System.out.println("Color: " + colorWhile);
    }

    do {
      String color = iterador.next();
      System.out.println("Color: " + color);
    } while (iterador.hasNext());

    // for (String color : coloresDestino) {
    // System.out.println(color);
    // }

  }
}
