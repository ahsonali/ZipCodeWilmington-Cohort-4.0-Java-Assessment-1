package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int distanceToFlag, int jumpDistance)
    {

        return (distanceToFlag / jumpDistance) + distanceToFlag % jumpDistance;
    }
}
