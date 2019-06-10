package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        int length=array1.length+array2.length;
        int j=0;
        Integer [] array=new Integer[length];
        for(int i=0;i<array1.length;i++)
        {array[i]=array1[i];}
        for(int i=array1.length;i<array.length;i++)
        {array[i]=array2[j];
        j++;}
        return array;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer [] arrayRotate=new Integer[array.length];
        int j=0;
        for(int i=index;i<array.length;i++) {
            arrayRotate[j] = array[i];
            j++;
        }for(int i=0;i<index;i++){
           // j=j+index;
            arrayRotate[j]=array[i];
            j++;
        }
        return arrayRotate;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int count=0;
        for(int i=0;i<array1.length;i++){
            if(array1[i]==valueToEvaluate)
                count++;
        }for(int i=0;i<array2.length;i++)
        {
            if(array2[i]==valueToEvaluate)
                count++;
        }
        return count;
    }

    public Integer mostCommon(Integer[] array) {
        int count=0;
        int max=0;
        int k=0;
        for(int i=0;i<array.length;i++){
          for(int j=i+1;j<array.length;j++){
              count=0;
              if(array[i]==array[j])
                  count++;}
          if(count>max)
              max=count;
          k=array[i];
          }
        return k;
    }
}
