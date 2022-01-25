package Arrays.CodingExersize;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] inputArray = {1,-2,3,4,4,-2};
        int[] inputArray1 = {5,0,-1,0,1,2,-1};
        int arrayLength = inputArray.length-1;

        System.out.println(findMaxSubArraySum(inputArray,arrayLength));
        System.out.println(findMaxSubArraySum(inputArray1,arrayLength));
    }

    private static int findMaxSubArraySum(int[] inputArray, int arrayLength) {
        int maxSubArraySum =0;
        int subArraySum =0;
        for(int k =0;k<arrayLength;k++) {
            subArraySum = subArraySum + inputArray[k];
            if (subArraySum < inputArray[k]) {
                subArraySum = inputArray[k];
            }
            //Math.max to find out previous max value
            maxSubArraySum=Math.max(maxSubArraySum,subArraySum);
        }
        return  maxSubArraySum;
    }
}
