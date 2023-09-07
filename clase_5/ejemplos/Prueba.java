package clase_5.ejemplos;

public class Prueba {

  public static void main(String[] args) {
    Perro firu = new Perro();
    firu.setEdad(2);

    Gato mishi = new Gato();

    mishi.lavarse();

    // Animal michu = new Gato(); // Polimorfismo
    // michu = new Perro();
  }
}
