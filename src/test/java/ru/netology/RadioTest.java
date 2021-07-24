package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class RadioTest {
    Radio rad = new Radio(20);

    @Test
    void initFields() {
        Radio rad = new Radio(20);
        rad.setMaxStation();
        assertEquals(20, rad.getAmountStation());
        assertEquals(19, rad.getMaxStation());

    }

    @Test
    void checkMaxStation() {
        Radio rad = new Radio(20);
        rad.setMaxStation();
        assertEquals(19, rad.getMaxStation());
    }

    @Test
    void checkMaxStation2() {
        Radio rad = new Radio();
        rad.setMaxStation();
        assertEquals(9, rad.getMaxStation());
    }

    ///Тестирование станций радио
    @Test
    void shouldNotSetStationBelowMin() {
        Radio rad = new Radio(20);
        rad.setMaxStation();
        rad.setCurrentStation(5);

        rad.setCurrentStation(-1);
        assertEquals(5, rad.getCurrentStation());
    }

    @Test
    void shouldNotSetStationAboveMax() {
        Radio rad = new Radio(20);
        rad.setMaxStation();
        rad.setCurrentStation(18);

        rad.setCurrentStation(21);
        assertEquals(18, rad.getCurrentStation());
    }

    @Test
    void increaseStation() {
        Radio rad = new Radio(20);
        rad.setMaxStation();
        rad.setCurrentStation(15);
        rad.increaseStation();
        assertEquals(16, rad.getCurrentStation());
    }

    @Test
    void transitionFromMaxToMinStation() {
        Radio rad = new Radio(20);
        rad.setMaxStation();
        rad.setCurrentStation(19);

        rad.increaseStation();
        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    void downStation() {
        Radio rad = new Radio(20);
        rad.setMaxStation();
        rad.setCurrentStation(18);
        rad.downStation();
        assertEquals(17, rad.getCurrentStation());
    }

    @Test
    void transitionFromMimToMaxStation() {
        Radio rad = new Radio(20);
        rad.setMaxStation();
        rad.setCurrentStation(0);

        rad.downStation();
        assertEquals(19, rad.getCurrentStation());
    }

    ///Тестирование громкости радио
    @Test
    void shouldNotSetVolumeBelowMin() {
        rad.setCurrentVolume(5);

        rad.setCurrentVolume(-1);
        assertEquals(5, rad.getCurrentVolume());
    }

    @Test
    void shouldNotSetVolumeAboveMax() {
        rad.setCurrentVolume(90);

        rad.setCurrentVolume(101);
        assertEquals(90, rad.getCurrentVolume());
    }

    @Test
    void increaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(90);

        rad.increaseVolume();
        assertEquals(91, rad.getCurrentVolume());
    }

    @Test
    void transitionFromMaxToMinVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        rad.increaseVolume();
        assertEquals(100, rad.getCurrentVolume());
    }

    @Test
    void downVolume() {
        rad.setCurrentVolume(80);

        rad.downVolume();
        assertEquals(79, rad.getCurrentVolume());
    }

    @Test
    void transitionFromMinToMaxVolume() {
        rad.setCurrentVolume(0);

        rad.downVolume();
        assertEquals(0, rad.getCurrentVolume());
    }

}