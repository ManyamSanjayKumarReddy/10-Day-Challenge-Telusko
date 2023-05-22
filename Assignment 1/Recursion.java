public class Recursion
{
    public static void main(String[] args)
    {
        int rows = 6;

        // Looping rows & columns using recursion
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print(pascaltraingle(i, j) + " ");
            }
            System.out.println();
        }
    }

    // Function for calculating the pascals traingle 
    public static int pascaltraingle(int i, int j)
    {
        // As usual provide first & last elements of row as 1
        if(j == 0 || j == i)
        {
            return 1;
        }

        // Else calculate the recursive part

        return pascaltraingle(i-1, j-1) + pascaltraingle(i-1, j);
    }
}