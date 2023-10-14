package com.aerossolutions.podcastservice.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@NoArgsConstructor
public class Episode {

    @Id
    private UUID id;
    private String name;
    private String description;

    private String recording;

    public Episode(String name, String description, String recording){
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.recording = recording;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getRecording() {
        return recording;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRecording(String recording) {
        this.recording = recording;
    }
}
