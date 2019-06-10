package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListUtility {
List <Integer> list =new ArrayList<Integer>();

    public Boolean add(int i) {
   list.add(i);
   if(list.contains(i))
        return true;
   else
       return false;
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
    Set<Integer> hset=new HashSet<Integer>();
    for(Integer x:list)
        hset.add(x);
    int n=hset.size();
    List<Integer> alist=new ArrayList<Integer>(n);
    for (Integer x:hset)
        alist.add(x);
        return alist;
    }

    public String join() {
String delimiter=", ";
        String result=""+list.get(0);
for(int x=1;x<list.size();x++)
       result =result+", "+list.get(x);
        return result;
    }

    public Integer mostCommon() {
        int count=0;
        int max=0;
        int k=0;
        int i=0;
        while(i<list.size()-1){
            for(int j=i+1;j<list.size();j++){
                count=0;
                if(list.get(i)==list.get(j))
                    count++;}
            i++;
            if(count>max)
                max=count;
            k=list.get(i-1);
        }
        return k;

    }

    public Boolean contains(Integer valueToAdd) {
        if(list.contains(valueToAdd))

        return true;
        else if(valueToAdd==null)
            return true;
        else
            return false;

    }
}
