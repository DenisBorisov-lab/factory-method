package org.example.service;

import java.util.List;
import java.util.Random;

public class SongService {
    private static final List<String> songs = List.of("Broken Bones", "By the Sword", "Till I Collapse", "Alive", "Where We Started", "Snow", "Look At Me", "Lonely World", "Belly of the Beast");
    private static final Random random = new Random();

    public static String getRandomSong() {
        return songs.get(random.nextInt(songs.size()));
    }
}
