package edu.coderhouse.jpa.api;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import edu.coderhouse.jpa.entity.ClienteEntity;

@Service
public class ClientRestApi {

    public List<String> getClients() {
        RestTemplate restTemplate = new RestTemplate();

        final String url = "http://localhost:5000/api/cliente/";
        return restTemplate.getForObject(url, List.class);
    }

    public String getClientById(String id) {
        RestTemplate restTemplate = new RestTemplate();

        final String url = "http://localhost:5000/api/cliente/" + id;

        return restTemplate.getForObject(url, String.class);
    }

    public String saveClient(ClienteEntity client) {
        RestTemplate restTemplate = new RestTemplate();

        try {
            final String url = "http://localhost:5000/api/cliente/";

            return restTemplate.postForObject(url, client, String.class);
        } catch (Exception e) {
            System.out.println(client);
            return e.getMessage();
        }
    }
}
