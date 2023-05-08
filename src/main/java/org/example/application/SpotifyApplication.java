package org.example.application;

import org.example.models.MusicalService;
import org.example.models.Spotify;

public class SpotifyApplication extends Application {
    @Override
    public MusicalService chooseMusicalService() {
        return new Spotify();
    }
}
