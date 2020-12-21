package edu.by.epam.ellipse.specification.impl;

import edu.by.epam.ellipse.entity.Ellipse;
import edu.by.epam.ellipse.entity.Point;
import edu.by.epam.ellipse.specification.EllipseSpecification;

public class MajorAxis implements EllipseSpecification<Ellipse> {
    private double from;
    private double to;

    public MajorAxis(double from, double to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean specify(Ellipse ellipse) {
        Point startPoint = ellipse.getStartPoint();
        Point endPoint = ellipse.getEndPoint();
        double majorAxis = Math.abs(startPoint.getX() - endPoint.getX());

        return majorAxis >= from && majorAxis <= to;
    }
}
