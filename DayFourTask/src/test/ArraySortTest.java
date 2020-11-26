package test;

import edu.by.epam.arrays.entity.Array;
import edu.by.epam.arrays.service.ArraySort;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sun.security.krb5.internal.crypto.Aes128;

import static org.testng.Assert.*;

public class ArraySortTest {
    ArraySort arraySort = new ArraySort();
    Array array;

    @BeforeMethod
    public void setUp() {
        array = new Array(new int[] {6,1,3,5,4,2});
    }

    @Test
    public void testSelectSort() {
        ArraySort ss = new ArraySort();
        Array actual = array;
        ss.selectSort(array);
        Array expected = new Array(new int[] {1,2,3,4,5,6});
        assertEquals(actual, expected);
    }

    @Test
    public void testBubbleSort() {
        ArraySort bs = new ArraySort();
        Array actual = array;
        bs.bubbleSort(array);
        Array expected = new Array(new int[] {1,2,3,4,5,6});
        assertEquals(actual, expected);
    }

    @Test
    public void testInsertionSort() {
        ArraySort is = new ArraySort();
        Array actual = array;
        is.insertionSort(array);
        Array expected = new Array(new int[] {1,2,3,4,5,6});
        assertEquals(actual, expected);
    }

    @AfterMethod
    public void tearDown() {
        array = null;
    }
}