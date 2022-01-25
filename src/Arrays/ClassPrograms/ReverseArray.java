package Arrays.ClassPrograms;

public class ReverseArray {
    //Reverse Array in same Array .. Tested with all combinations
    public static void main(String[] args) {
        int []testA = {10,12,15,19,21,29,32,50};
        System.out.println(reverserArray(testA));
        for(int y : testA){
            System.out.println(y);
        }
    }

    private static int[] reverserArray(int[] testA) {
        int i=0;
        int temp1 =0;
        for(int k = testA.length-1; k>=0;k--){
            if(i==k || i>k){
                break;
            }
            temp1 = testA[k];
            testA[k] = testA[i];
            testA[i]=temp1;
            i++;
        }
        return testA;
    }
}
