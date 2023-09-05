package clase_5.ejemplos;

// import java.util.Objects;

public class Perro {

  String nombre;
  int edad;
  String raza;

  // @Override // Sobreescribir
  // public boolean equals(Object o) {
  // if (this == o)
  // return true;
  // if (o == null || getClass() != o.getClass())
  // return false;
  // Perro perro = (Perro) o;
  // return Objects.equals(nombre, perro.nombre) && edad == perro.edad &&
  // Objects.equals(raza, perro.raza);
  // }

  // @Override
  // public int hashCode() {
  // return Objects.hash(nombre, edad, raza);
  // }

  public Perro(String nombre, int edad, String raza) {
    this.nombre = nombre;
    this.edad = edad;
    this.raza = raza;
  }

  public Perro() {
  }

  public void metodoQuePuedeRomper() throws Exception {
    // ...Código que puede hacer que mi programa se rompa / deje de funcionar
    // try catch
  }

  public String getNombre() {
    return nombre;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
    result = prime * result + edad;
    result = prime * result + ((raza == null) ? 0 : raza.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Perro other = (Perro) obj;
    if (nombre == null) {
      if (other.nombre != null)
        return false;
    } else if (!nombre.equals(other.nombre))
      return false;
    if (edad != other.edad)
      return false;
    if (raza == null) {
      if (other.raza != null)
        return false;
    } else if (!raza.equals(other.raza))
      return false;
    return true;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

}
