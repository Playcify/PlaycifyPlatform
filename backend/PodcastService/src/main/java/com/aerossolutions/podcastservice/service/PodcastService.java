package com.aerossolutions.podcastservice.service;

import com.aerossolutions.podcastservice.data.PodcastRepository;
import com.aerossolutions.podcastservice.domain.Episode;
import com.aerossolutions.podcastservice.domain.Podcast;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PodcastService {

    @Autowired
    PodcastRepository podcastRepository;

    public Podcast createPodcast(String name, String description, UUID creatorId){
        Podcast podcast = new Podcast(name, description, creatorId);
        Episode episode = new Episode("Ep 1 The podcast", "first episode", "kdjlfs");
        podcast.addEpisode(episode);
        podcastRepository.save(podcast);
        return podcast;
    }

}
