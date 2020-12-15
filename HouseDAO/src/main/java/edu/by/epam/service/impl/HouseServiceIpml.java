package edu.by.epam.service.impl;

import edu.by.epam.dao.HouseDao;
import edu.by.epam.dao.Impl.HouseDaoImpl;
import edu.by.epam.entity.House;
import edu.by.epam.exception.DaoException;
import edu.by.epam.service.HouseService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class HouseServiceIpml implements HouseService {
    public static final Logger logger = LogManager.getLogger(HouseServiceIpml.class);
    private static HouseServiceIpml instance;

    private final HouseDao houseDao = HouseDaoImpl.getInstance();

    @Override
    public boolean add(House house) {
        boolean r = false;
        try {
            houseDao.add(house);
            r = true;
            logger.info("Added {} in list", house);
        } catch (DaoException e) {
            logger.error(e);
        }
        return r;
    }

    @Override
    public boolean delete(House house) {
        boolean r = false;
        try {
            houseDao.delete(house);
            r = true;
            logger.info("Deleted {} from list", house);
        } catch (DaoException e) {
            logger.error(e);
        }
        return r;
    }

    @Override
    public House update(House house, int id) throws DaoException {
        House houseForUpdate = house;
        try {
            houseForUpdate = houseDao.update(house, id);
            logger.info("Updated {} with {}", house, houseForUpdate);
        } catch (DaoException e) {
            logger.error(e);
        }
        return houseForUpdate;
    }

    @Override
    public List<House> findAll() throws DaoException {
        List<House> houses = houseDao.findAll();
            if (houses.isEmpty()) {
                throw new DaoException("List is empty");
            }
        logger.info("All houses are {}", houses);
        return houses;
    }

    @Override
    public List<House> findByRooms(int rooms) {
        List<House> housesByRooms = new ArrayList<>();
        try {
            housesByRooms = houseDao.findByRooms(rooms);
            logger.info("Found {} houses with floor matching {}", housesByRooms.size(), rooms);
        } catch (DaoException e) {
            logger.error(e);
        }
        return housesByRooms;
    }

    @Override
    public List<House> findByFloor(int floor) {
        List<House> housesByFloor = new ArrayList<>();
        try {
            housesByFloor = houseDao.findByRooms(floor);
            logger.info("Found {} houses with floor matching {}", housesByFloor.size(), floor);
        } catch (DaoException e) {
            logger.error(e);
        }
        return housesByFloor;
    }

    @Override
    public List<House> findBySpace(int space) {
        List<House> housesBySpace = new ArrayList<>();
        try {
            housesBySpace = houseDao.findByRooms(space);
            logger.info("Found {} houses with space matching {}", housesBySpace.size(), space);
        } catch (DaoException e) {
            logger.error(e);
        }
        return housesBySpace;
    }
}
