public class fibonaaci {
    public static void main(String[] args){

        int pos = 8;
        int result = fib(pos);
        System.out.println(result);
    }

    public static int fib(int pos)
    {
        int a =0;
        int b = 1;
        int c = 0;

        // 0 1 1 2 ......
        for(int i = 2; i<=pos; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }
}