package Arrays.CodingExersize;

public class LowerBound {

    private static int lowerBound;

    public static void main(String[] args) {
        int[] inputArray = {-1,-1,2,3,5};
        int val =4;
        int[] inputArray1 = {1,2,3,4,6};
        System.out.println(findLowerBound(inputArray,val));
       System.out.println(findLowerBound(inputArray1,val));
    }

    private static int findLowerBound(int[] inputArray, int val) {
        int lowerBound = 0;
        int start =0;
        int end = inputArray.length-1;
        int mid =0;

        while(start <=end){
            mid = (start + end)/2;

            if(val == inputArray[mid]){
                lowerBound = val;
                break;
            }else if (val > inputArray[mid]){
                    lowerBound = inputArray[mid];
                    start = mid+1;
            }else{
                   end = mid -1;
            }
        }
        return lowerBound;

    }
}

