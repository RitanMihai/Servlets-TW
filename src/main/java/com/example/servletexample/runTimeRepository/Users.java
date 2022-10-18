package com.example.servletexample.runTimeRepository;

import com.example.servletexample.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public enum Users {
    INSTANCE;

    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        this.users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Optional<User> findUserByEmailAndPassword(String email, String password) {
        return users.stream()
                .filter(user -> email.equals(user.getEmail()) && !email.isEmpty() &&
                        password.equals(user.getPass()) && !password.isEmpty())
                .findAny();
    }
}
