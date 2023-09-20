package edu.coderhouse.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.coderhouse.jpa.entity.Cliente;
import edu.coderhouse.jpa.entity.Domicilio;
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
			// Se crea un cliente
			Cliente cliente = new Cliente("Juan", "Perez", 12345678);

			// Se crea los domicilios
			Domicilio domicilioParticular = new Domicilio("Calle 1", 123);
			Domicilio domicilioLaboral = new Domicilio("Calle 2", 456);

			domicilioParticular.setCliente(cliente);
			domicilioLaboral.setCliente(cliente);

			List<Domicilio> domicilios = new ArrayList<Domicilio>();
			domicilios.add(domicilioParticular);
			domicilios.add(domicilioLaboral);

			cliente.setDomicilios(domicilios);

			// Crear cliente con domicilios
			daoFactory.create(cliente);

			// Buscar cliente guardado
			Cliente clienteGuardado = daoFactory.getCliente(cliente);

			System.out.println(clienteGuardado.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
