package clase_6.ejemplos;

public class Gato implements Mascota {

  @Override
  public void jugar() {
    System.out.println("El gato juega");
    System.out.println("Se aburre rápido");
  }

  @Override
  public boolean esAmigable() {
    return false;
  }

}
