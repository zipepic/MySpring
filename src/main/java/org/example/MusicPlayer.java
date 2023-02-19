package org.example;

public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public String playMusic(){
        return "Player is "+music.getSong();
    }
}
