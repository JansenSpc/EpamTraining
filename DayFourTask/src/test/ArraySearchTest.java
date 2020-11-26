package test;

import edu.by.epam.arrays.entity.Array;
import edu.by.epam.arrays.service.ArraySearch;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

public class ArraySearchTest {

    ArraySearch ArraySearch = new ArraySearch();
    Array array;

    @BeforeMethod
    public void setUp() {
        array = new Array(new int[]{0, 2, 5, 7, 34, 55, 128, 256, 514, 1024, 2048});
    }

    @Test
    public void testSearch() {
        ArraySearch as = new ArraySearch();
        int actual = as.search(array, 2);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void testFindMax() {
        ArraySearch as = new ArraySearch();
        int actual = as.findMax(array);
        int expected = 2048;
        assertEquals(actual, expected);
    }

    @Test
    public void testFindMin() {
        ArraySearch as = new ArraySearch();
        int actual = as.findMin(array);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void testFindPrime() {
        ArraySearch as = new ArraySearch();
        ArrayList<Integer> actual = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        actual = as.findPrime(array);
        expected.add(2);
        expected.add(5);
        expected.add(7);
        assertEquals(actual, expected);

    }

    @Test
    public void testFindThreeDigit() {
        ArraySearch as = new ArraySearch();
        ArrayList<Integer> actual = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        actual = as.findThreeDigit(array);
        expected.add(128);
        expected.add(256);
        expected.add(514);
        assertEquals(actual, expected);
    }

    @Test
    public void testFindFibonacci() {
        ArraySearch as = new ArraySearch();
        ArrayList<Integer> actual = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        actual = as.findFibonacci(array);
        expected.add(0);
        expected.add(2);
        expected.add(5);
        expected.add(34);
        expected.add(55);
        assertEquals(actual, expected);
    }
    @AfterMethod
    public void tearDown() {
        array = null;
    }
}