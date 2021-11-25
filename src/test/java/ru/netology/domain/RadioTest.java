package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        radio.setCurrentStation(-1);
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setCurrentStation(10);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.increaseStation();
        assertEquals(9, radio.getCurrentStation());

    }


    @Test
    public void shouldIncreaseStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.increaseStation();
        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void shouldReduceStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.reduceStation();
        assertEquals(9, radio.getCurrentStation());

    }

    @Test
    public void shouldReduceStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.reduceStation();
        assertEquals(4, radio.getCurrentStation());

    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void shouldReduceVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        radio.reduceVolume();
        assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeWhenMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldReduceVolumeWhenMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }
}