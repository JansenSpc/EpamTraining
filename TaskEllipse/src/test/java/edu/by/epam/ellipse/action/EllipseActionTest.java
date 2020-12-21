package edu.by.epam.ellipse.action;

import edu.by.epam.ellipse.entity.Ellipse;
import edu.by.epam.ellipse.entity.Point;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EllipseActionTest {
    EllipseAction ea;

    @BeforeMethod
    public void setUp() {
        this.ea = EllipseAction.getInstance();
    }

    @Test
    public void testIsCrossOx() {
        Ellipse ellipse = new Ellipse(new Point(-5.0, 3), new Point(-3, 0));
        boolean condition = ea.isCrossOx(ellipse);
        assertTrue(condition);
    }

    @Test
    public void testIsCrossOy() {
        Ellipse ellipse = new Ellipse(new Point(-3.0, 5.0), new Point(0.0, 1));
        boolean condition = ea.isCrossOy(ellipse);

        assertTrue(condition);
    }

    @Test
    public void testIsCircle() {
        Ellipse ellipse = new Ellipse(new Point(3.0, 3.0), new Point(4.0, 4.0));
        boolean condition = ea.isCircle(ellipse);
        assertTrue(condition);
    }

    @Test
    public void testCalculateSquare() {
        Ellipse ellipse = new Ellipse(new Point(0.0, 3.0), new Point(-4.0, 0.0));
        double result = ea.calculateSquare(ellipse);
        double expResult = 37.69911184307752;

        assertEquals(result, expResult);
    }

    @Test
    public void testCalculatePerimeter() {
        Ellipse ellipse = new Ellipse(new Point(0.0, 3.0), new Point(-4.0, 0.0));
        double result = ea.calculatePerimeter(ellipse);
        double expResult = 22.113778196044297;

        assertEquals(result, expResult);
    }

    @AfterMethod
    public void tearDown() {
        this.ea = null;
    }
}