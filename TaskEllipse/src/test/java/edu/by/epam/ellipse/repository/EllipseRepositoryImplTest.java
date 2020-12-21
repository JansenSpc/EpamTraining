package edu.by.epam.ellipse.repository;

import edu.by.epam.ellipse.comparator.EllipseComparator;
import edu.by.epam.ellipse.entity.Ellipse;
import edu.by.epam.ellipse.entity.Point;
import edu.by.epam.ellipse.repository.impl.EllipseRepositoryImpl;
import edu.by.epam.ellipse.specification.EllipseSpecification;
import edu.by.epam.ellipse.specification.impl.IdSpec;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class EllipseRepositoryImplTest {
    EllipseRepositoryImpl er;

    @BeforeMethod
    public void setUp() {
        this.er = new EllipseRepositoryImpl();
    }

    @Test
    public void testSort() {
        EllipseComparator ec = new EllipseComparator();
        Ellipse ellipse = new Ellipse(new Point(2.0, 3.0), new Point(4.0, 6.0));
        Ellipse ellipse1 = new Ellipse(new Point(3.0, 4.0), new Point(4.0, 6.0));
        er.add(ellipse);
        er.add(ellipse1);
        List<Ellipse> result = er.sort(ec);
        List<Ellipse> expResult = new ArrayList<>();
        expResult.add(ellipse);
        expResult.add(ellipse1);

        assertEquals(result, expResult);
    }

    @Test
    public void testQuery() {
        IdSpec id= new IdSpec(1, 3);
        Ellipse ellipse = new Ellipse(new Point(2.0, 3.0), new Point(4.0, 6.0));
        Ellipse ellipse1 = new Ellipse(new Point(3.0, 4.0), new Point(4.0, 6.0));
        er.add(ellipse);
        er.add(ellipse1);
        List<Ellipse> actual = er.query(id);
        List<Ellipse> expected = new ArrayList<>();
        expected.add(ellipse);
        expected.add(ellipse1);
        assertEquals(actual, expected);
    }

    @AfterMethod
    public void tearDown() {
        this.er = null;
    }
}