package Sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingWithComparator {
    //O(Number of elements + Range)
    public static void main(String[] args) {
        ArrayList<Integer> testList = new ArrayList<Integer>();
        testList.add(89);
        testList.add(10);
        boolean flag = true;
        sortingTech(testList,flag);
    }

    private static void sortingTech(ArrayList<Integer> testList, boolean flag) {
        if(flag == true){
            Collections.sort(testList);
        }else{
            Collections.sort(testList,Collections.reverseOrder());
        }
    }
}
