package Arrays.ClassPrograms;

public class BinarySearch {

    public static void main(String[] args) {
        //Find 19
        int []testA = {10,12,15,19,21,29,32};
        int key  = 32;
        int mid = (testA.length-1)/2;
        binarySearch(testA,key,mid);
    }

    private static int binarySearch(int[] testA, int key ,int mid) {
        int start = 0;
        int end = testA.length-1;

        while(start <= end) {
            mid = (start + end)/2;
            if (testA[mid] == key) {
                System.out.println("Yes and location is " + mid);
                return mid;
            }else if (testA[mid] < key) {
                start = mid+1;
            }else if(testA[mid] > key){
                end = mid-1;
            }
        }
        return -1;
    }
}
