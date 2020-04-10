package org.miao.reconstruction.chapter6.split_temp_variable;

public class Demo {
    private double primaryForce;
    private double mass;
    private int delay;
    double getDistanceTravelled(int time) {
        double result;
        double primaryAcc = primaryForce / mass;
        int primaryTime = Math.min(time,delay);
        result = 0.5 * primaryAcc * primaryTime *primaryTime;
        int secondaryTime = time - delay;
        if (secondaryTime > 0) {
            double primaryVel = primaryAcc * delay;
            double secondaryAcc = (primaryForce+secondaryTime)/mass;
            result += primaryVel * secondaryTime + 0.5 * secondaryAcc * secondaryTime *secondaryTime;
        }
        return result;
    }
}
