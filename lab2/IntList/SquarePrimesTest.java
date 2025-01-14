package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquarePrimesTest {

    /**
     * Here is a test for isPrime method. Try running it.
     * It passes, but the starter code implementation of isPrime
     * is broken. Write your own JUnit Test to try to uncover the bug!
     */
    @Test
    public void testSquarePrimesSimple() {
        IntList lst = IntList.of(14, 15, 16, 17, 18);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("14 -> 15 -> 16 -> 289 -> 18", lst.toString());
        assertTrue(changed);
    }
    @Test
    public void testSquarePrimes2() {
        IntList lst = IntList.of(1, 3, 10, 12, 13);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("1 -> 9 -> 10 -> 12 -> 169", lst.toString());
        assertTrue(changed);
    }
    @Test
    public void testSquarePrimes3() {
        IntList lst = IntList.of(8, 6, 10, 12, 4, 100);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("8 -> 6 -> 10 -> 12 -> 4 -> 100", lst.toString());
        assertFalse(changed);
    }
    @Test
    public void testSquarePrimes4() {
        IntList lst = IntList.of(7, 11, 23, 31);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("49 -> 121 -> 529 -> 961", lst.toString());
        assertTrue(changed);
    }
}
