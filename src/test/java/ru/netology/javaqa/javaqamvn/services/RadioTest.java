package ru.netology.javaqa.javaqamvn.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    //station

    @Test
    public  void ShouldSetCurrentStation(){
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public  void ShouldSetCurrentStationIfZero(){
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public  void ShouldSetCurrentStationIfMinus(){
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public  void ShouldSetCurrentStationIfAboveMax(){
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public  void ShouldSetCurrentStationIfMax(){
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public  void ShouldSetNextStation(){
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.nextStation();

        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public  void ShouldSetPreviousStation(){
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.previousStation();

        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }




    //volume
    @Test
    public  void ShouldSetCurrentVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public  void ShouldSetNextVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.nextVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public  void ShouldSetPreviousVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.previousVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }

//second constructor
    @Test
    public  void setCurrentStationSecondConstructor(){
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public  void ShouldSetNextStationSecondConstructor(){
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public  void ShouldSetPreviousStationSecondConstructor(){
        Radio radio = new Radio(10);
        radio.setCurrentStation(0);
        radio.previousStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }
}