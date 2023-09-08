package after_class.after_class_2;

import javax.swing.JOptionPane;

public class Main {

  public static String menu() {
    return "1. Depositar\n2. Extraer\n3. Ver saldo\n4. Ver datos\n5. Salir";
  }

  public static void main(String[] args) {
    CuentaBancaria cuenta = new CuentaBancaria("1234", 1000);
    Persona persona = new Persona("Juan", "Perez", 30, "12345678", cuenta);

    JOptionPane.showMessageDialog(null, "Bienvenido", "Bienvenida", 1);

    int opcion = 0;

    do {
      try {
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu(), "Menu", 3));
      } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Opcion invalida", "Error", 0);
      }

      switch (opcion) {
        case 1: {
          double monto = Double
              .parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto a depositar", "Depósito", 3));
          persona.getCuentaBancaria().depositar(monto);
          break;
        }
        case 2: {
          double monto = Double
              .parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto a extraer", "Extracción", 3));
          persona.getCuentaBancaria().extraer(monto);
          break;
        }
        case 3: {
          JOptionPane.showMessageDialog(null, "Su saldo es: " + persona.getCuentaBancaria().getSaldo(), "Saldo", 1);
          break;
        }
        case 4: {
          JOptionPane.showMessageDialog(null, persona.mostrarDatos(), "Datos", 1);
          break;
        }
        case 5: {
          JOptionPane.showMessageDialog(null, "Gracias por usar el programa", "Salida", 1);
          break;
        }
        default: {
          JOptionPane.showMessageDialog(null, "Opcion invalida", "Error", 0);
          break;
        }
      }
    } while (opcion != 5);

  }
}
