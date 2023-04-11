package bonus_mission;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BonusBinarySearchTest {
    @Test
    public void testSearchEmptyArray() {
        int[] arr = {};
        assertEquals(-1, BonusBinarySearch.search(arr, 5));
    }

    @Test
    public void testSearchArrayWithOneElement() {
        int[] arr = {5};
        assertEquals(0, BonusBinarySearch.search(arr, 5));
        assertEquals(-1, BonusBinarySearch.search(arr, 4));
    }

    @Test
    public void testSearchArrayWithMultipleElements() {
        int[] arr = {2, 3, 5, 6, 8, 10, 12};
        assertEquals(2, BonusBinarySearch.search(arr, 5));
        assertEquals(5, BonusBinarySearch.search(arr, 10));
        assertEquals(-1, BonusBinarySearch.search(arr, 7));
    }

    @Test
    public void testSearchArrayWithDuplicateElements() {
        int[] arr = {2, 3, 5, 5, 8, 10, 12};
        assertEquals(2, BonusBinarySearch.search(arr, 5));
        assertEquals(5, BonusBinarySearch.search(arr, 10));
        assertEquals(-1, BonusBinarySearch.search(arr, 7));
    }

    @Test
    public void testSearchArrayWithNegativeElements() {
        int[] arr = {-10, -8, -6, -3, 0, 2, 5};
        assertEquals(4, BonusBinarySearch.search(arr, 0));
        assertEquals(-1, BonusBinarySearch.search(arr, -5));
        assertEquals(-1, BonusBinarySearch.search(arr, 6));
    }
}
