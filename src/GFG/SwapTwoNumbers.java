package GFG;
import java.util.*;
public class SwapTwoNumbers {
    static List<Integer> get(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        List<Integer> result = new ArrayList<>();
        result.add(a);
        result.add(b);

        return result;
    }
}





