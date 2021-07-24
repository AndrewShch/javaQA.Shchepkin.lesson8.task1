package ru.netology;

public class Radio {
    private String name;
    private int currentStation;
    private int currentVolume;
    private int amountStation = 10;
    private int maxStation;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private boolean on;


    public Radio(){}

    public Radio( int amountStation) {
        this.amountStation = amountStation;

    }
    public void setMaxStation() {
        maxStation = amountStation - 1;
        this.maxStation = maxStation ;
    }

    public int getMaxStation() {
        return maxStation ;
    }


    public int getAmountStation() {
        return amountStation;
    }

    public void setAmountStation(int amountStation) {
        this.amountStation = amountStation;
    }


    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }


    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }


    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
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
