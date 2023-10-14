package com.aerossolutions.podcastservice.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@NoArgsConstructor
public class Podcast {

    @Id
    private UUID id;

    private String name;
    private String description;
    private UUID creatorId;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Episode> episodes;

    public Podcast(String name, String description, UUID creatorId){
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.creatorId = creatorId;
        this.episodes = new ArrayList<>();
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

    public UUID getCreatorId() {
        return creatorId;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreatorId(UUID creatorId) {
        this.creatorId = creatorId;
    }

    public void setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
    }

    public boolean addEpisode(Episode episode){
        return this.episodes.add(episode);
    }
}
