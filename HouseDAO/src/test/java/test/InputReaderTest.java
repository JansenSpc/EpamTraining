package test;

import edu.by.epam.entity.House;
import edu.by.epam.entity.Street;
import edu.by.epam.reader.InputReader;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class InputReaderTest extends Assert {
    InputReader inputReader = new InputReader();
    List<House> houses = new ArrayList<>();

    @BeforeClass
    public void beforeClass() {
        houses.add(new House(13, 56, 4, 3, Street.PUSHKINA));
        houses.add(new House(38, 90, 9, 5, Street.LENINA));
        houses.add(new House(2, 30, 2, 2, Street.KOLASA));
        houses.add(new House(24, 45, 11, 2, Street.ESENINA));
        houses.add(new House(67, 70, 4, 3, Street.KUPALY));
        houses.add(new House(23, 20, 8, 1, Street.PUSHKINA));
        houses.add(new House(38, 90, 9, 2, Street.LENINA));
        houses.add(new House(12, 20, 2, 1, Street.KOLASA));
        houses.add(new House(24, 45, 11, 2, Street.ESENINA));
        houses.add(new House(10,35, 7, 2, Street.KUPALY));
    }

    @Test
    public void testInputReader() {
        List<House> actual = inputReader.readHouses();
        List<House> expected = houses;
        assertEquals(actual, expected);
    }
}