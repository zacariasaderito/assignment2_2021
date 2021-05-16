package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {



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
        assertTrue(l.contains("Object 3"));
        assertEquals("Object 3", l.get(2));
        assertNotEquals(l.get(1), l.get(3));
        assertEquals(l.get(4), l.get(5)); // Check duplicate value
        assertEquals(6, l.size());


        // Removing from the List
        l.remove(2);

        assertFalse(l.contains("Object 3"));
        assertEquals("Object 4", l.get(2));
        assertEquals(l.get(3), l.get(4)); // Check duplicate value
        assertEquals(5, l.size());


        // Clear the List
        l.clear();

        assertEquals(0, l.size());
        assertTrue(l.isEmpty());
    }

    @Test
    void collection() {
    }

    @Test
    void map() {

        Map<Integer,String> m = new HashMap<>();

        // Adding to the Map
        m.put(1, "1st Object");
        m.put(2, "2nd Object");
        m.put(3, "3rd Object");
        m.put(4, "4th Object");
        m.put(5, "5th Object");
        m.put(6, "5th Object");  // Duplicate Value, But different Key

        assertFalse(m.isEmpty());
        assertEquals(6, m.size());
        assertTrue(m.containsKey(4));
        assertFalse(m.containsKey(7)); // Unknown object
        assertEquals("2nd Object", m.get(2));
        assertEquals(m.get(6), m.get(5)); // Duplicate Value, But different Key
        assertNotEquals(m.get(2), m.get(3));
        assertNotEquals("2nd Object", m.get(3));
        assertNull(m.get(7));       // Unknown object


        // Removing from the Map
        m.remove(6);

        assertFalse(m.containsKey(6));
        assertNull(m.get(6));
        assertEquals(5, m.size());


        // Clear the Map
        m.clear();

        assertTrue(m.isEmpty());
        assertEquals(0, m.size());
    }

    @Test
    void set() {

        Set<String> s = new HashSet();

        // Adding to the Set
        boolean added1 = s.add("Obj 1");
        boolean added2 = s.add("Obj 2");
        boolean added3 = s.add("Obj 3");
        boolean added4 = s.add("Obj 3"); // Duplicate

        assertFalse(s.isEmpty());
        assertTrue(s.contains("Obj 3"));
        assertFalse(s.contains("Obj 4"));
        assertTrue(added3);
        assertFalse(added4);  // Duplicate
        assertEquals(3, s.size());


        // Removing from the Set
        boolean removed = s.remove("Obj 3");
        boolean removed1 = s.remove("Obj 4"); // Unknown object

        assertTrue(removed);
        assertFalse(s.contains("Obj 3"));
        assertTrue(s.contains("Obj 1"));
        assertFalse(removed1); // Unknown object
        assertEquals(2, s.size());


        // Clear the Set
        s.clear();

        assertTrue(s.isEmpty());
        assertEquals(0, s.size());
    }
}