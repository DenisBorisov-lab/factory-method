package org.example.application;

import org.example.models.MusicalService;
import org.example.models.YandexMusic;

public class YandexMusicApplication extends Application {
    @Override
    public MusicalService chooseMusicalService() {
        return new YandexMusic();
    }
}
