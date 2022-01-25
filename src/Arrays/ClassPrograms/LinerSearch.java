package Arrays.ClassPrograms;

import java.util.Arrays;

public class LinerSearch {

    public static void main(String[] args) {
        //Find 9
        int []testA = {1,2,0,3,6,9,10};
        int key =19;
        linearSearch(testA,key);

    }

    private static void linearSearch(int[] testA,int key) {
        for(int i = 0; i< testA.length; i++){
            if(testA[i] == key){
                System.out.println("Yes and location is " +i);
            }
        }
    }
}
