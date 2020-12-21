package edu.by.epam.ellipse.comparator;

import edu.by.epam.ellipse.entity.Ellipse;
import java.util.Comparator;

public class EllipseComparator implements Comparator<Ellipse> {
    @Override
    public int compare(Ellipse o1, Ellipse o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}
