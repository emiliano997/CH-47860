package edu.coderhouse.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ALUMNO")
public class Alumno {

  public Alumno() {
    super();
  }

  public Alumno(String nombre, String apellido, long dni, long legajo) {
    super();
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
    this.legajo = legajo;
  }

  @Id
  @Column(name = "ID")
  private long id;

  @Column(name = "NOMBRE")
  private String nombre;

  @Column(name = "APELLIDO")
  private String apellido;

  @Column(name = "DNI")
  private long dni;

  @Column(name = "LEGAJO")
  private long legajo;

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

  public long getDni() {
    return dni;
  }

  public void setDni(long dni) {
    this.dni = dni;
  }

  public long getLegajo() {
    return legajo;
  }

  public void setLegajo(long legajo) {
    this.legajo = legajo;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

}
