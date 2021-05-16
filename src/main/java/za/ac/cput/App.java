package za.ac.cput;

import java.util.*;

/**
 * Hello world!
 *
 */

public class App 
{

    private static Map<Integer, String> m;
    private static Collection c;
    private static List l;
    private static Set<String> s;

    public static void main( String[] args ) {
        list();
//        map();
//        set();
//        collection();
    }

    public static void list() {
        l = new ArrayList();

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
        String getObject = (String) l.get(3);
        System.out.println("The object you are looking for is: " + getObject + "\n");

        // Iterate through the list
        for(int i = 0; i < l.size(); i++){
            String element = (String) l.get(i);
            System.out.println(element);
        }

        // Clear the List
        l.clear();

    }

    public static void collection() {

        // Adding to a Collection

        // Removing from the Collection

        // Finding object from the Collection

        // Iterate through the Collection

        // Clear the Collection
    }

    public static void map() {

        m = new HashMap<>();
        System.out.println( "Testing!\n" );

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


        // Clear the Map
        m.clear();

        // display
        System.out.println(getObject);
        System.out.println(getObject1);

    }

    public static void set() {

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
