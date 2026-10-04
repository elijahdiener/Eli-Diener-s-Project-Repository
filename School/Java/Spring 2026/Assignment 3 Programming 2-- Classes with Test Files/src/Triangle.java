public class Triangle
{
    private double base;
    private double height;

    public Triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }

    public Triangle()
    {
        this(0.0, 0.0);
    }

    public double getBase()
    {
        return base;
    }

    public double getHeight()
    {
        return height;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getArea()
    {
        return (double)(1/2) * base * height;
    }

    @Override
    public String toString()
    {
        return "base: " + base + ", height: " + height;
    }
}
