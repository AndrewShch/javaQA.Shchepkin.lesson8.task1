package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    void shouldNotSetStationBelowMin() {
        Radio rad = new Radio();

        rad.setCurrentStation(0);

        rad.setCurrentStation(-1);
        assertEquals(0,rad.getCurrentStation());
    }
    @Test
    void shouldNotSetStationBelowMax() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);

        rad.setCurrentStation(10);
        assertEquals(9,rad.getCurrentStation());
    }
}