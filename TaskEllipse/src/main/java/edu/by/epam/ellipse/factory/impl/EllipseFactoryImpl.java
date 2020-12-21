package edu.by.epam.ellipse.factory.impl;

import edu.by.epam.ellipse.entity.Ellipse;
import edu.by.epam.ellipse.entity.Point;
import edu.by.epam.ellipse.exception.ValidatorException;
import edu.by.epam.ellipse.factory.EllipseFactory;
import edu.by.epam.ellipse.validator.EllipseValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class EllipseFactoryImpl implements EllipseFactory<Ellipse, Point> {
    public static final Logger logger = LogManager.getLogger(EllipseFactoryImpl.class);

    @Override
    public Ellipse createEllipse(List<Point> p) {
        EllipseValidator v = new EllipseValidator();
        if (!(v.ellipseIsValid(p))) {
            logger.error(new ValidatorException("Cannot create ellipse!"));
        }
        Ellipse ellipse = new Ellipse(p.get(0), p.get(1));
        return ellipse;
    }
}
