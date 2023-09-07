package clase_6.desafios_genericos;

public class Calculadora {
  public static void main(String[] args) {
    System.out.println("Suma con numeros enteros:");
    System.out.println(Suma.sumar(12, 1566));
    System.out.println("Suma con numeros float:");
    System.out.println(Suma.sumar(2.4f, 0.6f));
    System.out.println("Suma con numeros long:");
    System.out.println(Suma.sumar(291315124125125125L, 123456571251346L));
    System.out.println("Suma con numeros double:");
    System.out.println(Suma.sumar(123.5, 192.9));
  }
}
