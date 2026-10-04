import static java.lang.System.*;

public class Date
{
    private int year;
    private int month;
    private int day;

    public static void main(String[] args)
    {
        Date date1 = new Date();
        Date date2 = new Date(2018, 2, 1);

        out.printf("Date 1: %s\nDate 2: %s", date1, date2);
    }

    public Date(int year, int month, int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Date()
    {
        this(2000, 1, 1);
    }

    @Override
    public String toString()
    {
        return year + "-" + month + "-" + day;
    }
}
