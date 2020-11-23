package tests;

import edu.by.epam.house.service.HouseService;
import edu.by.epam.house.entity.House;
import edu.by.epam.house.entity.HouseList;
import edu.by.epam.house.main.Main;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class HouseServiceTest extends Main {

    ArrayList<House> houses = new ArrayList<>(Arrays.asList(new House(12, 20, 1, 1, "Пушкина", "1", 1),
            new House(23, 30, 6, 2, "Ленина", "2", 2),
            new House(37, 45, 4, 3, "Гоголя", "2", 2),
            new House(91, 40, 9, 2, "Лермонтова", "2", 2),
            new House(22, 25, 4, 1, "Маяковского", "2", 2),
            new House(46, 60, 6, 3, "Есенина", "2", 2),
            new House(84, 35, 2, 2, "2", "2", 2)));

    @BeforeClass
    public void setUp() {
        HouseList houseList = new HouseList(houses);
    }

    @Test
    public void testSortByRooms() {
        ArrayList<House> exp = new ArrayList<>();
        House h = new House(91, 40, 9, 2, "Лермонтова", "2", 2);
        House f = new House(23, 30, 6, 2, "Ленина", "2", 2);
        House j = new House(84, 35, 2, 2, "2", "2", 2);
        exp.add(h);
        exp.add(f);
        exp.add(j);
        HouseList expected = new HouseList(exp);
        HouseList actual = new HouseList(houses);
        Assert.assertEquals(HouseService.sortByRooms(actual, 2),HouseService.sortByRooms(expected,2));
    }

    @Test
    public void testSortByFloors() {
        ArrayList<House> exp = new ArrayList<>();
        House h = new House(37, 45, 4, 3, "Гоголя", "2", 2);
        House f = new House(91, 40, 9, 2, "Лермонтова", "2", 2);
        exp.add(h);
        exp.add(f);
        HouseList expected = new HouseList(exp);
        HouseList actual = new HouseList(houses);
        Assert.assertEquals(HouseService.sortByFloors(actual, 2,6,9),HouseService.sortByFloors(expected,2,6,9));
    }

    @Test
    public void testSortBySquare() {
        ArrayList<House> exp = new ArrayList<>();
        House h = new House(23, 30, 6, 2, "Ленина", "2", 2);
        House f = new House(91, 40, 9, 2, "Лермонтова", "2", 2);
        House j = new House(46, 60, 6, 3, "Есенина", "2", 2);
        exp.add(h);
        exp.add(f);
        exp.add(j);
        HouseList expected = new HouseList(exp);
        HouseList actual = new HouseList(houses);
        Assert.assertEquals(HouseService.sortBySquare(actual, 35),HouseService.sortBySquare(expected,35));
    }
}