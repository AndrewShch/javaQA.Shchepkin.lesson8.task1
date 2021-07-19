package ru.netology;


import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
public class Radio {
    private String name;
    private int currentStation;
    private int currentVolume;
    private int maxStation = 10;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private boolean on;

    public Radio( int maxStation) {
        this.maxStation = maxStation;
    }
    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void increaseStation() {
        if (currentStation >= maxStation) {
            setCurrentStation(minStation);
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void downStation() {
        if (currentStation <= minStation) {
            setCurrentStation(maxStation);
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume >= maxVolume) {
            setCurrentVolume(maxVolume);
        } else {
            currentVolume = currentVolume + 1;
        }
    }

    public void downVolume() {
        if (currentVolume <= minVolume) {
            setCurrentVolume(minVolume);
        } else {
            currentVolume = currentVolume - 1;
        }
    }


    }
