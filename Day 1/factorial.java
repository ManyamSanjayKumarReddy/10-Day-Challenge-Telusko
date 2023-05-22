// factorial
// 5! = 5*4*3*2*1
// 5! = 1*2*3*4*5
public class factorial {
    public static void main(String[] args) {


        int num = 5;
        int result = 0;

        result = fact(num);

        System.out.println(result);
    }

    public static int fact(int num)
    {
        int value = 1;
        for(int i=1; i<=num; i++)
        {
            value = value * i;
        }

        return value;
    }
}