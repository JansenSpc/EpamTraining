package edu.by.epam.ellipse.factory;

import edu.by.epam.ellipse.entity.Ellipse;
import edu.by.epam.ellipse.entity.Point;
import edu.by.epam.ellipse.factory.impl.EllipseFactoryImpl;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class EllipseFactoryImplTest {
    EllipseFactoryImpl factory;

    @BeforeMethod
    public void setUp() {
        this.factory = new EllipseFactoryImpl();
    }

    @Test
    public void testCreateEllipse() {
        List<Point> p = new ArrayList<>();
        p.add(new Point(2.0, 3.0));
        p.add(new Point(4.0, 6.0));
        Ellipse actual = factory.createEllipse(p);
        Ellipse expected = new Ellipse(new Point(2.0, 3.0), new Point(4.0, 6.0));
        assertEquals(actual, expected);
    }

    @AfterMethod
    public void tierDown() {
        this.factory = null;
    }
}