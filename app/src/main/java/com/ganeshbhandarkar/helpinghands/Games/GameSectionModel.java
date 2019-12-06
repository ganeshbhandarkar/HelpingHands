package com.ganeshbhandarkar.helpinghands.Games;

public class GameSectionModel {

    int gameImage;
    String gameUrl;

    public GameSectionModel(int gameImage, String gameUrl) {
        this.gameImage = gameImage;
        this.gameUrl = gameUrl;
    }

    public int getGameImage() {
        return gameImage;
    }

    public void setGameImage(int gameImage) {
        this.gameImage = gameImage;
    }

    public String getGameUrl() {
        return gameUrl;
    }

    public void setGameUrl(String gameUrl) {
        this.gameUrl = gameUrl;
    }
}
