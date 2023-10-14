package com.aerossolutions.podcastservice.presentation;

import com.aerossolutions.podcastservice.domain.Episode;
import com.aerossolutions.podcastservice.domain.Podcast;
import com.aerossolutions.podcastservice.service.PodcastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.UUID;

@Controller
public class PodcastController {

    @Autowired
    PodcastService pcs;

    @GetMapping("/")
    public ResponseEntity<Podcast> createPodcast(){
        Podcast podcast = pcs.createPodcast("Podcast", "Short podcast", UUID.randomUUID());
        return new ResponseEntity(podcast, HttpStatus.OK);
    }

}
