package clase_5.ejemplos;

public class Gato extends Animal {

  String ronroneo;

  public Gato() {
  }

  public Gato(String nombre, int edad, String raza, boolean isFriendly, String color, double peso, String ronroneo) {
    super(nombre, edad, raza, isFriendly, color, peso);
    this.ronroneo = ronroneo;
  }

  public void lavarse() {
    System.out.println("El gato se esta lavando");
  }
}
