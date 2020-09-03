package com.philiphamilton.algorithms.sort.selection;

import com.philiphamilton.algorithms.sort.Sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort<T extends Comparable <T>> implements Sort {
    private T[] data;

    public SelectionSort(T[] data){
        this.data = data;
    }

    @Override
    public void sort() {
        boolean sorted = false;
        int startingIdx = 0;
        int smallestIdx = 0;
        while(!sorted && startingIdx < data.length){
            T smallest = data[startingIdx];
            //System.out.println(String.format("Starting at index: %d", startingIdx));
            //System.out.println("For array: " + Arrays.toString(data));
            for(int i = startingIdx; i < data.length; i++){
                //System.out.println(String.format("For index: %d and data: %d", i, data[i]));
                if(smallest.compareTo(data[i]) > 0){
                    smallest = data[i];
                    smallestIdx = i;
                }
            }
            data[smallestIdx] = data[startingIdx];
            data[startingIdx] = smallest;

            if(startingIdx == data.length){
                sorted = true;
            }
            startingIdx++;
            smallestIdx = startingIdx;
        }
    }

    @Override
    public String toString(){
        return Arrays.toString(data);
    }
}
