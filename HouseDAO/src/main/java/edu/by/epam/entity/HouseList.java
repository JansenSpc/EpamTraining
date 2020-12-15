package edu.by.epam.entity;

import java.util.ArrayList;
import java.util.List;

public class HouseList {

    private static HouseList instance;

    private final List<House> houseList = new ArrayList<>();

    private HouseList() {
    }

    public static HouseList getInstance() {
        if (instance == null){
            instance = new HouseList();
        }
        return instance;
    }

    public void add(House house) {
        houseList.add(house);
    }

    public void set(int index, House house) {
        houseList.set(index, house);
    }

    public House get(int index) {
        return houseList.get(index);
    }

    public int indexOf(House house) {
        return houseList.indexOf(house);
    }

    public int size() {
        return houseList.size();
    }

    public void remove(House house){
        houseList.remove(house);
    }

    public void remove(int index){
        houseList.remove(index);
    }

    public boolean contains(House house){
        return  houseList.contains(house);
    }

    public void clear(){
        houseList.clear();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(houseList);
        return sb.toString();
    }
}
