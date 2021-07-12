package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class RadioTest {
    Radio rad = new Radio();
    @Test
    public void createRadio() {
        String expected = "Radio";
        assertNull(rad.getName());
        rad.setName(expected);
        assertEquals(expected, rad.getName());
    }
    @Test
    void InitFields(){
        assertEquals(9, rad.getMaxStation());
        assertEquals(0, rad.getMinStation());
        assertEquals(10, rad.getMaxVolume());
        assertEquals(0, rad.getMinVolume());
        assertFalse(rad.isOn());
    }

    ///Тестирование станций радио
    @Test
    void shouldNotSetStationBelowMin() {
        rad.setCurrentStation(5);

        rad.setCurrentStation(-1);
        assertEquals(5, rad.getCurrentStation());
    }

    @Test
    void shouldNotSetStationAboveMax() {
        rad.setCurrentStation(9);

        rad.setCurrentStation(10);
        assertEquals(9, rad.getCurrentStation());
    }
    @Test
    void increaseStation(){
        rad.setCurrentStation(7);

        rad.increaseStation();
        assertEquals(8,rad.getCurrentStation());
    }
    @Test
    void downStation(){
        rad.setCurrentStation(2);

        rad.downStation();
        assertEquals(1,rad.getCurrentStation());
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
        rad.setCurrentVolume(5);

        rad.setCurrentVolume(11);
        assertEquals(5, rad.getCurrentVolume());
    }
    @Test
    void increaseVolume(){
        rad.setCurrentVolume(8);

        rad.increaseVolume();
        assertEquals(9,rad.getCurrentVolume());
    }
    @Test
    void downVolume(){
        rad.setCurrentVolume(5);

        rad.downVolume();
        assertEquals(4,rad.getCurrentVolume());
    }

}