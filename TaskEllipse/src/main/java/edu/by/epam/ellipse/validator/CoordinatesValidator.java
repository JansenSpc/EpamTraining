package edu.by.epam.ellipse.validator;

import edu.by.epam.ellipse.constant.Coordinates;
import edu.by.epam.ellipse.exception.ValidatorException;

import java.util.List;

public class CoordinatesValidator {
    public boolean isRightAmount(List<Double> coordinates) throws ValidatorException {
        if (!(coordinates.size() == Coordinates.COORDINATES_NUMBER)) {
            throw new ValidatorException("Not enough coordinates!");
        }
        return true;
    }
}
