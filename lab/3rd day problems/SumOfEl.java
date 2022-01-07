import java.util.*;

public class SumOfEl {
    public static ArrayList<Integer> two_sum_array_target(final List<Integer> a, int b) {

        HashMap<Integer, Integer> my_map = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(0);
        result.add(1);
        for (int i = 0; i < a.size(); i++) {
            if (my_map.containsKey(a.get(i))) {
                int index = my_map.get(a.get(i));
                result.set(0, index);
                result.set(1, i);
                break;
            } else {
                my_map.put(b - a.get(i), i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> my_array = new ArrayList<Integer>();
        System.out.println("Array elements are: ");
        for (int i = 0; i < 10; i++) {
            my_array.add(scan.nextInt());

        }
        System.out.println("target is:");
        int target = scan.nextInt();
        ArrayList<Integer> result = two_sum_array_target(my_array, target);
        for (int i : result)
            System.out.print("Index: " + i + " ");
    }
}
