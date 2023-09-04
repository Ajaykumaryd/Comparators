import java.util.Arrays;
import java.util.Comparator;
import java.util.*;

public class Comparators implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 % 10 > o2 % 10) {
            return 1;
        } else {
            return -1;
        }
    }
;

//    In Java, when implementing a compare method for a comparator, the return values 1, -1, and 0 are typically used to indicate the following:
//    If o1 should be considered greater than o2, you return 1.
//    If o1 should be considered less than o2, you return -1.
//    If o1 is equal to o2, you return 0.


    public static void main(String[] args) {
        Integer[] numbers = {123, 45, 67, 89, 12};

        // Sort the numbers using the custom comparator
        Arrays.sort(numbers, new Comparators());

        // Print the sorted numbers
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
    }



