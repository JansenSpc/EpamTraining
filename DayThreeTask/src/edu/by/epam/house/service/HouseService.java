package edu.by.epam.house.service;

import edu.by.epam.house.entity.House;
import edu.by.epam.house.entity.HouseList;

import java.util.ArrayList;

public class HouseService {
    public static int sortByRooms(HouseList houses, int r){
        ArrayList<House> houseList = houses.getHouseList();
        System.out.println("Список домов с " + r + " комнатами");
        int i = 0;
        for (House house : houseList){
            if (house.getRooms() == r) {
                i++;
                String s = house.toString();
                System.out.println(s);
            }
        }
        return i;
    }
    public static int sortByFloors(HouseList houses, int r, int n, int m){
        ArrayList<House> houseList = houses.getHouseList();
        System.out.println("Список домов с " + r + " комнатами и на этаже от " + n + " до " + m);
        int i = 0;
        for (House house : houseList){
            if (house.getRooms() == r && n <= house.getFloor() && m >= house.getFloor()) {
                i++;
                String s = house.toString();
                System.out.println(s);
            }
        }
        return i;
    }
    public static int sortBySquare(HouseList houses, int sq){
        ArrayList<House> houseList = houses.getHouseList();
        System.out.println("Список домов с площадью превосходящей " + sq);
        int i = 0;
        for (House house : houseList){
            if (house.getSpace() > sq) {
                i++;
                String s = house.toString();
                System.out.println(s);
            }
        }
        return i;
    }
}
