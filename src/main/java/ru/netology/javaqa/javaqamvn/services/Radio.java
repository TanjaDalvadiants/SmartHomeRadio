package ru.netology.javaqa.javaqamvn.services;
public  class Radio {

    private int currentStation;
    private int currentVolume;
    private int maxStation;
    private int maxVolume;


    public Radio (){
        maxStation = 9;
        maxVolume = 100;

    }
    public Radio (int stationsCount){
        maxStation = stationsCount - 1;
    }
    //station
    public int getCurrentStation(){
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0){
            return;
        }
        if (currentStation > maxStation){
            return;
        }
        this.currentStation = currentStation;
    }
    public void nextStation(){
        if (currentStation!=maxStation){
            currentStation = currentStation+1;
        } else {
            currentStation = 0;
        }
    }
    public void previousStation(){
        if (currentStation != 0){
            currentStation = currentStation-1;
        } else {
            currentStation = maxStation;
        }
    }
    //volume
    public int getCurrentVolume(){
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }
    public void nextVolume(){
        if (currentVolume != maxVolume){
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 0;
        }
    }
    public void previousVolume(){
        if (currentVolume != 0){
            currentVolume = currentVolume-1;
        } else {
            currentVolume = maxVolume;
        }
    }
}