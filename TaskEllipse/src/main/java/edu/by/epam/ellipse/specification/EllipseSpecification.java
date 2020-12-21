package edu.by.epam.ellipse.specification;

import edu.by.epam.ellipse.entity.Ellipse;

public interface EllipseSpecification<T> {
    boolean specify(T t);
}
