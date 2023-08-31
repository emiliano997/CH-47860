package clase_4.ejemplos;

public class Perro {

  // Atributos / Caracteristicas

  private int edad;
  private String nombre;
  private String raza;
  private String color;

  static int cantidadPerros = 0;

  public static final int PATAS;

  static {
    PATAS = 4;
  }

  // Métodos / Acciones
  // ladran
  public void ladrar() {
    System.out.println("El perro esta ladrando");
  }

  // corren
  public void correr() {
    System.out.println("El perro esta corriendo");
  }

  // muerden
  public void morder() {
    System.out.println("El perro esta mordiendo");
  }

  // parametros
  public static void imprimirAlgo(String texto, int numero) {
    System.out.println(texto); // → algo
    texto = "otra cosa";
    System.out.println(texto); // → otra cosa
  }

  public static void imprimirAlgo(int numero) {

    System.out.println(numero);
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) throws Exception {
    if (edad > 12) {
      // Arroja una nueva excepción
      throw new Exception("La edad no puede ser mayor a 12");
    } else {
      this.edad = edad;
    }
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

}