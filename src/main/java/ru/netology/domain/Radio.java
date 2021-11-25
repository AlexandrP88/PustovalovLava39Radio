package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            return;
        }
        if (currentStation < 0) {
            return;
        }

        this.currentStation = currentStation;

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseStation() {
        if (currentStation == 9) {
            currentStation = currentStation + 1;
        }

        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }

        if (currentStation == 10) {
            currentStation = 0;
        }
    }


    public void reduceStation() {

        if (currentStation == 0) {
            currentStation = currentStation - 1;
        }
        if (currentStation >= 0) {
            currentStation = currentStation - 1;
        }
        if (currentStation == -1) {
            currentStation = 9;
        }

    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }

    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }

    }

}

