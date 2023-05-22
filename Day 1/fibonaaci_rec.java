public class fibonaaci_rec {
    public static void main(String[] args){

        int pos = 8;
        int result = fib(pos);
        System.out.println(result);
    }

    public static int fib(int pos)
    {
        if(pos == 0){
            return 0;
        }
        if(pos == 1 || pos == 2){
            return 1;
        }

        return fib(pos-1) + fib(pos-2);
    }
}