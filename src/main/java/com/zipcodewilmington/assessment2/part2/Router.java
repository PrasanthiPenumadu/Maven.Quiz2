package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Map;

public class Router {
    Map<Integer,String > hmap=new HashMap<Integer, String>();
    public void add(String path, String controller) {
        hmap.put(0,path);
        hmap.put(0,controller);

    }

    public Integer size() {
        return hmap.size();
    }

    public String getController(String path) {

        return null;
    }

    public void update(String path, String studentController) {
    }

    public void remove(String path) {
    }
}
