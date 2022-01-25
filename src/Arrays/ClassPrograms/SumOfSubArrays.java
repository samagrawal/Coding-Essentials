package Arrays.ClassPrograms;

public class SumOfSubArrays {
    public static void main(String[] args) {
        int []array = {10,20,30,40};
        int arrayLength = array.length -1 ;
        System.out.println(printSumOfSubArrays(array,arrayLength));
    }

    private static int printSumOfSubArrays(int[] array,int arrayLength) {
        int sumOfSubArrays =0;
         for(int i =0;i<arrayLength;i++){
            for(int j=i;j<arrayLength;j++){
                 for(int k=i ;k<=j;k++) {
                     sumOfSubArrays = sumOfSubArrays + array[k];
                 }
            }
       }return sumOfSubArrays;
    }
}
