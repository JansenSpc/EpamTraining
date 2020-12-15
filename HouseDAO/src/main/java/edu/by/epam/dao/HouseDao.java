package edu.by.epam.dao;

import edu.by.epam.entity.House;
import edu.by.epam.exception.DaoException;

import java.util.List;

public interface HouseDao {
    void add(House house) throws DaoException;

    void delete(House house) throws DaoException;

    House update(House house, int id) throws DaoException;

    List<House> findAll();

    List<House> findByRooms(int rooms) throws DaoException;

    List<House> findByFloor(int floor) throws DaoException;

    List<House> findBySpace(int space) throws DaoException;

}
