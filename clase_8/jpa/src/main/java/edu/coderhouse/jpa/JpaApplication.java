package edu.coderhouse.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.coderhouse.jpa.entity.Alumno;
import edu.coderhouse.jpa.service.DaoFactory;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {

	@Autowired
	private DaoFactory daoFactory;

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			System.out.println("Lista Alumnos inicial");
			daoFactory.getAlumnos().forEach((alumno) -> {
				System.out.println(alumno.getNombre() + " " + alumno.getApellido());
			});

			System.out.println("Lista Alumnos con nuevo alumno");
			Alumno alumno = new Alumno("Esteban", "Lopez", 4321567, 123456);
			alumno.setId(4);
			daoFactory.create(alumno);
			daoFactory.getAlumnos().forEach((alumno2) -> {
				System.out.println(alumno2.getNombre() + " " + alumno2.getApellido());
			});

			System.out.println("Lista Alumnos con alumno modificado");
			alumno.setNombre("Estebanquito");
			daoFactory.update(alumno);
			daoFactory.getAlumnos().forEach((alumno2) -> {
				System.out.println(alumno2.getNombre() + " " + alumno2.getApellido());
			});

			System.out.println("Lista Alumnos con alumno buscado por dni");
			Alumno alumno3 = daoFactory.getAlumnoByDni(12345678L);
			System.out.println(alumno3.getNombre() + " " + alumno3.getApellido());

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
