package edu.by.epam.ellipse.parser;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

public class ParserTest {
    Parser parser;

    @BeforeMethod
    public void setUp() {
        this.parser = new Parser();
    }

    @Test
    public void testParseToDoubleArray() {
        List<Double> doubles = Arrays.asList(2.0, 3.0, 4.0, 6.0);
        List<List<Double>> actual = parser.parseToDoubleArray("2.0 3.0 4.0 6.0");
        List<List<Double>> expected = Arrays.asList(doubles);
        assertEquals(actual, expected);
    }

    @Test
    public void testParseToStringArray() {
        String line = "2.0 3.0 4.0 6.0";
        List<String> actual = parser.parseToStringArray(line);
        List<String> expected= new ArrayList<>();
        expected.add("2.0");
        expected.add("3.0");
        expected.add("4.0");
        expected.add("6.0");
        assertEquals(actual, expected);
    }

    @AfterMethod
    public void tearDown() {
        this.parser = null;
    }
}