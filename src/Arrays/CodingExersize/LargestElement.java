package Arrays.CodingExersize;

public class LargestElement {
    public static void main(String[] args) {
        int[] inputArray = {-3,4,1,2,3};
        int[] inputArray1 = {-1,-2,-3-3,8};
        int arrayLength = inputArray.length-1;

        System.out.println(findLargestElement(inputArray,arrayLength));
        System.out.println(findLargestElement(inputArray1,arrayLength));
    }

    private static int findLargestElement(int[] inputArray, int arrayLength) {
        int largestElement = 0;

        for(int k=0;k<arrayLength;k++){
            if(inputArray[k] > largestElement){
                largestElement = inputArray[k];
            }
        }
        return largestElement;
    }
}
