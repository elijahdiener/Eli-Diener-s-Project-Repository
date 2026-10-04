import static java.lang.Math.*;

public class Point
{
    private double x;
    private double y;

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Point()
    {
        this(0.0, 0.0);
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public double distance(Point point2)
    {
        return sqrt( pow( (x - point2.getX()), 2) + pow( (y - point2.getY()), 2));
    }

    @Override
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
}
