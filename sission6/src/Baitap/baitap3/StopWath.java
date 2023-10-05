package Baitap.baitap3;

import java.util.Date;

public class StopWath {
    private long startTime;
    private long endTime;

    public StopWath(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public StopWath(){
        startTime = new Date().getTime();
    }

    public double getStartTime(){
        return startTime;
    }

    public double getEndTime(){
        return endTime;
    }

    public void start(){
        startTime = new Date().getTime();
    }

    public void stop(){
        endTime = new Date().getTime();
    }

    public long getElapsedTime(){
        return (long) (endTime - startTime);
    }



}
