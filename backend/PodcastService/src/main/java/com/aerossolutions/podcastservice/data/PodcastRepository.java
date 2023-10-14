package com.aerossolutions.podcastservice.data;

import com.aerossolutions.podcastservice.domain.Podcast;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PodcastRepository extends JpaRepository<Podcast, UUID> {
}
