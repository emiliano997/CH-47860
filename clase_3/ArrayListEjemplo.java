package clase_3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEjemplo {

  public static void main(String[] args) {

    List<String> coloresOriginal = new ArrayList<>();
    coloresOriginal.add("Blanco");
    coloresOriginal.add("Azul");

    List<String> coloresDestino = new ArrayList<>();
    coloresDestino.add("Celeste"); // 0
    coloresDestino.add("Verde"); // 1
    coloresDestino.add("Blanco"); // 2
    coloresDestino.add("Azul"); // 3
    coloresDestino.add("Marron");
    coloresDestino.add("Azul");
    coloresDestino.add("Purpura");
    coloresDestino.add("Azul");

    // Métodos
    // containsAll
    // boolean contieneOriginal = coloresOriginal.containsAll(coloresDestino);
    // System.out.println("Contiene original: " + contieneOriginal);

    // boolean contieneDestino = coloresDestino.containsAll(coloresOriginal);
    // System.out.println("Contiene Destino: " + contieneDestino);

    // addAll
    // coloresOriginal.addAll(coloresDestino);

    // for (String item : coloresOriginal) {
    // System.out.println("El color es:" + item);
    // }

    // removeAll
    // coloresDestino.removeAll(coloresOriginal);

    // for (String item : coloresDestino) {
    // System.out.println("El color es:" + item);
    // }

    // retainAll
    // coloresDestino.retainAll(coloresOriginal);

    // for (String item : coloresDestino) {
    // System.out.println("El color es:" + item);
    // }

    // Clear
    // coloresDestino.clear();

    // for (String item : coloresDestino) {
    // System.out.println("El color es:" + item);
    // }

    // get
    // System.out.println("El color favorito es:" + coloresDestino.get(3));

    // set
    // coloresDestino.set(1, "Marron");

    // for (String item : coloresDestino) {
    // System.out.println("El color es:" + item);
    // }

    // remove
    // coloresDestino.remove(0);

    // System.out.println("El color en la pos 0 es ahora: " +
    // coloresDestino.get(0));

    // indexOf
    // String colorFavorito = "Azul";

    // int indiceColorFav = coloresDestino.indexOf(colorFavorito);

    // if (indiceColorFav == -1) {
    // System.out.println("El color favorito no existe");
    // } else {
    // System.out.println("El color favorito existe: " +
    // coloresDestino.get(indiceColorFav));
    // }

    // lastIndexOf

    String colorFavorito = "Azul";

    int indiceColorFav = coloresDestino.lastIndexOf(colorFavorito);

    if (indiceColorFav == -1) {
      System.out.println("El color favorito no existe");
    } else {
      System.out.println("El color favorito existe: " + coloresDestino.get(indiceColorFav));
      System.out.println("La posicion es: " + indiceColorFav);
    }

  }
}
