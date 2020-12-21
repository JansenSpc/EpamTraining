package edu.by.epam.ellipse.specification.impl;

import edu.by.epam.ellipse.entity.Ellipse;
import edu.by.epam.ellipse.entity.Point;
import edu.by.epam.ellipse.specification.EllipseSpecification;

public class MinorAxis implements EllipseSpecification<Ellipse> {
    private double from;
    private double to;

    public MinorAxis(double from, double to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean specify(Ellipse ellipse) {
        Point startPoint = ellipse.getStartPoint();
        Point endPoint = ellipse.getEndPoint();
        double minorAxis = Math.abs(startPoint.getY() - endPoint.getY());

        return minorAxis >= from && minorAxis <= to;
    }
}
