package clase_6.ejemplos;

public class Perro implements Mascota {

  @Override
  public void jugar() {
    System.out.println("El perro juega");
  }

  @Override
  public boolean esAmigable() {
    return true;
  }

  public void ladrar() {
    System.out.println("Guau guau");
  }

  // Sobrecarga
  public void comer(String tipoComida) {
    if (tipoComida == "Dog Chau") {
      System.out.println("El perro no come Dog Chau");
    } else {
      System.out.println("El perro come " + tipoComida);
    }
  }

  public void comer(int cantidad) {
    if (cantidad > 50) {
      System.out.println("El perro no puede comer tanto");
    } else {
      System.out.println("El perro come " + cantidad + " gramos");
    }
  }

}
