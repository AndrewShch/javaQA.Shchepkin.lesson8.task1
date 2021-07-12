package ru.netology;

public class Radio {
    private int currentStation;
    private int maxStation;
    private int minStation;



    public void setCurrentStation(int currentStation){
        if (currentStation < 0) {
            return;
        }
            if (currentStation > 9){
                return;
            }
            this.currentStation = currentStation;
    }

    public int getCurrentStation(){
        return currentStation;

    }
}
