package edu.by.epam.ellipse.factory;


import edu.by.epam.ellipse.entity.Point;

import java.util.List;

public interface EllipseFactory<T, t> {
    public T createEllipse(List<t> points);
}
