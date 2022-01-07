import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Collections {
    static Map<String, List<String>> map1 = new HashMap<String, List<String>>();
    static Map<String, String> map2 = new HashMap<String, String>();

    public void add_in_map1(String key, List<String> values) {
        map1.put(key, values);
        System.out.println(map1);
    }

    public void delete_in_map1(String key) {
        map1.remove(key);
        System.out.println(map1);
    }

    public void findFaculties(String key) {
        if (map1.containsKey(key)) {
            List<String> faculties = new ArrayList<String>();
            List<String> list = map1.get(key);
            Set<String> keys = map2.keySet();
            for (String l : list) {
                for (String k : keys) {
                    if (l.equals(k)) {
                        faculties.add(map2.get(k));
                    }
                }
            }
            System.out.println(faculties);
        } else
            System.out.println("No such student");
    }

    public static void main(String[] args) {
        int c = 1;
        List<String> valSetOne = new ArrayList<String>();
        valSetOne.add("Python");
        valSetOne.add("Maths");
        valSetOne.add("C");
        List<String> valSetTwo = new ArrayList<String>();
        valSetTwo.add("C");
        valSetTwo.add("C++");
        List<String> valSetThree = new ArrayList<String>();
        valSetThree.add("C++");
        valSetThree.add("Physics");
        valSetThree.add("Chemistry");
        map1.put("A", valSetOne);
        map1.put("B", valSetTwo);
        map1.put("C", valSetThree);
        map2.put("Python", "ddd");
        map2.put("Maths", "eee");
        map2.put("C", "aaa");
        map2.put("C++", "bbb");
        map2.put("Physics", "fff");
        map2.put("Chemistry", "ggg");
        map2.put("DBMS", "hhh");
        map2.put("PHP", "iii");
        map2.put("DLD", "jjj");
        map2.put("JAVA", "ccc");
        map2.put("CAO", "kkk");
        System.out.println("Fetching Keys and corresponding [Multiple] Values:\n");
        for (Map.Entry<String, List<String>> entry1 : map1.entrySet()) {
            String key1 = entry1.getKey();
            List<String> values1 = entry1.getValue();
            System.out.println("Key = " + key1);
            System.out.println("Values = " + values1);
        }
        System.out.println("Fetching Keys and corresponding [Single] Values: \n");
        for (Map.Entry<String, String> entry2 : map2.entrySet()) {
            String key2 = entry2.getKey();
            String values2 = entry2.getValue();
            System.out.println("Key = " + key2);
            System.out.println("Values = " + values2);
        }

        while (c == 1) {
            System.out.println("\nEnter choice:\n1. For addition\n2. For Deletion\n3. For Display\n4. Exit\n");
            {

                Scanner sc = new Scanner(System.in);
                int choice = sc.nextInt();
                switch (choice) {

                    case 1:
                        Collections c1 = new Collections();
                        List<String> val = new ArrayList<String>();
                        System.out.println("Enter the name of student: ");
                        String s1 = sc.next();

                        System.out.println("Enter the no. of subjects: ");
                        int s2 = sc.nextInt();
                        System.out.println("Enter the name of subjects: ");
                        for (int i = 0; i < s2; i++) {
                            String s3 = sc.next();
                            val.add(s3);
                        }
                        c1.add_in_map1(s1, val);
                        break;

                    case 2:
                        Collections c2 = new Collections();
                        System.out.println("Enter the name of student to be deleted: ");
                        String s4 = sc.next();
                        c2.delete_in_map1(s4);
                        break;

                    case 3:
                        Collections c3 = new Collections();
                        System.out.println("Enter the name of student: ");
                        String s5 = sc.next();
                        c3.findFaculties(s5);
                        break;

                    case 4:
                        c = 0;

                    default:
                        System.out.println("Invalid Input");
                }
                sc.close();

            }

        }

    }
}