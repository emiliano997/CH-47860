package edu.coderhouse.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.coderhouse.jpa.api.UserRestApi;

@Service
public class UserService {

    @Autowired
    private UserRestApi userRestApi;

    public List<String> getUsuarios() {
        return userRestApi.getUsuarios();
    }

    public String getUserById(String id) {
        return userRestApi.getUserById(id);
    }

    public String saveUser(String user) {
        return userRestApi.saveUser(user);
    }

    public void updateUser(String id, String user) {
        userRestApi.updateUser(id, user);
    }
}
