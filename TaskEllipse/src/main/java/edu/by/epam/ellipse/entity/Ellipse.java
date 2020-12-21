package edu.by.epam.ellipse.entity;

import edu.by.epam.ellipse.observer.Observable;
import edu.by.epam.ellipse.observer.Observer;
import edu.by.epam.ellipse.observer.impl.EllipseObserver;
import edu.by.epam.ellipse.util.IdGenerator;

public class Ellipse implements Observable<EllipseObserver> {
    private int id;
    private Point startPoint;
    private Point endPoint;
    private Observer<Ellipse> observer;

    public Ellipse(Point startPoint, Point endPoint) {
        id = IdGenerator.generateId();
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public int getId() {
        return id;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
        notifyObserver();
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
        notifyObserver();
    }

    @Override
    public void attach(EllipseObserver observer) {
        this.observer = observer;
    }

    @Override
    public void detach(EllipseObserver observer) {
        this.observer = null;
    }

    @Override
    public void notifyObserver() {
        if (observer != null) {
            observer.performPerimeter(this);
            observer.performSquare(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ellipse ellipse = (Ellipse) o;

        if (!startPoint.equals(ellipse.startPoint)) return false;
        return endPoint.equals(ellipse.endPoint);
    }

    @Override
    public int hashCode() {
        int result = startPoint.hashCode();
        result = 31 * result + endPoint.hashCode();
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Ellipse { ");
        sb.append(id).append(", ");
        sb.append("Start point: ").append(startPoint).append(", ");
        sb.append("End point: ").append(endPoint).append(" }");
        return sb.toString();
    }
}
