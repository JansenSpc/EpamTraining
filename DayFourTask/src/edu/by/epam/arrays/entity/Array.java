package edu.by.epam.arrays.entity;

import java.util.Arrays;

public class Array {
    private int[] array;

    public Array(int[] array){
        this.array = array;
    }

    public Array(int size){
        array = new int[size];
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int size(){
        return array.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array1 = (Array) o;
        return Arrays.equals(array, array1.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Array =");
        sb.append(Arrays.toString(array));
        return sb.toString();
    }
}
