package after_class.after_class_1;

public class Ejercicio2 {

  public static void main(String[] args) {
    double base = (Math.random() * 20) + 1;
    double altura = (Math.random() * 20) + 1;

    System.out.println(base);
    System.out.println(altura);

    double area = (base * altura) / 2;

    System.out.println("El área es: " + area);
  }
}
