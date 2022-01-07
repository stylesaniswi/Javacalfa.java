
import java.util.*;

public class MethPrac {

    public static void P_Array() {

        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 10; i <= 18; i++)
            al.add(i);
        System.out.println(al);
        System.out.println("Removing the elemet 3rd & 6th:");
        al.remove(3);
        al.remove(6);
        System.out.println(al);

        // Printing elements one by one
        for (int i = 0; i < al.size(); i++)
            System.out.print(al.get(i) + " ");

        System.out.println("Is ArrayList Empty: " + al.isEmpty());
        System.out.println("using iterator()");

        Iterator<Integer> itr = al.iterator();// getting the Iterator
        while (itr.hasNext()) {// check if iterator has the elements
            System.out.println(itr.next());// printing the element and move to next
        }

    }

    public static void P_linkedlist() {
        LinkedList<Integer> ll = new LinkedList<Integer>();

        for (int i = 1; i <= 5; i++)
            ll.add(i);
        System.out.println(ll);

        ll.remove(3);
        System.out.println(ll);
        for (int i = 0; i < ll.size(); i++)
            System.out.print(ll.get(i) + " ");
    }

    public static void P_hashset() {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Hello ");
        hs.add("VIT");
        hs.add("will");
        hs.add("Open");
        hs.add("soon");
        // Traversing elements
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }

    public static void P_hashmap() {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        System.out.println("Initial list of elements: " + hm);
        hm.put(100, "Anurag");
        hm.put(101, "Beejan");
        hm.put(102, "Anish");

        System.out.println("After invoking put() method ");
        for (Map.Entry<Integer, String> m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        hm.putIfAbsent(103, "Jeevan");
        System.out.println("After invoking putIfAbsent() method ");
        for (Map.Entry<Integer, String> m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(104, "Diwesh");
        map.putAll(hm);
        System.out.println("After invoking putAll() method ");
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

    // Main Method
    public static void main(String[] args) {
        System.out.println("Practicing inside arraylist");
        P_Array();

        System.out.println("Practicing inside Linkedlist");
        P_linkedlist();

        System.out.println("Practicing inside Hashset");
        P_hashset();

        System.out.println("Practicing inside Hashmap");
        P_hashmap();

    }
}
