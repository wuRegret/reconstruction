package org.miao.reconstruction.split_temp_variable;

public class Demo {
    private double primaryForce;
    private double mass;
    private int delay;
    double getDistanceTravelled(int time) {
        double result;
        double acc = primaryForce / mass;
        int primaryTime = Math.min(time,delay);
        result = 0.5 * acc * primaryTime *primaryTime;
        int secondaryTime = time - delay;
        if (secondaryTime > 0) {
            double primaryVel = acc * delay;
            acc = (primaryForce+secondaryTime)/mass;
            result += primaryVel * secondaryTime + 0.5 * acc * secondaryTime *secondaryTime;
        }
        return result;
    }
}
