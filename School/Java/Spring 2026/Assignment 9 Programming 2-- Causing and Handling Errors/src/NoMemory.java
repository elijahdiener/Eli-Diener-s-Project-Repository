public class NoMemory
{
    public static void main(String[] args)
    {
        boolean resume = true;
        while (resume)
        {
            String[] greatIdea = new String[2147483647];
        }
    }
}