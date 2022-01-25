package Sorting.BubbleSort;

public class TestBubbleSort {
    public static void main(String[] args) {
        int []arr = {5,4,3,2,1};
        int length = arr.length-1;
       int result[] =  executeBubbleSort(arr,length);
       for(int k : result){
           System.out.print(k);
       }
    }

    private static int[] executeBubbleSort(int[] arr,int length) {
        for(int i=0;i< length;i++){
            for(int j=0;j<length;j++){
                if(arr[j] > arr[j+1]){
                    int temp =0;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
