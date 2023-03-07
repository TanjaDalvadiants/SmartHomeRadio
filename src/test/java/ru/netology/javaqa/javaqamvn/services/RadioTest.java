package ru.netology.javaqa.javaqamvn.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
    public  void ShouldSetCurrentStationAboveMax(){
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public  void ShouldSetCurrentStationBelowMin(){
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 0;
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
    public  void ShouldSetNextStationIfMax(){
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();

        int expected = 0;
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
    @Test
    public  void ShouldSetPreviousStationBelowMin(){
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.previousStation();

        int expected = 9;
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
    public  void ShouldSetCurrentVolumeAboveMax(){
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public  void ShouldSetCurrentVolumeBelowMin(){
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
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
    public  void ShouldSetNextVolumeAboveMax(){
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.nextVolume();

        int expected = 0;
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
    @Test
    public  void ShouldSetPreviousVolumeBelowMin(){
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.previousVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }


    @Test
    public  void test(){
        Radio radio = new Radio(20);
        radio.setCurrentStation(15);

        int expected = 15;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }

}