package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void ShouldSetStation() {
        Radio station = new Radio();
        station.setNextCurrentStation(0);
        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetMaxStation() {
        Radio station = new Radio();

        station.setToMaxStation();
        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetNextStationAboveMax() {
        Radio station = new Radio();

        station.setNextCurrentStation(9);
        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldSetNextStation() {
        Radio station = new Radio();

        station.setNextCurrentStation(6);
        int expected = 7;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldSetMinStation() {
        Radio station = new Radio();

        station.setToMinStation();
        int expected = 0;
        int actual = station.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetNextStationBelowMin() {
        Radio station = new Radio();

        station.setPrevCurrentStation(0);
        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldSetPrevStation() {
        Radio station = new Radio();

        station.setPrevCurrentStation(6);
        int expected = 5;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldVolume() {
        Radio volume = new Radio();
        volume.setMaxCurrentVolume(0);
        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetMaxVolume() {
        Radio volume = new Radio();


        volume.setToMaxVolume();
        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetNextVolumeAboveMax() {
        Radio volume = new Radio();

        volume.setMaxCurrentVolume(10);
        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldSetNextVolume() {
        Radio volume = new Radio();

        volume.setMaxCurrentVolume(9);
        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldSetMinVolume() {
        Radio volume = new Radio();

        volume.setToMinVolume();
        int expected = 0;
        int actual = volume.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetNextVolumeBelowMin() {
        Radio volume = new Radio();

        volume.setMinCurrentVolume(0);
        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldSetPrevVolume() {
        Radio volume = new Radio();

        volume.setMinCurrentVolume(6);
        int expected = 5;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
}
