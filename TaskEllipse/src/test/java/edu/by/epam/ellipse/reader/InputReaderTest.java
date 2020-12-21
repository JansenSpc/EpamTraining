package edu.by.epam.ellipse.reader;

import edu.by.epam.ellipse.constant.Strings;
import edu.by.epam.ellipse.exception.EmptyFileException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class InputReaderTest {
    InputReader ir;


    @BeforeMethod
    public void setUp() {
        this.ir = new InputReader();
    }

    @Test
    public void testReadFromFile() throws EmptyFileException {
        List<String> actual = ir.readFromFile(Strings.DEFAULT_FILE_NAME);
        List<String> expected = new ArrayList<>();
        expected.add("2.0 3.0 4.0 6.0");
        assertEquals(actual, expected);
    }

    @AfterMethod
    public void tearDown() {
        this.ir = null;
    }
}