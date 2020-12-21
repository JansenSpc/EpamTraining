package edu.by.epam.ellipse.reader;

import edu.by.epam.ellipse.exception.EmptyFileException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.EmptyStackException;
import java.util.List;
import java.util.stream.Collectors;

public class InputReader {
    public static final Logger logger = LogManager.getLogger(InputReader.class);

    public List<String> readFromFile(String path) throws EmptyFileException {
        List<String> lines;
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            lines = br.lines().collect(Collectors.toList());
        } catch (IOException e) {
            logger.log(Level.ERROR, e.getMessage());
            throw new EmptyFileException("File is empty!");
        }
        return lines;
    }
}
