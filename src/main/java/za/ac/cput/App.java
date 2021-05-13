package za.ac.cput;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{

    private static Map m;
    private static Collection c;
    private static List l;
    private static Set s;

    public static void main( String[] args )
    {
//        list();
        map();
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

        // Removing from the List
        l.remove(3);

        // Getting object from the List
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

    }

    public static void map() {

        m = new HashMap<>();
        System.out.println( "Testing!\n" );

        // Adding to the Map
        m.put("1st", 0112);
        m.put("2nd", 02212);
        m.put("3rd", 0322);
        m.put("4th", 04);
        m.put("5th", 05412);

        // Removing from the Map

        // Getting object from the Map

        // Iterate through the Map

        // Clear the Map


    }

    public static void set() {


        // Adding to the Set

        // Removing from the Set

        // Getting object from the Set

        // Iterate through the Set

        // Clear the Set


    }
}
