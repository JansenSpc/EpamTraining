package edu.by.epam.house.main;

import edu.by.epam.house.service.HouseService;
import edu.by.epam.house.entity.House;
import edu.by.epam.house.entity.HouseList;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<House> houses = new ArrayList<>(Arrays.asList(new House(12, 20, 1, 1, "Пушкина", "1", 1),
                                                                new House(23, 30, 6, 2, "Ленина", "2", 2),
                                                                new House(37, 45, 4, 3, "Гоголя", "2", 2),
                                                                new House(91, 40, 9, 2, "Лермонтова", "2", 2),
                                                                new House(22, 25, 4, 1, "Маяковского", "2", 2),
                                                                new House(46, 60, 6, 3, "Есенина", "2", 2),
                                                                new House(84, 35, 2, 2, "2", "2", 2)));
        HouseList houseList = new HouseList(houses);
        String s = houseList.toString();
        System.out.println(s);;
        HouseService.sortByRooms(houseList, 2);
        HouseService.sortByFloors(houseList,1,1,3);
        HouseService.sortBySquare(houseList,30);
    }
}
