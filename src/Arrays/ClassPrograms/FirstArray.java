package Arrays.ClassPrograms;

import java.util.Arrays;

public class FirstArray {

    public static void main(String[] args) {
        int k =8;
        System.out.println("Enter marks of students"+ k);
        int []inputA = new int[k];
        for(int i=0;i<k;i++){
            inputA[i] = inputA[i]*2;
        }
        System.out.println("Hmm "+inputA);
        //int []marksArray = {12,56,78,90,12};
        for(int i : inputA){
            System.out.println("Marks are "+i);
        }
    }
}
