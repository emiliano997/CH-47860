package after_class.after_class_2;

public class Persona {

  private String nombre;
  private String apellido;
  private int edad;
  private String dni;
  private CuentaBancaria cuentaBancaria;

  public Persona() {
  }

  public Persona(String nombre, String apellido, int edad, String dni, CuentaBancaria cuentaBancaria) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    this.dni = dni;
    this.cuentaBancaria = cuentaBancaria;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public CuentaBancaria getCuentaBancaria() {
    return cuentaBancaria;
  }

  public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
    this.cuentaBancaria = cuentaBancaria;
  }

  public String mostrarDatos() {
    return "Nombre: " + this.nombre + "\nApellido: " + this.apellido + "\nEdad: " + this.edad + "\nDNI: " + this.dni
        + "\nCuenta bancaria: " + this.cuentaBancaria.getNumeroCuenta() + "\nSaldo: " + this.cuentaBancaria.getSaldo();
  }

  public String bienvenida() {
    return "Bienvenido " + this.nombre + " " + this.apellido;
  }

}
