package com.elysium;

public class Main {

    public static void main(String[] args) {

        StopLight redLight = new StopLight("Red");
        System.out.println(redLight.getColor());

        StopLight yellowLight = new StopLight("Yellow");
        System.out.println(yellowLight.getColor());

        StopLight greenLight = new StopLight("Green");
        System.out.println(greenLight.getColor());

        redLight.setColor("Red");
        yellowLight.setColor("Yellow");
        greenLight.setColor("Green");
        //System.out.println();
    }
}
