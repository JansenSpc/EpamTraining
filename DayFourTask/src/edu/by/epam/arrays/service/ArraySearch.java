package edu.by.epam.arrays.service;

import edu.by.epam.arrays.entity.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class ArraySearch {
    private static final Logger logger = LogManager.getLogger(ArraySearch.class);

    public int search(Array array, int i) {
        Arrays.sort(array.getArray());
        int result = Arrays.binarySearch(array.getArray(), i);
        logger.info("Result of search is " + result);
        return result;
    }

    public int findMax(Array array){
        int[] a = array.getArray();
        int s = array.size();
        ArraySort bs = new ArraySort();
        bs.bubbleSort(array);
        int max = a[s-1];
        logger.info("The maximal number is " + max);
        return max;
    }

    public int findMin(Array array){
        int[] a = array.getArray();
        ArraySort bs = new ArraySort();
        bs.bubbleSort(array);
        int min = a[0];
        logger.info("The minimal number is " + min);
        return min;
    }

    public static boolean isPrime(final int num){
        return IntStream.rangeClosed(2,num/2).noneMatch(i -> num % i == 0);
    }

    public ArrayList<Integer> findPrime(Array array){
        int [] a = array.getArray();
        ArrayList<Integer> p = new ArrayList<>();
        for (int i : a){
            if (isPrime(i) && i>1) {
                p.add(i);
            }
        }
        logger.info("Prime numbers are: " + p);
        return p;
    }

    public ArrayList<Integer> findThreeDigit(Array array){
        ArrayList<Integer> rn = new ArrayList<>();
        int[] a = array.getArray();
        for (int i = 0; i < array.size(); i++) {
            int cn = a[i];
            if (cn > 99 && cn< 1000) {
                int u = cn % 10;
                int d = (cn / 10) % 10;
                int h = (cn/ 100) % 10;
                if (u != d && d != h && h != u) {
                    rn.add(cn);
                }
            }
        }
        logger.info("Three digit numbers are: " + rn);
        return rn;
    }

    private boolean isFibonacci(int number) {
        boolean isFibonacci = false;
        double calc1 = Math.sqrt(5 * (number * number) - 4);
        double calc2 = Math.sqrt(5 * (number * number) + 4);

        if (calc1 % 1 == 0 || calc2 % 1 == 0) {
            isFibonacci = true;
        }
        return isFibonacci;
    }

    public ArrayList<Integer> findFibonacci(Array array) {
        ArrayList<Integer> fa = new ArrayList<>();
        int[] a = array.getArray();
        for (int i = 0; i < array.size(); i++) {
            int cn = a[i];
            if (isFibonacci(cn)) {
                fa.add(cn);
            }
        }
        logger.info("Fibonacci numbers are: " + fa);
        return fa;
    }
}
