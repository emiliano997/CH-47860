package clase_6.graficos;

public class Rectangulo extends Grafico {

  @Override
  void dibujar() {
    System.out.println("Dibujando rectangulo");
  }

  @Override
  void redimensionar() {
    System.out.println("Redimensionando rectangulo");
  }

  @Override
  public void moverA(int x, int y) {
    if (x < 5) {
      System.out.println("El rectángulo no se puede mover");
    } else {
      super.moverA(x, y);
    }
  }

}
