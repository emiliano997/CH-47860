package clase_2;

public class NumerosAleatorios {

  public static void main(String[] args) {
    // double random = 0.0;

    // random = Math.random();
    // System.out.println("Numero aleatorio " + random);

    // random = Math.random();
    // System.out.println("Numero aleatorio " + random);

    // random = Math.random();
    // System.out.println("Numero aleatorio " + random);

    int minimo = 1, maximo = 50, rango = maximo - minimo + 1;
    int random = 0;

    random = (int) (Math.random() * rango) + minimo;
    System.out.println("Rango: " + rango);
    System.out.println("Random:" + random);

    random = (int) (Math.random() * rango) + minimo;
    System.out.println("Random:" + random);

    random = (int) (Math.random() * rango) + minimo;
    System.out.println("Random:" + random);

    int edad = (int) (Math.random() * rango) + minimo;
    boolean puedeEntrar = edad > 17 && edad < 40;
    System.out.println(edad);
    String mensaje = puedeEntrar ? "Puede acceder" : "No puede acceder";
    System.out.println(mensaje);

  }
}
