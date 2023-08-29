package clase_3;

public class ArrayEjemplo {

  public static void main(String[] args) {
    // int[] edades = new int[5]; // → 0 al 4

    // [] [] [] [] []
    // 0 1 2 3 4 → Posición
    // edades[0] = 23;

    // System.out.println("La primera edad es: " + edades[5]);
    // System.out.println("Largo del array: " + edades.length);

    int[] edades = {
        23,
        24,
        54,
        10,
        80
    };

    System.out.println("La edad son: " + edades[1]);

    edades[1] = 50;

    System.out.println("La edad 0 es: " + edades[0]);
    System.out.println("La edad 1 es: " + edades[1]);
    System.out.println("La edad 2 es: " + edades[2]);
    System.out.println("La edad 3 es: " + edades[3]);
    System.out.println("La edad 4 es: " + edades[4]);

  }
}
