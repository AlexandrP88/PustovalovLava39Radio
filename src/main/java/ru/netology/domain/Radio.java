package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation = 10;
    private int firstStation;

    public Radio() {
    }

    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        if (maxStation <= 0) {
            return;
        }
        this.maxStation = maxStation;

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation - 1) {
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
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseStation() {

        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        }

        if (currentStation >= maxStation) {
            currentStation = firstStation;
        }
    }


    public void reduceStation() {

        if (currentStation == firstStation) {
            currentStation = currentStation - 1;
        }

        if (currentStation > firstStation) {
            currentStation = currentStation - 1;
        }

        if (currentStation <= firstStation - 1) {
            currentStation = maxStation - 1;
        }

    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }

    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }

    }

}

