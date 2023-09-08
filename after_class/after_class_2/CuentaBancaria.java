package after_class.after_class_2;

public class CuentaBancaria {

  private String numeroCuenta;
  private double saldo;

  public CuentaBancaria() {
  }

  public CuentaBancaria(String numeroCuenta, double saldo) {
    this.numeroCuenta = numeroCuenta;
    this.saldo = saldo;
  }

  public String getNumeroCuenta() {
    return numeroCuenta;
  }

  public void setNumeroCuenta(String numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public void depositar(double monto) {
    this.saldo += monto;
  }

  public void extraer(double monto) {
    if (monto > this.saldo) {
      System.out.println("No se puede extraer");
      return;
    }
    this.saldo -= monto;
  }

}
