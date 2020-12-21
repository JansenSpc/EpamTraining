package edu.by.epam.ellipse.validator;

import edu.by.epam.ellipse.constant.Strings;
import edu.by.epam.ellipse.exception.ValidatorException;
import edu.by.epam.ellipse.validator.EllipseValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Pattern;

public class NumberValidator {
    public static final Logger logger = LogManager.getLogger(EllipseValidator.class);

    public boolean numberIsValid(String line) throws ValidatorException {
        if (!Pattern.matches(Strings.REGEX_DOUBLE, line)) {
            throw new ValidatorException("Invalid line: " + line);
        }
        return true;
    }
}
