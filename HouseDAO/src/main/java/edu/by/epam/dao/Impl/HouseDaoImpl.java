package edu.by.epam.dao.Impl;

import edu.by.epam.dao.HouseDao;
import edu.by.epam.entity.House;
import edu.by.epam.entity.HouseList;
import edu.by.epam.exception.DaoException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class HouseDaoImpl implements HouseDao {
    private static final Logger logger = LogManager.getLogger(HouseDaoImpl.class);
    private static HouseDaoImpl instance;

    private final HouseList houseList = HouseList.getInstance();

    private HouseDaoImpl(){
    }

    public static HouseDaoImpl getInstance(){
        if (instance == null) {
            instance = new HouseDaoImpl();
        }
        return instance;
    }

    @Override
    public void add(House house) throws DaoException {
       if (houseList.contains(house)) {
           throw new DaoException("This house already exists");
       }
       houseList.add(house);
       logger.info("Added {} in list", house);
    }

    @Override
    public void delete(House house) throws DaoException {
        if(!houseList.contains(house)) {
            throw new DaoException("No such house in list!");
        }
        houseList.remove(house);
        logger.info("Deleted house {} from list", house);
    }


    @Override
    public House update(House house, int id) throws DaoException {
        if (houseList.contains(house)){
            throw new DaoException("List already has that house");
        }
        House houseForUpdate = houseList.get(id);
        houseList.set(id, house);
        logger.info("House {} was replaced by {}", house, houseForUpdate);
        return houseForUpdate;
    }

    @Override
    public List<House> findAll() {
        List<House> houses = new ArrayList<>();
        for (int i = 0; i < houseList.size(); i++) {
            houses.add(houseList.get(i));
        }
        logger.info("All houses are found: {}", houses);
        return houses;
    }

    @Override
    public List<House> findByRooms(int rooms) throws DaoException {
        List<House> houses = new ArrayList<>();
        for (int i = 0; i < houseList.size(); i++) {
            if (houseList.get(i).getRooms() == rooms) {
                houses.add(houseList.get(i));
            }
        }
        logger.info("Houses are sorted by rooms: {}", houses);
        return houses;
    }

    @Override
    public List<House> findByFloor(int floor) throws DaoException {
        List<House> houses = new ArrayList<>();
        for (int i = 0; i < houseList.size(); i++) {
            if (houseList.get(i).getFloor() == floor) {
                houses.add(houseList.get(i));
            }
        }
        logger.info("Houses are sorted by floors: {}", floor);
        return houses;
    }

    @Override
    public List<House> findBySpace(int space) throws DaoException {
        List<House> houses = new ArrayList<>();
        for (int i = 0; i < houseList.size(); i++) {
            if (houseList.get(i).getSpace() == space) {
                houses.add(houseList.get(i));
            }
        }
        logger.info("Houses are sorted by space: {}", space);
        return houses;
    }
}
