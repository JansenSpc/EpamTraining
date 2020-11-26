package edu.by.epam.arrays.service;

import edu.by.epam.arrays.entity.Array;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArraySort {
    private static final Logger logger = LogManager.getLogger(ArraySort.class);

    public void selectSort(Array array){
        int[] ss = array.getArray();
        int size = array.size();
        int j = 0;
        int t = 0;
        for (int i = 0 ; i<size ; i++){
            j=i;
            for (int k = i; k<size; k++){
                if (ss[j] > ss[k]) {
                    j=k;
                }
            }
            t = ss[i];
            ss[i] = ss[j];
            ss[j] = t;
        }
        array.setArray(ss);
        logger.info("Sort array with selection sort");
    }

    public void bubbleSort(Array array){
        int[] bs = array.getArray();
        int size = array.size();
        int t = 0;
        for (int i = 0; i < size; i++){
            for (int j = size - 1; j >=i+1; j--){
                if(bs[j]<bs[j-1]){
                    t = bs[j];
                    bs[j] = bs[j-1];
                    bs[j-1] = t;
                }
            }
        }
        array.setArray(bs);
        logger.info("Sort array by bubble sort");
    }
    public void insertionSort(Array array){
        int is[] = array.getArray();
        int size = array.size();
        int k = 0;
        int i = 0;
        for (int j = 1; j < size; j++){
            k = is[j];
            i = j - 1;
            while (i >= 0 && is[i] > k){
                is[i+1] = is[i];
                i = i - 1;
                is[i+1] = k;
            }
        }
        array.setArray(is);
        logger.info("Sort array by insertion sort");
    }
}
