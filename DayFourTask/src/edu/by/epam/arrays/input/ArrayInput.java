package edu.by.epam.arrays.input;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayInput {
    Scanner sc = new Scanner(System.in);
    public int[] consoleInput(){
        System.out.println("Сколько чисел добавить в массив?");
        int length = sc.nextInt();
        int[] p = new int[length];
        for (int i = 0; i < length; i++){
            p[i] = sc.nextInt();
        }
        return p;
    }

    public int[] randomInput(){
        Random rnd = new Random();
        int size = rnd.nextInt(100);
        int[] p = new int[size];
        for (int i = 0; i < size; i++){
            p[i] = rnd.nextInt(100);
        }
        return p;
    }

    public int[] fileInput(){
        ArrayList<Integer> baseArray = new ArrayList<>();
        int size = 0;
        int[] ra = new int[size];
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\DayFourTask\\file\\input.txt"));
            String firstLine = reader.readLine();
            size = Integer.parseInt(firstLine);
            String l = reader.readLine();
            ra = new int[size];
            for (int i = 0; i < size && l != null; i++){
                l = reader.readLine();
                ra[i] = Integer.parseInt(l);
            }
        }catch(FileNotFoundException filenotfoundexception){
            System.out.println("File not found.");
        }catch(IOException ioexception) {
            System.out.println("File input error occurred!");
            ioexception.printStackTrace();
        }
        return ra;
    }
}
