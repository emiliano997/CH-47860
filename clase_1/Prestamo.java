package clase_1;

public class Prestamo {

  public static void main(String[] args) {
    int capitalSolicitado = 1000;
    double intereses = 2;
    int cuotas = 12;

    int intereseAPagar = capitalSolicitado * (int) intereses * cuotas;
    int montoTotal = capitalSolicitado + intereseAPagar;

    System.out.println("El interes a pagar es: " + montoTotal);

  }
}
