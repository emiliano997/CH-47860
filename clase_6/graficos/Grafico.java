package clase_6.graficos;

public abstract class Grafico {

  int y, x;

  void moverA(int x, int y) {
    System.out.println("Moviendo a " + x + ", " + y);
  }

  abstract void dibujar();

  abstract void redimensionar();
}
