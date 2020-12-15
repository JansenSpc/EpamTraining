package edu.by.epam.entity;

public class House {
    private int number;
    private int space;
    private int floor;
    private int rooms;
    private Street street;

    public House(int number, int space, int floor, int rooms, Street street) {
        this.number = number;
        this.space = space;
        this.floor = floor;
        this.rooms = rooms;
        this.street = street;
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

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        House house = (House) o;

        if (number != house.number) return false;
        if (space != house.space) return false;
        if (floor != house.floor) return false;
        if (rooms != house.rooms) return false;
        return street == house.street;
    }

    @Override
    public int hashCode() {
        int result =  number;
        result = 31 * result + space;
        result = 31 * result + floor;
        result = 31 * result + rooms;
        result = 31 * result + (street != null ? street.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Квартира ");
        sb.append(", Number: ").append(number);
        sb.append(", Space: ").append(space);
        sb.append(", Floor: ").append(floor);
        sb.append(", Rooms: ").append(rooms);
        sb.append(", Street: ").append(street);
        return sb.toString();
    }
}
