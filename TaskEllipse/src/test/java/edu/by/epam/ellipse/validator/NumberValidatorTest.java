package edu.by.epam.ellipse.validator;

import edu.by.epam.ellipse.exception.ValidatorException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberValidatorTest {
    NumberValidator nv;

    @BeforeMethod
    public void setUp() {
        this.nv = new NumberValidator();
    }

    @Test
    public void testNumberIsValid() throws ValidatorException {
        String line = "2.0";
        boolean condition = nv.numberIsValid(line);
        assertTrue(condition);
    }

    @AfterMethod
    public void tearDown() {
    }
}