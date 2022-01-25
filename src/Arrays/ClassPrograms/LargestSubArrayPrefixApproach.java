package Arrays.ClassPrograms;

public class LargestSubArrayPrefixApproach {
    //1. Sum of Each SunArray
    //2. Largest sum of sub array
    //3. O(N.N)
    public static void main(String[] args) {
        int []array = {-2,3,4,-1,5,-12,6,1,3};
        int arrayLength = array.length-1 ;
        System.out.println(largestSubArrayPrefixApproach(array,arrayLength));
    }

    private static int largestSubArrayPrefixApproach(int[] array,int arrayLength) {
        //Prefix Sums
        int[] prefix = new int[arrayLength];
        prefix[0] = array[0];
        for(int i=1;i<arrayLength;i++){
            prefix[i] = prefix[i-1] + array[i];
        }

        //largest sum login
        int largest_sum = 0;

        for(int i=0;i<arrayLength;i++){
            for(int j=i; j<arrayLength; j++){
                int subarraySum = i>0 ? prefix[j] - prefix[i-1] : prefix[j];
                //put a check is subarraySum > largest_sum
                largest_sum = Math.max(largest_sum,subarraySum);

            }
        }
        return largest_sum;
    }
}
