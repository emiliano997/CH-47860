package clase_2.desafios_genericos;

public class NumeroMes {
  public static void main(String[] args) {
    String mesIngresado = "Mayo";
    int numeroMes;

    switch (mesIngresado) {
      case "Enero":
        numeroMes = 1;
        break;
      case "Febrero":
        numeroMes = 2;
        break;
      case "Marzo":
        numeroMes = 3;
        break;
      case "Abril":
        numeroMes = 4;
        break;
      case "Mayo":
        numeroMes = 5;
        break;
      case "Junio":
        numeroMes = 6;
        break;
      case "Julio":
        numeroMes = 7;
        break;
      case "Agosto":
        numeroMes = 8;
        break;
      case "Septiembre":
        numeroMes = 9;
        break;
      case "Octubre":
        numeroMes = 10;
        break;
      case "Noviembre":
        numeroMes = 11;
        break;
      case "Diciembre":
        numeroMes = 12;
        break;

      default:
        numeroMes = 0;
        break;

    }

    System.out.println("El mes ingresado es: " + numeroMes);
  }
}
