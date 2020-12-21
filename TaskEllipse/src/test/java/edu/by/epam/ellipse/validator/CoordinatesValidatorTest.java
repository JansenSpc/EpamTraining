package edu.by.epam.ellipse.validator;

import edu.by.epam.ellipse.exception.ValidatorException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

public class CoordinatesValidatorTest {
    CoordinatesValidator cv;

    @BeforeMethod
    public void setUp() {
        this.cv = new CoordinatesValidator();
    }

    @Test
    public void isRightAmountTest() throws ValidatorException {
        List<Double> coordinates = Arrays.asList(2.0, 3.0, 4.0, 6.0);
        boolean condition = cv.isRightAmount(coordinates);
        assertTrue(condition);
    }

    @AfterMethod
    public void tearDown() {
    }
}