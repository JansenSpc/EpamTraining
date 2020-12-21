package edu.by.epam.ellipse.specification.impl;

import edu.by.epam.ellipse.entity.Ellipse;
import edu.by.epam.ellipse.entity.EllipseData;
import edu.by.epam.ellipse.entity.EllipseWarehouse;
import edu.by.epam.ellipse.specification.EllipseSpecification;

public class Perimeter implements EllipseSpecification<Ellipse> {
    private double from;
    private double to;

    public Perimeter(double from, double to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean specify(Ellipse ellipse) {
        EllipseWarehouse wh = EllipseWarehouse.getInstance();
        EllipseData data = wh.get(ellipse.getId());

        double perimeter = data.getPerimeter();

        return perimeter >= from && perimeter <= to;
    }
}
