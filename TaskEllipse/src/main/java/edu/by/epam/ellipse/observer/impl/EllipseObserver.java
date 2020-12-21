package edu.by.epam.ellipse.observer.impl;

import edu.by.epam.ellipse.action.EllipseAction;
import edu.by.epam.ellipse.entity.Ellipse;
import edu.by.epam.ellipse.entity.EllipseData;
import edu.by.epam.ellipse.entity.EllipseWarehouse;
import edu.by.epam.ellipse.observer.Observer;

public class EllipseObserver implements Observer<Ellipse> {

    @Override
    public void performPerimeter(Ellipse ellipse) {
        EllipseAction eAct = EllipseAction.getInstance();
        EllipseWarehouse eWar = EllipseWarehouse.getInstance();
        EllipseData eData = new EllipseData();
        int id = ellipse.getId();
        double perimeter = eAct.calculatePerimeter(ellipse);
        eData.setPerimeter(perimeter);
        eWar.put(eData, id);
    }

    @Override
    public void performSquare(Ellipse ellipse) {
        EllipseAction eAct = EllipseAction.getInstance();
        EllipseWarehouse eWar = EllipseWarehouse.getInstance();
        EllipseData eData = new EllipseData();
        int id = ellipse.getId();
        double square = eAct.calculateSquare(ellipse);
        eData.setSquare(square);
        eWar.put(eData, id);
    }
}
