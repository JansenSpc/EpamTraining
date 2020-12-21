package edu.by.epam.ellipse.validator;

import edu.by.epam.ellipse.entity.Point;
import edu.by.epam.ellipse.exception.ValidatorException;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.List;

public class EllipseValidator {
    public static final Logger logger = LogManager.getLogger(EllipseValidator.class);

    public boolean ellipseIsValid(List<Point> p) {
        boolean result = isEllipse(p) && notCrossX(p) && notCrossY(p);
        if (!result) {
            logger.error(new ValidatorException("Invalid data!"));
        }
        return result;
    }

    public boolean isEllipse(List<Point> p) {
        double majorAxis = p.get(0).getX() - p.get(1).getX();
        double minorAxis = p.get(0).getY() - p.get(1).getY();

        return majorAxis != minorAxis;
    }

    public boolean notCrossX(List<Point> p) {
        Point x = p.get(0);
        Point x1 = p.get(1);
        boolean result = x.getX() != x1.getX();
        return result;
    }

    public boolean notCrossY(List<Point> p) {
        Point y = p.get(0);
        Point y1 = p.get(1);
        boolean result = y.getY() != y1.getY();
        return result;
    }
}
