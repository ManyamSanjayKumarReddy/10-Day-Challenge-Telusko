
public class factorial_rec {
    public static void main(String[] args) {

        int num = 6;
        int result = 0;

        result = fact(num);

        System.out.println(result);
    }

    public static int fact(int num)
    {
        if(num == 0)
        {
            return 1;   
        }
        
        return num * fact(num-1);
    }
}