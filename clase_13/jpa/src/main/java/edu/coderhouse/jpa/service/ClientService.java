package edu.coderhouse.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.coderhouse.jpa.api.ClientRestApi;
import edu.coderhouse.jpa.entity.ClienteEntity;

@Service
public class ClientService {

    @Autowired
    private ClientRestApi clientRestApi;

    public List<String> getClients() {
        return clientRestApi.getClients();
    }

    public String getClientById(String id) {
        return clientRestApi.getClientById(id);
    }

    public String saveClient(ClienteEntity client) {
        return clientRestApi.saveClient(client);
    }

}
