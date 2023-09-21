package edu.coderhouse.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import edu.coderhouse.example.entity.Cliente;

import java.util.List;

import org.hibernate.SessionFactory;

@Service
public class ClienteService {

    @Autowired
    // private SessionFactory sessionFactory;
    private JdbcTemplate jdbcTemplate;

    public ClienteService() {
    }

    public ClienteService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void createCliente(Cliente cliente) {
        // create a client

        this.jdbcTemplate.update("INSERT INTO cliente (nombre, email) VALUES (?, ?)", cliente.getNombre(),
                cliente.getEmail());
    }

    public List<Cliente> getClientes() {
        return this.jdbcTemplate.query("SELECT * FROM cliente", (rs, rowNum) -> {
            return new Cliente(rs.getLong("id"), rs.getString("nombre"), rs.getString("email"));
        });
    }

}
