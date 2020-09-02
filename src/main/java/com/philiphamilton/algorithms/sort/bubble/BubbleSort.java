package com.philiphamilton.algorithms.sort.bubble;

import com.philiphamilton.algorithms.sort.Sort;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort<T extends Comparable <T>> implements Sort {
    T[] data;

    public BubbleSort(T[] data){
        this.data = data;
    }

    @Override
    public void sort() {
        boolean sorted = false;
        while(!sorted){
            int changes = 0;
            for(int i = 0; i < data.length-1; i++){
                if((data[i].compareTo(data[i+1])) > 0){
                    T tempData = data[i];
                    data[i] = data[i+1];
                    data[i+1] = tempData;
                    changes++;
                }
            }
            if(changes == 0){
                sorted = true;
            }
        }
    }

    @Override
    public String toString(){
        return Arrays.toString(data);
    }
}
