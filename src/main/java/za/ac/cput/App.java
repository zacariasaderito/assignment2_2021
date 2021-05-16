package za.ac.cput;

import java.util.*;

/**
 * Hello world!
 *
 */

public class App 
{

    private static Map<Integer, String> m;
    private static Collection<String> s;
    private static List<String> l;

    public static void main( String[] args ) {
        list();
        map();
        set();
    }

    public static void list() {
        System.out.println("\nList \n");

        l = new ArrayList<String>();

        // Adding to the List
        l.add("Object 1");
        l.add("Object 2");
        l.add("Object 3");
        l.add("Object 4");
        l.add("Object 5");
        l.add("Object 5"); // duplicate

        // Removing from the List
        l.remove(3);

        // Finding object from the List
        String getObject = l.get(2);
        System.out.println("The object you are looking for is: " + getObject);

        // Iterate through the list
        for(int i = 0; i < l.size(); i++){
            String element = l.get(i);
            System.out.println(element);
        }

        // Clear the List
        l.clear();

    }

    public static void map() {

        System.out.println("\nMap \n");

        m = new HashMap<>();

        // Adding to the Map
        m.put(1, "1st Object");
        m.put(2, "2nd Object");
        m.put(3, "3rd Object");
        m.put(4, "4th Object");
        m.put(5, "5th Object");

        // Removing from the Map
        m.remove(2);

        // Finding object from the Map
        String getObject = m.get(1);
        String getObject1 = m.get(4);

        // Iterate through the Map
        for (Map.Entry<Integer,String> entry: m.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        // Clear the Map
        m.clear();

    }

    public static void set() {

        System.out.println("\nSet \n");

        s = new HashSet();

        // Adding to the Set
        boolean added1 = s.add("Obj 1");
        boolean added2 = s.add("Obj 2");
        boolean added3 = s.add("Obj 3");
        boolean added4 = s.add("Obj 3"); // Duplicate

        // Removing from the Set
        boolean removed = s.remove("Obj 3");
        boolean removed1 = s.remove("Obj 4"); // Unknown object

        // Finding object from the Set
        boolean isThere =  s.contains("Obj 1");


        // Iterate through the Set
        for (String element: s) {
            System.out.println(element);
        }

        // Clear the Set
        s.clear();

        System.out.println(isThere);

    }

}
