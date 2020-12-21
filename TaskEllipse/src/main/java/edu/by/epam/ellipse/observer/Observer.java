package edu.by.epam.ellipse.observer;

import edu.by.epam.ellipse.entity.Ellipse;

public interface Observer<T extends Ellipse> {
    void performPerimeter(T t);

    void performSquare(T t);

}
