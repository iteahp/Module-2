package Stopwatch;

import java.time.LocalDateTime;

public class StopWatch {
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    public StopWatch(){
        this.startTime = LocalDateTime.now();

    }
    public void start (){
        this.startTime = LocalDateTime.now();

    }
    public void stop(){
        this.endTime = LocalDateTime.now();
    }
    public LocalDateTime getStartTime(){
        return startTime;
    }
    public LocalDateTime getEndTime(){
        return endTime;
    }
    public int getElapsedTime(){
        return getEndTime().getSecond()-getStartTime().getSecond();
    }
    




}
