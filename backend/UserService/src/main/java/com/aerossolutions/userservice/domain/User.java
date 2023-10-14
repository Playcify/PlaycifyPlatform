package com.aerossolutions.userservice.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "users")
@NoArgsConstructor
public class User {

    @Id
    private UUID id;
    private String username;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_id", referencedColumnName = "id")
    private Profile profile;

    public User(String username, String email, String password, Profile profile){
        this.id = UUID.randomUUID();
        this.username = username;
        this.email = email;
        this.password = password;
        this.profile = profile;
    }

    public UUID getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public boolean validatePassword(String guess){
        return guess.equals(password);
    }

    public Profile getProfile() {
        return profile;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
