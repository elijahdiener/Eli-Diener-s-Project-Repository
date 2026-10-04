import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.InputMismatchException;

public class ArrayBounds
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        int[] randNumbers = new int[10];

        for (int i = 0; i < 10; i++)
        {
            randNumbers[i] = (int)(random() * 100 + 1);
        }

        try
        {
            out.print("Enter an index:\n>");
            int index = input.nextInt();
            out.printf("Value at index is: %d", randNumbers[index]);
        }
        catch (InputMismatchException e)
        {
            out.print("Incorrect data type");
        }
        catch (IndexOutOfBoundsException e)
        {
            out.print("Index out of bounds");
        }

    }
}
