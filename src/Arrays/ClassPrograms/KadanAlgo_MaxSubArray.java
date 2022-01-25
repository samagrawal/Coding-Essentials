package Arrays.ClassPrograms;

public class KadanAlgo_MaxSubArray {
    //TC O(n) & Space Complexity O(1)
    public static void main(String[] args) {
        int []array = {-2,-3,4,-1,-2,1,5,-3};
        int arrayLength = array.length-1 ;
        System.out.println(algoKadans(array,arrayLength));
    }

    private static int algoKadans(int[] array, int arrayLength) {
        int sum =0;
        int maxSum =0;
        for(int i=0;i<arrayLength;i++){
            sum = sum + array[i];
            //For Negative Values handling ...
            if(sum<array[i])//sum<0
                sum=array[i];//sum=0;

            maxSum=Math.max(maxSum,sum);
           /* if(maxSum < sum) {
                maxSum = sum;
            }*/
        }
        return maxSum;
    }
}
