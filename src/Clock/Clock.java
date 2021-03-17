package Clock;

public class Clock {

    private int hour;
    private int minute;
    private int second;


    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public Clock(int totalSeconds){ }
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void set(int hour,int minute,int second){

    }
    public void set(int totalSeconds){
    }

    public int getTimeInSeconds(){
        return 0;
    }

    public void tic(){}


    @Override
    public String toString() {
        return "Clock{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
}
