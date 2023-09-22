package edu.coderhouse.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.coderhouse.example.entity.Cliente;
import edu.coderhouse.example.service.ClienteService;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    @Autowired
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> getClientes() {
        return ResponseEntity.ok(this.clienteService.getClientes());
    }

    @PostMapping(consumes = "application/json")
    public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente) {
        this.clienteService.createCliente(cliente);
        return ResponseEntity.ok(cliente);
    }
}
