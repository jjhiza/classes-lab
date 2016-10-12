package com.elysium;

/**
 * Created by jay on 10/12/16.
 */

/** I'm really struggling to figure out how to streamline this so it makes more sense and works properly...*/

public class StopLight {

    private String mStopLight;

    public StopLight(String color) {

        mStopLight = color;
    }

    public String getColor() {

        return mStopLight;
    }

    public void setColor(String newColor) {

        if (newColor.equals("Red")) {
            System.out.println("The light turns " + newColor);
        }else if (newColor.equals("Yellow")) {
            System.out.println("The light turns " + newColor);
        }else {
            System.out.println("The light turns " +newColor);
            mStopLight = newColor;
        }
        // mStopLight = newColor;
    }
}
