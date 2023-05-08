package org.example;

import org.example.application.Application;
import org.example.application.SpotifyApplication;
import org.example.application.YandexMusicApplication;

public class Main {
    public static Application applicationAI;
    public static Application application;

    public static void main(String[] args) {

        // Проигрывается музыка от спотифая с помощью AI
        applicationAI = new SpotifyApplication();
        applicationAI.playAIMusic();

        // Проигрывается музыка от Яндекс Музыки
        application = new YandexMusicApplication();
        application.playTrack("Six days");
    }
}