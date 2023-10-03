package edu.coderhouse.jpa.api;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserRestApi {

    public List<String> getUsuarios() {
        RestTemplate restTemplate = new RestTemplate();

        final String url = "https://jsonplaceholder.typicode.com/users";

        return restTemplate.getForObject(url, List.class);
    }

    public String getUserById(String id) {
        RestTemplate restTemplate = new RestTemplate();

        final String url = "https://jsonplaceholder.typicode.com/users/" + id;

        return restTemplate.getForObject(url, String.class);
    }

    public String saveUser(String user) {
        RestTemplate restTemplate = new RestTemplate();

        final String url = "https://jsonplaceholder.typicode.com/users";

        return restTemplate.postForObject(url, user, String.class);
    }

    public void updateUser(String id, String user) {
        RestTemplate restTemplate = new RestTemplate();

        final String url = "https://jsonplaceholder.typicode.com/users/" + id;

        restTemplate.put(url, user);

    }
}
