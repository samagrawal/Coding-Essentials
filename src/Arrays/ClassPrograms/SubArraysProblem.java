package Arrays.ClassPrograms;

public class SubArraysProblem {
    public static void main(String[] args) {
        int []array = {10,20,30,40};
        int arrayLength = array.length;
        printSubArrays(array,arrayLength);
    }

    private static void printSubArrays(int[] array,int arrayLength) {
         for(int i =0;i<arrayLength;i++){
            for(int j=i;j<arrayLength;j++){
                 for(int k=i ;k<=j;k++) {
                     System.out.println("Arrays are " + array[k]);
                 }
                System.out.println("----------------");
            }
       }
    }
}
