package Arrays.CodingExersize;

public class KRotate {
    public static void main(String[] args) {
        int k =2;
        int[] inputArray = {1,3,5,7,9};
        System.out.println(rotatedArray(inputArray,k));
    }

    private static int[] rotatedArray(int[] inputArray, int k) {
        inputArray[0] = inputArray[inputArray.length-1];
        for(int i=0;i<k;i++){
            for(int j=i+1;j<inputArray.length-1;j++){
                   // temp = inputArray[j];
                   // inputArray[i] =
            }
        }
        return new int[5];
    }
}
