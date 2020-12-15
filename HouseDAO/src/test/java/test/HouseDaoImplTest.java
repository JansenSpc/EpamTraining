package test;

import edu.by.epam.dao.HouseDao;
import edu.by.epam.dao.Impl.HouseDaoImpl;
import edu.by.epam.entity.House;
import edu.by.epam.entity.HouseList;
import edu.by.epam.entity.Street;
import edu.by.epam.exception.DaoException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class HouseDaoImplTest {

    HouseDao houseDao = HouseDaoImpl.getInstance();
    HouseList houseList = HouseList.getInstance();

    @BeforeMethod
    public void setUp() {
        houseList.add(new House(13, 56, 4, 3, Street.PUSHKINA));
        houseList.add(new House(38, 90, 9, 5, Street.LENINA));
        houseList.add(new House(2, 30, 2, 2, Street.KOLASA));
        houseList.add(new House(24, 45, 11, 2, Street.ESENINA));
        houseList.add(new House(67, 45, 4, 3, Street.KUPALY));
    }

    @Test
    public void testAdd() throws DaoException {
        House house = new House(2,45,3,3, Street.ESENINA);
        houseDao.add(house);
        List<House> actual = houseDao.findAll();
        List<House> expected = new ArrayList<>();
        House house2 = new House(13, 56, 4, 3, Street.PUSHKINA);
        House house3 = new House(38, 90, 9, 5, Street.LENINA);
        House house4 = new House(2, 30, 2, 2, Street.KOLASA);
        House house5 = new House(24, 45, 11, 2, Street.ESENINA);
        House house6 = new House(67, 45, 4, 3, Street.KUPALY);
        expected.add(house2);
        expected.add(house3);
        expected.add(house4);
        expected.add(house5);
        expected.add(house6);
        expected.add(house);
        assertEquals(actual, expected);
    }

    @Test
    public void testDelete() throws DaoException {
        House house = houseList.get(2);
        houseDao.delete(house);

        int actual = houseList.size();
        int expected = 4;

        assertEquals(actual, expected);
    }

    @Test
    public void testUpdate() throws DaoException {
        House house = houseList.get(0);
        house.setFloor(5);
        houseDao.update(house, 6);
        House house2 = new House(67, 45, 5, 3, Street.KUPALY);
        int actual = house2.getFloor();
        int expected = house.getFloor();
        assertEquals(actual, expected);
    }

    @Test
    public void testFindAll() throws DaoException {
        List<House> actual = houseDao.findAll();
        List<House> expected = new ArrayList<>();
        for (int i = 0; i < houseList.size(); i++){
            expected.add(houseList.get(i));
        }
        assertEquals(actual, expected);
    }

    @Test
    public void testFindByRooms() throws DaoException {
        List<House> actual = houseDao.findByRooms(2);
        List<House> expected = new ArrayList<>();
        expected.add(new House(2, 30, 2, 2, Street.KOLASA));
        expected.add(new House(24, 45, 11, 2, Street.ESENINA));
        assertEquals(actual, expected);
    }

    @Test
    public void testFindByFloor() throws DaoException {
        List<House> actual = houseDao.findByFloor(4);
        List<House> expected = new ArrayList<>();
        expected.add(new House(13, 56, 4, 3, Street.PUSHKINA));
        expected.add(new House(67, 45, 4, 3, Street.KUPALY));
        assertEquals(actual, expected);
    }

    @Test
    public void testFindBySpace() throws DaoException {
        List<House> actual = houseDao.findBySpace(45);
        List<House> expected = new ArrayList<>();
        expected.add(new House(24, 45, 11, 2, Street.ESENINA));
        expected.add(new House(67, 45, 4, 3, Street.KUPALY));
        assertEquals(actual, expected);
    }
}