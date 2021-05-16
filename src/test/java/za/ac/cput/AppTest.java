package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {


    @Test
    void main() {
    }

    @Test
    void list() {
        List<String> l = new ArrayList();

        // Adding to the List
        l.add("Object 1");
        l.add("Object 2");
        l.add("Object 3");
        l.add("Object 4");
        l.add("Object 5");
        l.add("Object 5"); // duplicate

        assertFalse(l.isEmpty());
        assertEquals("Object 3",l.get(2));
        assertEquals(l.get(4),l.get(5)); // Check duplicate value
        assertEquals(6,l.size());


        // Removing from the List
        l.remove(2);

        assertEquals("Object 4",l.get(2));
        assertEquals(5,l.size());


        // Clear the List
        l.clear();

        assertEquals(0,l.size());
        assertTrue(l.isEmpty());
    }

    @Test
    void collection() {
    }

    @Test
    void map() {

        Map<Integer,String> m = new HashMap<>();
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

    @Test
    void set() {

        Set<String> s = new HashSet();

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