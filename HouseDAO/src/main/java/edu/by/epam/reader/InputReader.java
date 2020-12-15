package edu.by.epam.reader;

import edu.by.epam.entity.House;
import edu.by.epam.entity.Street;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InputReader {
    private static final Logger logger = LogManager.getLogger(InputReader.class);
    private static final String DEFAULT_FILE_NAME = "data/file.txt";
    private static final String SEPARATOR = " *, *";

    public List<House> readHouses() {
        List<House> houses = readHouses(DEFAULT_FILE_NAME);
        return houses;
    }

    public List<House> readHouses(String fileName) {
        List<String> fileContent = readFileContent(fileName);
        List<House> houses = new ArrayList<>();
        for (String houseString : fileContent) {
            House house = createHouse(houseString.trim());
            logger.info("Read {} from the file", house);
            houses.add(house);
        }
        return houses;
    }

    private House createHouse(String houseString){
        String[] houseFields = houseString.split(SEPARATOR);
        int number = Integer.parseInt(houseFields[0]);
        int space = Integer.parseInt(houseFields[1]);
        int floor = Integer.parseInt(houseFields[2]);
        int rooms = Integer.parseInt(houseFields[3]);
        Street street = Street.valueOf(houseFields[4]);
        House house = new House(number, space, floor, rooms, street);
        return house;
    }

    private List<String> readFileContent(String fileName){
        File file = new File(fileName);
        List<String> content = new ArrayList<>();
        try (FileReader fileReader = new FileReader(file)){
            BufferedReader br = new BufferedReader(fileReader);
            String line;
            while ((line = br.readLine()) != null) {
                content.add(line);
            }
        } catch (FileNotFoundException | IIOException e) {
            logger.error(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}
