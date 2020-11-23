package edu.by.epam.house.entity;

import java.util.ArrayList;
import java.util.List;

public class HouseList {
    private static ArrayList<House> houseList;

    public void add(House newHouse){
        if (newHouse == null){
            throw new NullPointerException();
        }
        this.houseList.add(newHouse);
    }

    public HouseList() {
        this.houseList = new ArrayList<>();
    }

    public HouseList(ArrayList<House> houseList){
        this.houseList = new ArrayList<>();
        for (House house : houseList){
            add(house);
        }
    }

    public static void addHouse(House house){
        houseList.add(house);
    }

    public static int showHouses(){
        return houseList.size();
    }

    public ArrayList<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(ArrayList<House> houseList){
        this.houseList = houseList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(houseList);
        return sb.toString();
    }
}
