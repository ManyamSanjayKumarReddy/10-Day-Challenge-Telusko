import java.util.HashMap;
import java.util.Map;

public class fibonaaci_memoization {
    
    private static Map<Integer, Integer> cache = new HashMap<>();

    public static void main(String[] args){

        int pos = 98;
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

        if(cache.containsKey(pos))
        {
            return cache.get(pos);
        }

        int result = fib(pos-1) + fib(pos-2);
        cache.put(pos, result);
        return result;
    }
}