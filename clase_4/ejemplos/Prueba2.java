package clase_4.ejemplos;

public class Prueba2 {

  public static void main(String[] args) {
    Perro firulais = new Perro();
    Perro.cantidadPerros++;
    // firulais.color = "Marrón";
    // firulais.nombre = "Firu";
    // firulais.edad = 2;
    // firulais.raza = "Boxer";

    try {
      firulais.setNombre("Firu");
      firulais.setEdad(10);
      firulais.setRaza("Boxer");
      firulais.setColor("Marrón");
    } catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace(); // Imprime el stacktrace
    }

    // System.out.println("El nombre del perro es: " + firulais.nombre);
    // System.out.println("El color del perro es: " + firulais.color);
    // System.out.println("La edad del perro es: " + firulais.edad);
    // System.out.println("La raza del perro es: " + firulais.raza);

    // System.out.println("El nombre del perro es: " + firulais.getNombre());
    // System.out.println("El color del perro es: " + firulais.getColor());
    // System.out.println("La edad del perro es: " + firulais.getEdad());
    // System.out.println("La raza del perro es: " + firulais.getRaza());

    // firulais.correr();
    // firulais.ladrar();
    // firulais.morder();

    // // Argumentos
    // String texto = "algo";
    // Perro.imprimirAlgo(texto, 12);
    // System.out.println(texto);

  }
}
