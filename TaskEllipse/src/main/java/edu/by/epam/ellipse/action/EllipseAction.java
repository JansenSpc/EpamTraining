package edu.by.epam.ellipse.action;

import edu.by.epam.ellipse.entity.Ellipse;
import edu.by.epam.ellipse.entity.Point;

public class EllipseAction {

    private static EllipseAction instance;

    public EllipseAction() {
    }

    public static EllipseAction getInstance(){
        if (instance == null){
            instance = new EllipseAction();
        }
        return instance;
    }

    public boolean isCrossOx(Ellipse ellipse) {
        Point startPoint = ellipse.getStartPoint();
        Point endPoint = ellipse.getEndPoint();
        return Double.compare(startPoint.getY(), 0.0) >= 0
                && Double.compare(endPoint.getY(), 0.0) <= 0;
    }

    public boolean isCrossOy(Ellipse ellipse) {
        Point startPoint = ellipse.getStartPoint();
        Point endPoint = ellipse.getEndPoint();
        return Double.compare(startPoint.getX(), 0.0) <= 0
                && Double.compare(endPoint.getX(), 0.0) >= 0;
    }

    public boolean isCircle(Ellipse ellipse) {
        Point startPoint = ellipse.getStartPoint();
        Point endPoint = ellipse.getEndPoint();
        double majorAxis = Math.abs(startPoint.getX() - endPoint.getX());
        double minorAxis = Math.abs(startPoint.getY() - endPoint.getY());
        return majorAxis == minorAxis;
    }

    public double calculateSquare(Ellipse ellipse) {
        Point startPoint = ellipse.getStartPoint();
        Point endPoint = ellipse.getEndPoint();
        double majorAxis = Math.abs(startPoint.getX() - endPoint.getX());
        double minorAxis = Math.abs(startPoint.getY() - endPoint.getY());
        return Math.PI * majorAxis * minorAxis;
    }

    public double calculatePerimeter(Ellipse ellipse) {
        Point startPoint = ellipse.getStartPoint();
        Point endPoint = ellipse.getEndPoint();
        double majorAxis = Math.abs(startPoint.getX() - endPoint.getX());
        double minorAxis = Math.abs(startPoint.getY() - endPoint.getY());
        int i = 2;
        return ((Math.PI * minorAxis * majorAxis) + (Math.pow(minorAxis - majorAxis, i))) * 4 / (majorAxis + minorAxis);
    }

}
