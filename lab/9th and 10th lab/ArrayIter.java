import java.util.*;

public class ArrayIter {

    public static void main(String[] args) {
        // Create and populate the list
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter students detail : StudentID, Name and marks of three subject:");

        list.add(sc.next());
        list.add(sc.next());
        list.add(sc.next());
        list.add(sc.next());
        list.add(sc.next());

        sc.close();
        // Displaying the list
        System.out.println("The list is: \n" + list);

        // Create an iterator for the list
        // using iterator() method
        Iterator<String> iter = list.iterator();

        // Displaying the values after iterating
        // through the list
        System.out.println("\nThe iterator values" + " of list are: ");
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }
}