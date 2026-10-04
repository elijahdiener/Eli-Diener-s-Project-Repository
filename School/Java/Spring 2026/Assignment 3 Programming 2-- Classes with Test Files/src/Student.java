import static java.lang.Math.*;

public class Student
{
    private String firstName;
    private String lastName;
    private int iD;

    public Student(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        iD = 700000000 + (int)(random() * 1000000);
    }

    public Student()
    {
        this("John", "Doe");
    }

    @Override
    public String toString()
    {
        return lastName + ", " + firstName + " (" + iD + ")";
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getID()
    {
        return iD;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
}
