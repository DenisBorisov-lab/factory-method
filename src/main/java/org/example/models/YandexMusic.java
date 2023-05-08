package org.example.models;

import org.example.service.SongService;

public class YandexMusic implements MusicalService {
    @Override
    public void playTrack(String trackName) {
        System.out.printf("%s is playing on Yandex Music!%n", trackName);
    }

    @Override
    public void playAIMusic() {
        System.out.printf("%s is playing on Yandex Music with Моя Волна!%n", SongService.getRandomSong());
    }
}
