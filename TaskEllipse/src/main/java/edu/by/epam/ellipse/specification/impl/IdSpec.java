package edu.by.epam.ellipse.specification.impl;

import edu.by.epam.ellipse.entity.Ellipse;
import edu.by.epam.ellipse.specification.EllipseSpecification;

public class IdSpec implements EllipseSpecification<Ellipse> {
    private double from;
    private double to;

    public IdSpec(double start, double end) {
        this.from = from;
        this.to = end;
    }


    @Override
    public boolean specify(Ellipse ellipse) {
        double id = ellipse.getId();
        return id >= from && id <= to;
    }
}
