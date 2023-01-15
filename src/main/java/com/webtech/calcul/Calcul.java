package com.webtech.calcul;

import lombok.Data;

@Data
public class Calcul {

    private double x;
    private double y;

    public double addition(){
        return this.x + this.y ;
    }

    public double soustraction(){
        return this.x - this.y ;
    }

    public double multiplication(){
        return this.x * this.y ;
    }


}