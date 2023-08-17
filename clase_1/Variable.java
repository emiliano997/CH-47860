package clase_1;

class Variable {
  public static void main(String[] args) {
    String nombre = "Pablo";

    // int → Numero entero
    int edad = 18;
    // peso: 85.5
    double peso = 85.5;
    float pesoAnterior = 70.3f;
    // booleano → es verdadero o falso
    boolean tieneLicencia = true;
    // long → Numeros muy grandes
    long cuentaBancaria = 1000000000000L;
    // char → caracter
    char inicial = 'P';

    String clubFutbol = "Boca Juniors";
    String clubFutbolNumero1 = "El inter de Miami";

    // char int = '2'; → Esto está mal

    // byte nuevoByte = -128;

    // No funciona
    // int x = 24;
    // byte y = x;

    // Operadores Aritmeticos
    int x = 5;
    int y = 2;

    float num1 = 5f;
    float num2 = 2f;

    // Suma
    int suma = x + y;
    System.out.println(suma);

    // Resta
    int resta = x + y;
    System.out.println(resta);

    // Multiplicación
    int multiplicacion = x * y;
    System.out.println(multiplicacion);

    // División
    float division = num1 / num2;
    float division2 = x / y;
    System.out.println("Division 2: " + division2);
    System.out.println(division);

    // Módulo
    float modulo = num1 % num2;
    System.out.println(modulo);

    x++; // x = x + 1
    System.out.println(x);
    x--; // x = x - 1
    System.out.println(x);
    System.out.println("Ultimo x: " + x--); // Primero lo muestra y luego lo resta
    System.out.println("Ultimo ultimo: " + x);

    // Operadores relacionales
    // Igual
    boolean seLlamaPablo = nombre == "Pablo"; // ¿El nombre es igual a Pablo?

    // Mayor que
    // boolean esMayor = edad > 18; // ¿Es mayor de edad?
    boolean esMayor = edad >= 18; // Mayor o igual

    // Menor que
    // boolean esMenor = edad < 18; // ¿Es menor de edad?
    boolean esMenor = edad <= 17; // Menor o igual
    System.out.println(esMenor);

    // Diferente o distino
    boolean mejorEquipo = clubFutbol != "Barcelona"; // ¿Cual es el mejor equipo?
  }

}