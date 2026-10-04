import static java.lang.System.*;

public class Time
{
    private int hour;
    private int minute;
    private int second;

    public static void main(String[] args)
    {
        Time time1 = new Time();
        Time time2 = new Time(11, 11, 11);
        out.printf("Time 1: %s\nTime 2: %s", time1, time2);
    }

    public Time(int hour, int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time()
    {
        this(0, 0, 0);
    }

    @Override
    public String toString()
    {
        return hour + ":" + minute + ":" + second;
    }
}
