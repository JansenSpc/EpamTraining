package edu.by.epam.ellipse.specification.impl;

import edu.by.epam.ellipse.entity.Ellipse;
import edu.by.epam.ellipse.entity.EllipseData;
import edu.by.epam.ellipse.entity.EllipseWarehouse;
import edu.by.epam.ellipse.specification.EllipseSpecification;

public class Square implements EllipseSpecification<Ellipse> {
    private double from;
    private double to;

    public Square(double from, double to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean specify(Ellipse ellipse) {
        EllipseWarehouse wh = EllipseWarehouse.getInstance();
        EllipseData data = wh.get(ellipse.getId());

        double ellipseSquare = data.getSquare();

        return ellipseSquare >= from && ellipseSquare <= to;
    }
}
