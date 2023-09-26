package edu.coderhouse.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.coderhouse.example.entity.ClienteEntity;
import edu.coderhouse.example.repository.ClienteRepository;

@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteEntity save(ClienteEntity cliente) {
        return clienteRepository.save(cliente);
    }

    public Optional<ClienteEntity> findById(Long id) {
        return clienteRepository.findById(id);
    }
    
}
