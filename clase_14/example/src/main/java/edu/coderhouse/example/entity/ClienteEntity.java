package edu.coderhouse.example.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CLIENTE")
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Identificador del cliente", example = "1", requiredMode = Schema.RequiredMode.AUTO)
    private Long id;

    @Column(name = "NOMBRE")
    @Schema(description = "Nombre del cliente", example = "Juan", requiredMode = Schema.RequiredMode.REQUIRED)
    private String nombre;

    @Column(name = "APELLIDO")
    @Schema(description = "Apellido del cliente", example = "Perez", requiredMode = Schema.RequiredMode.REQUIRED)
    private String apellido;

    @Column(name = "DNI")
    @Schema(description = "DNI del cliente", example = "12345678", requiredMode = Schema.RequiredMode.REQUIRED)
    private Long dni;

    public ClienteEntity() {
    }

    public ClienteEntity(Long id, String nombre, String apellido, Long dni) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

}
