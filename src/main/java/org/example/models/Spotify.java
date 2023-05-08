package org.example.models;

import org.example.service.SongService;

public class Spotify implements MusicalService {
    @Override
    public void playTrack(String trackName) {
        System.out.printf("%s is playing on Spotify!%n", trackName);
    }

    @Override
    public void playAIMusic() {
        System.out.printf("%s is playing on Spotify with AI!%n", SongService.getRandomSong());
    }
}
