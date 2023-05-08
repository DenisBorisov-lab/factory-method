package org.example.application;

import org.example.models.MusicalService;

public abstract class Application {
    public void playAIMusic() {
        MusicalService musicalService = chooseMusicalService();
        musicalService.playAIMusic();
    }

    public void playTrack(String track) {
        MusicalService musicalService = chooseMusicalService();
        musicalService.playTrack(track);
    }

    public abstract MusicalService chooseMusicalService();
}
