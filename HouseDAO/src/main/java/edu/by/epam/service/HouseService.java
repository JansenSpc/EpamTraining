package edu.by.epam.service;

import edu.by.epam.entity.House;
import edu.by.epam.exception.DaoException;

import java.util.List;

public interface HouseService {
    boolean add(House house);

    boolean delete(House house);

    House update(House house, int id) throws DaoException;

    List<House> findAll() throws DaoException;

    List<House> findByRooms(int rooms) throws DaoException;

    List<House> findByFloor(int floor) throws DaoException;

    List<House> findBySpace(int space) throws DaoException;

}
