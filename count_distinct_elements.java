import java.lang.reflect.Array;
import java.util.*;
public class count_distinct_elements {
    public static void main(String []args) {
        int arr[] = {4, 3, 2, 5, 6, 7, 3, 4, 1};
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {//o(n)
            hs.add(arr[i]);
        }
        System.out.println(hs.size());

    }

}
