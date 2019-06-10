package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        if(array.length%2==0)
        return true;
        else
            return false;
    }

    public Integer[] range(int start, int stop) {
        int length = stop - start+1;
        int j = 0;
        Integer[] array = new Integer[length];
        for (int i = start; i <= stop; i++){
            array[j] = i;
        j++;
    }
        return array;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        int sum=array[0]+array[1];
        return sum;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        int product=array[array.length-1]*array[array.length-2];
        return product;
    }
}
