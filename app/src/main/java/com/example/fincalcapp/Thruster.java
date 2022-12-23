package com.example.fincalcapp;

public class Thruster {

    public String boardSize;
    public double centerFin;
    public double thrusterFins;
    public int totalArea;
    public String sailRange;
    public String sailorSize;

    public Thruster[] getArray(){
        Thruster[] arrThruster;
        arrThruster = new Thruster[10];
        arrThruster[0] = new Thruster("50-60",13.5,10.5,226,"2.7-3.7","less than 70kg");
        arrThruster[1] = new Thruster("55-70",14.5,10.5,233,"3.2-4.2","less than 70kg");
        arrThruster[2] = new Thruster("65-75",15.5,10.5,248,"3.5-4.5","less than 70kg");
        arrThruster[3] = new Thruster("70-80",15.5,11.5,274,"4.0-5.0","70-85kg");
        arrThruster[4] = new Thruster("75-85",16.5,11.5,290,"4.2-5.2","70-85kg");
        arrThruster[5] = new Thruster("80-90",17.5,11.5,307,"4.5-5.5","70-85kg");
        arrThruster[6] = new Thruster("85-95",17.5,12.5,335,"4.7-5.7","70-85kg");
        arrThruster[7] = new Thruster("90-100",18.5,12.5,353,"5.0-6.0","greater than 85kg");
        arrThruster[8] = new Thruster("95-110",20,12.5,382,"5.3-6.2","greater than 85kg");
        arrThruster[9] = new Thruster("100-120",20,13.5,396,"5.5-6.5","greater than 85kg");
        return arrThruster;
    }

        Thruster() {}
        Thruster(String boardSize, double centerFin, double thrusterFins, int totalArea, String sailRange, String sailorSize)    // Thruster class constructor
        {
            this.boardSize = boardSize;
            this.centerFin = centerFin;
            this.thrusterFins = thrusterFins;
            this.totalArea = totalArea;
            this.sailRange = sailRange;
            this.sailorSize = sailorSize;
        }
    }



