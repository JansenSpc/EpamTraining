package edu.by.epam.ellipse.entity;

public class EllipseData {

    private double square;
    private double perimeter;

    public EllipseData() {

    }

    public EllipseData(double square, double perimeter) {
        this.square = square;
        this.perimeter = perimeter;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EllipseData that = (EllipseData) o;

        if (Double.compare(that.square, square) != 0) return false;
        return Double.compare(that.perimeter, perimeter) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(square);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(perimeter);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Ellipse data { ");
        sb.append("Square=").append(square).append(", ");
        sb.append("Perimeter=").append(perimeter).append(" }");
        return sb.toString();
    }
}
