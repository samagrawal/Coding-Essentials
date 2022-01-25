package Arrays.ClassPrograms;

public class LargestSubArraySum {
    //1. Sum of Each SunArray
    //2. Largest sum of sub array
    public static void main(String[] args) {
        int []array = {-2,3,4,-1,5,-12,6,1,3};
        int arrayLength = array.length -1 ;
        System.out.println(largestSubArraySum(array,arrayLength));
    }

    private static int largestSubArraySum(int[] array,int arrayLength) {
        int largestSum=0;
         for(int i =0;i<arrayLength;i++){
            for(int j=i;j<arrayLength;j++){
                int sum =0;
                 for(int k=i ;k<=j;k++) {
                     sum = sum + array[k];
                 }
                //put a check is subarraySum > largest_sum
                largestSum = Math.max(largestSum,sum);
            }
       }
         return largestSum;
    }
}
