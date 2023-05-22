import java.util.HashMap;
import java.util.Map;

public class Memoization
{
    private static Map<Integer, Integer> cache = new HashMap<>();

    public static void main(String[] args)
    {
        int rows = 16;

        // Looping rows & columns using memoization
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

        // Map the values into the keys 
        int result = pascaltraingle(i-1, j-1) + pascaltraingle(i-1, j);
        cache.put(i, result);

        return result;
    }
}