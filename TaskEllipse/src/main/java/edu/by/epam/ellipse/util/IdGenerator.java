package edu.by.epam.ellipse.util;

public class IdGenerator {
    private static int id;

    public static int generateId(){
        return id++;
    }
}
