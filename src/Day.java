public class Day {

    private double timeWakeUp;
    private double timeBreakfast;
    private double timeSecondBreakfast;
    private double timeSupper;
    private double timeLunch;
    private double timeDinner;
    private double timeSecondDinner;
    private double timeSleepDown;


    public Day(double timeWakeUp, double timeBreakfast, double timeSecondBreakfast, double timeSupper, double timeLunch, double timeDinner, double timeSecondDinner, double timeSleepDown) {
        this.timeWakeUp = timeWakeUp;
        this.timeBreakfast = timeBreakfast;
        this.timeSecondBreakfast = timeSecondBreakfast;
        this.timeSupper = timeSupper;
        this.timeLunch = timeLunch;
        this.timeDinner = timeDinner;
        this.timeSecondDinner = timeSecondDinner;
        this.timeSleepDown = timeSleepDown;
    }

    public double getTimeWakeUp() {
        return timeWakeUp;
    }

    public void setTimeWakeUp(double timeWakeUp) {
        this.timeWakeUp = timeWakeUp;
    }

    public double getTimeBreakfast() {
        return timeBreakfast;
    }

    public void setTimeBreakfast(double timeBreakfast) {
        this.timeBreakfast = timeBreakfast;
    }

    public double getTimeSecondBreakfast() {
        return timeSecondBreakfast;
    }

    public void setTimeSecondBreakfast(double timeSecondBreakfast) {
        this.timeSecondBreakfast = timeSecondBreakfast;
    }

    public double getTimeSupper() {
        return timeSupper;
    }

    public void setTimeSupper(double timeSupper) {
        this.timeSupper = timeSupper;
    }

    public double getTimeLunch() {
        return timeLunch;
    }

    public void setTimeLunch(double timeLunch) {
        this.timeLunch = timeLunch;
    }

    public double getTimeDinner() {
        return timeDinner;
    }

    public void setTimeDinner(double timeDinner) {
        this.timeDinner = timeDinner;
    }

    public double getTimeSecondDinner() {
        return timeSecondDinner;
    }

    public void setTimeSecondDinner(double timeSecondDinner) {
        this.timeSecondDinner = timeSecondDinner;
    }

    public double getTimeSleepDown() {
        return timeSleepDown;
    }

    public void setTimeSleepDown(double timeSleepDown) {
        this.timeSleepDown = timeSleepDown;
    }
}
