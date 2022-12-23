package com.example.fincalcapp;

public class Quad {

    public String boardSize;
    public double rearFins;
    public double frontFins;
    public int totalArea;
    public String sailRange;
    public String sailorSize;

    public Quad[] getArray(){
        Quad[] arrQuad;
        arrQuad = new Quad[10];
        arrQuad[0] = new Quad("50-60",12.5,7,252,"2.7-3.7","less than 70kg");
        arrQuad[1] = new Quad("55-70",13.5,7,266,"3.2-4.2","less than 70kg");
        arrQuad[2] = new Quad("65-75",13.5,8,288,"3.5-4.5","less than 70kg");
        arrQuad[3] = new Quad("70-80",14.5,8,302,"4.0-5.0","70-85kg");
        arrQuad[4] = new Quad("75-85",14.5,9,318,"4.2-5.2","70-85kg");
        arrQuad[5] = new Quad("80-90",14.5,10,334,"4.5-5.5","70-85kg");
        arrQuad[6] = new Quad("85-95",15.5,9,348,"4.7-5.7","70-85kg");
        arrQuad[7] = new Quad("90-100",15.5,10,364,"5.0-6.0","greater than 85kg");
        arrQuad[8] = new Quad("95-110",16.5,10,396,"5.3-6.2","greater than 85kg");
        arrQuad[9] = new Quad("100-120",16.5,11,420,"5.5-6.5","greater than 85kg");
        return arrQuad;
    }
        Quad() {}
        Quad(String boardSize, double rearFins, double frontFins, int totalArea, String sailRange, String sailorSize)    // Quad class constructor
        {
            this.boardSize = boardSize;
            this.rearFins = rearFins;
            this.frontFins = frontFins;
            this.totalArea = totalArea;
            this.sailRange = sailRange;
            this.sailorSize = sailorSize;
        }
    }

