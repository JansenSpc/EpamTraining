package edu.by.epam.ellipse.repository.impl;

import edu.by.epam.ellipse.entity.Ellipse;
import edu.by.epam.ellipse.repository.EllipseRepository;
import edu.by.epam.ellipse.specification.EllipseSpecification;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EllipseRepositoryImpl implements EllipseRepository<Ellipse> {
    private static EllipseRepositoryImpl instance;
    private List<Ellipse> ellipses;

    public EllipseRepositoryImpl() {
        this.ellipses = new ArrayList<>();
    }

    public static EllipseRepositoryImpl getInstance() {
        if (instance == null) {
            instance = new EllipseRepositoryImpl();
        }
        return instance;
    }

    @Override
    public void add(Ellipse ellipse) {
        ellipses.add(ellipse);
    }

    @Override
    public void delete(Ellipse ellipse) {
        ellipses.remove(ellipse);
    }

    @Override
    public Ellipse get(int id) {
        return ellipses.get(id);
    }

    @Override
    public int size() {
        return ellipses.size();
    }

    @Override
    public List<Ellipse> sort(Comparator<? super Ellipse> comparator) {
        List<Ellipse> sortedList = ellipses;
        sortedList.sort(comparator);
        return sortedList;
    }

    @Override
    public List<Ellipse> query(EllipseSpecification<Ellipse> specification) {
        List<Ellipse> resultList = ellipses.stream().filter(o -> specification.specify(o)).collect(Collectors.toList());
        return resultList;
    }
}
