package ru.netology.javaqa.javaqamvn.services;

public class Radio {
    public int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    ;

    public void setNextCurrentStation(int newCurrentStation) {

        if (newCurrentStation >= 9) {
            newCurrentStation = 0;
        }
        if (0 < newCurrentStation && newCurrentStation < 9) {
            newCurrentStation = newCurrentStation + 1;
        }


        currentStation = newCurrentStation;
    }

    public void setPrevCurrentStation(int newCurrentStation) {

        if (newCurrentStation <= 0) {
            newCurrentStation = 9;
        }
        if (0 < newCurrentStation && newCurrentStation < 9) {
            newCurrentStation = newCurrentStation - 1;
        }


        currentStation = newCurrentStation;
    }

    public void setToMaxStation() {
        currentStation = 9;
    }

    public void setToMinStation() {
        currentStation = 0;
    }

    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    ;

    public void setMaxCurrentVolume(int newMaxCurrentVolume) {
        if (newMaxCurrentVolume >= 10) {
            newMaxCurrentVolume = 10;
        }
        if (0 < newMaxCurrentVolume && newMaxCurrentVolume < 10) {
            newMaxCurrentVolume = newMaxCurrentVolume + 1;
        }


        currentVolume = newMaxCurrentVolume;

    }

    public void setMinCurrentVolume(int newMinCurrentVolume) {
        if (newMinCurrentVolume <= 0) {
            newMinCurrentVolume = 0;
        }
        if (0 < newMinCurrentVolume && newMinCurrentVolume < 10) {
            newMinCurrentVolume = newMinCurrentVolume - 1;
        }


        currentVolume = newMinCurrentVolume;

    }

    public void setToMaxVolume() {
        currentVolume = 10;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

}