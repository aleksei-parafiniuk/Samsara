public class Day {

    private double wakeUp;
    private double breakfast;
    private double secondBreakfast;
    private double supper;
    private double lunch;
    private double dinner;
    private double secondDinner;
    private double sleepDown;
    /* add year, month, date, significantEvent, moonDay, exercisesWithLocks, exercisesForNeck, handstand,
    keyboardSimulator, exercisesForEyes, iTLearning, morningYoga, iTEnglish, petProject, juggling, eveningYoga,
    checkList10, healthNotes, commentForDay, pedometerReadings, geolocation, photo&video, contactsDuringDay,
    daysQRCode, */


    public Day(double timeWakeUp, double timeBreakfast, double timeSecondBreakfast, double timeSupper, double timeLunch,
               double timeDinner, double timeSecondDinner, double timeSleepDown) {

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
