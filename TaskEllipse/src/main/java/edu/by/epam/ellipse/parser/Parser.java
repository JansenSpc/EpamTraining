package edu.by.epam.ellipse.parser;

import edu.by.epam.ellipse.validator.NumberValidator;
import edu.by.epam.ellipse.constant.Strings;
import edu.by.epam.ellipse.exception.ValidatorException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parser {

    public static final Logger logger = LogManager.getLogger(Parser.class);

    public List<List<Double>> parseToDoubleArray(String point) {
        List<String> points = parseToStringArray(point);
        List<Double> doubles = new ArrayList<>();
        List<List<Double>> coordinates = new ArrayList<>();
        NumberValidator numberValidator = new NumberValidator();
        try {
            for (String line : points) {
                if (numberValidator.numberIsValid(line)) {
                    doubles.add(Double.parseDouble(line));
                }
            }
        } catch (ValidatorException e) {
            logger.log(Level.ERROR, e.getMessage());
        }
        coordinates.add(doubles);
        return coordinates;
    }

    public List<String> parseToStringArray(String line) {
        return Arrays.asList(line.split(Strings.LIMITER));
    }
}
