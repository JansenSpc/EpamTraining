package edu.by.epam.ellipse.validator;

import edu.by.epam.ellipse.entity.Point;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class EllipseValidatorTest {
    EllipseValidator ev;

    @BeforeMethod
    public void setUp() {
        this.ev = new EllipseValidator();
    }

    @Test
    public void testEllipseIsValid() {
        List<Point> p = new ArrayList<>();
        p.add(new Point(2.0, 3.0));
        p.add(new Point(4.0, 6.0));
        boolean condition = ev.isEllipse(p);
        assertTrue(condition);
    }

    @Test
    public void testIsEllipse() {
        List<Point> p = new ArrayList<>();
        p.add(new Point(2.0, 3.0));
        p.add(new Point(4.0, 6.0));
        boolean condition = ev.isEllipse(p);
        assertTrue(condition);
    }

    @Test
    public void testNotCrossX() {
        List<Point> points = new ArrayList<>();
        points.add(new Point(2.0, 2.0));
        points.add(new Point(3.0, 3.0));
        boolean condition = ev.notCrossX(points);
        assertTrue(condition);
    }

    @Test
    public void testNotCrossY() {
        List<Point> points = new ArrayList<>();
        points.add(new Point(2.0, 2.0));
        points.add(new Point(3.0, 3.0));
        boolean condition = ev.notCrossY(points);
        assertTrue(condition);
    }

    @AfterMethod
    public void tearDown() {
        this.ev = null;
    }
}