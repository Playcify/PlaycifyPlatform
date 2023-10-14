package com.aerossolutions.userservice.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Profile {

    @Id
    private UUID id;

    private String avatar;

    public Profile(){
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
