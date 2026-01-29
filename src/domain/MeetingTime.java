package domain;

public class MeetingTime {
    private int startTime;
    private int endTime;
    private Weekday weekday;

    public MeetingTime(int startTime, int endTime, Weekday weekday) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.weekday = weekday;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public Weekday getWeekday() {
        return weekday;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public void setWeekday(Weekday weekday) {
        this.weekday = weekday;
    }
}
