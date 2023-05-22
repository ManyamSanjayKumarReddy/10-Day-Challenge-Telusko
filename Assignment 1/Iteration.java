public class Iteration {
    public static void main(String[] args)
    {
        int rows = 14;

        // initialize the 2D array for the pascals triangle 
        int[][] pascaltriangle = new int[rows][];

        // loop through each row
        for(int i = 0; i < rows; i++)
        {
            // creating array for the rows in pascals triangle
            pascaltriangle[i] = new int[i+1]; 

            // looping to each coloumn in the created rows
            for(int j = 0; j <= i; j++)
            {
                // Providing the first & last element of the row as 1
                if(j == 0 || j == i){
                    pascaltriangle[i][j] = 1;
                }
                else
                {
                    // For the remaining elements we have to sum the above 2 elements and provide it as the value
                    pascaltriangle[i][j] = pascaltriangle[i-1][j-1] + pascaltriangle[i-1][j];
                }
            }
        }

        // Displaying the final pascals triangle in the array format
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print(pascaltriangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}