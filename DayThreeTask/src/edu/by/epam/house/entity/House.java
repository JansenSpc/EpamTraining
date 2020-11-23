package edu.by.epam.house.entity;

import edu.by.epam.house.util.idGenerator;

public class House {
    private int id;
    private int number;
    private int space;
    private int floor;
    private int rooms;
    private String street;
    private String type;
    private int length;

    public House(int number, int space, int floor, int rooms, String street, String type, int length) {
        this.id = idGenerator.generateId();
        this.number = number;
        this.space = space;
        this.floor = floor;
        this.rooms = rooms;
        this.street = street;
        this.type = type;
        this.length = length;
    }

    public int getId(){
        return id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Квартира ");
        sb.append("ID=").append(id);
        sb.append(", Номер дома: ").append(number);
        sb.append(", Площадь(м²): ").append(space);
        sb.append(", Этаж: ").append(floor);
        sb.append(", Кол-во комнат: ").append(rooms);
        sb.append(", Улица: ").append(street);
        sb.append(", Тип здания: ").append(type);
        sb.append(", Срок эксплуатации: ").append(length);
        return sb.toString();
    }
}
