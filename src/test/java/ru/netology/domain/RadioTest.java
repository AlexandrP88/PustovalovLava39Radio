package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetStationBelowMin () {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        radio.setCurrentStation(-1);
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationAboveMax () {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.setCurrentStation(15);
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseStation () {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.increaseStation();
        assertEquals(6, radio.getCurrentStation());

    }

    @Test
        public void shouldIncreaseStationAboveMax () {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.increaseStation();
        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void shouldReduceStationBelowMin () {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.reduceStation();
        assertEquals(9, radio.getCurrentStation());

    }

    @Test
    public void shouldReduceStation () {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.reduceStation();
        assertEquals(7, radio.getCurrentStation());

    }

   }