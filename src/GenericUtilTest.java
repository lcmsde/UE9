import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class GenericUtilTest {

    @org.junit.jupiter.api.Test
    void gambling() {
    }

    @org.junit.jupiter.api.Test
    void arrayToSchlange() {
    }

    @org.junit.jupiter.api.Test
    void printAll() {
        ArrayList<Integer> s = new ArrayList<>();
        s.add(2);
        s.add(3);
        GenericUtil.printAll(s);
    }

    @Test
    void insertInto() {
        Object[] arr = new Object[2];
        Puffer<Integer> pete = new SchlangeMitEVL<>();
        arr[0] = 3;
        arr[1] = 6;
        GenericUtil.insertInto(arr,pete);
        System.out.println(pete.remove());
        System.out.println(pete.remove());
    }

    @Test
    void testInsertInto() {

        Puffer<Integer> pete2 = new SchlangeMitEVL<>();
        Puffer<Integer> pete3 = new SchlangeMitEVL<>();

        pete3.insert(2);
        pete3.insert(4);
        GenericUtil.insertInto(pete2,pete3);
        assertEquals(pete2.remove(),2);
        assertEquals(pete2.remove(),4);
        assertTrue(pete2.isEmpty());
    }

    @Test
    void getMinima() {
        Puffer<Integer> pete2 = new SchlangeMitEVL<>();
        Puffer<Integer> pete3 = new SchlangeMitEVL<>();
        pete3.insert(2);
        pete3.insert(4);
        pete3.insert(3);
        pete3.insert(6);

    }
}