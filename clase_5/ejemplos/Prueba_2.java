package clase_5.ejemplos;

class Prueba_2 {
  public static void main(String[] args) {
    Perro firu = new Perro();
    Perro dogo = new Perro("Dogo", 2, "Pitbul");

    firu.setEdad(5);

    // Perro dogo = firu;

    System.out.println(firu.hashCode());
    System.out.println(dogo.hashCode());

    System.out.println(firu.equals(dogo));

    System.out.println(firu.getClass());
    System.out.println(dogo.getClass());

    // int y = 5;
    // int x = 0;
    // try {
    // int resultado = y / x;
    // System.out.println(resultado);
    // } catch (Exception error) {
    // System.out.println("No se puede dividir por 0");
    // error.printStackTrace();

    // } finally {
    // System.out.println("Este codigo se ejecuta siempre");
    // }

    System.out.println("Esto es otro codigo");
  }
}