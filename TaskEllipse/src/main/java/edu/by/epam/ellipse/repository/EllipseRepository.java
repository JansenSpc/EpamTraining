package edu.by.epam.ellipse.repository;

import edu.by.epam.ellipse.specification.EllipseSpecification;

import java.util.Comparator;
import java.util.List;

public interface EllipseRepository<T> {
     void add(T t);

     void delete(T t);

     T get(int id);

     int size();

     List<T> sort(Comparator<? super T> comparator);

     List<T> query(EllipseSpecification<T> specification);
}
