package edu.by.epam.house.util;

public class idGenerator {
    private static int id = 0;

    public static int generateId(){
        return id++;
    }
}
