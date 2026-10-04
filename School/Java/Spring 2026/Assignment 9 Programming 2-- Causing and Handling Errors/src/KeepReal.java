import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.InputMismatchException;

public class KeepReal
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        double calculatedSquareRoot = 0;

        try {
            out.print("Enter a number:\n>");
            double x = input.nextDouble();
            if (x > -1)
            {
                calculatedSquareRoot = squareRoot(x);
            }
            else
            {
                throw new IllegalArgumentException(String.format("Invalid input: x is negative: %s", x));
            }
            out.printf("squareRoot(%s) = %s", x, calculatedSquareRoot);
        }
        catch (InputMismatchException e)
        {
            out.print("Wrong data type");
        }
        catch (IllegalArgumentException e)
        {
            out.print(e.getMessage());
        }

    }

    public static double squareRoot(double x) {
        return sqrt(x);
    }
}
