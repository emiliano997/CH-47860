package clase_5.ejemplos;

public class Animal {

  private String nombre;
  private int edad;
  private String raza;
  private boolean isFriendly;
  private String color;
  private double peso;

  public Animal() {
  }

  public Animal(String nombre, int edad, String raza, boolean isFriendly, String color, double peso) {
    this.nombre = nombre;
    this.edad = edad;
    this.raza = raza;
    this.isFriendly = isFriendly;
    this.color = color;
    this.peso = peso;
  }

  public void comer() {
    System.out.println("El animal esta comiendo");
  }

  public void dormir() {
    System.out.println("El animal esta durmiendo");
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public boolean isFriendly() {
    return isFriendly;
  }

  public void setFriendly(boolean isFriendly) {
    this.isFriendly = isFriendly;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

}
