package co.edu.uptc.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Model {
    Set<Integer[]> powerSet;
    Set<Integer> set;

    public Model() {
        powerSet = new HashSet<Integer[]>();
        set = new HashSet<Integer>();
    }

    public void addSet(Integer i) {
        set.add(i);
    }

    public void generatePowerSet() {
        ArrayList<Integer> list = new ArrayList<>(set);
        int size = list.size();

        int powerSetSize = (int) Math.pow(2, size);

        for (int counter = 0; counter < powerSetSize; counter++) {
            ArrayList<Integer> subset = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                if ((counter & (1 << j)) > 0) {
                    subset.add(list.get(j));
                }
            }
            powerSet.add(subset.toArray(new Integer[0]));
        }
    }

    public void add(Integer[] arr) {
        powerSet.add(arr);
    }

    public String showAllValues() {
        String values = "";
        for (Integer[] arr : powerSet) {
            values += "{";
            for (Integer i : arr) {
                values += i + " ";
            }
            values += "}\n";
        }
        return values;
    }
}
