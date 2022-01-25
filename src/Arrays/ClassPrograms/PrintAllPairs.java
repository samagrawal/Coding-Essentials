package Arrays.ClassPrograms;

public class PrintAllPairs {
    public static void main(String[] args) {
        int []array = {10,20,30,40,50,60};
        int arrayLength = array.length;
        printAllPairs(array,arrayLength);
    }

    private static void printAllPairs(int[] array,int arrayLength) {
       // int []arr={};
        for(int i =0;i<arrayLength;i++){
            for(int j=i+1;j<arrayLength;j++){
                System.out.println("Arrays are " +array[i]+","+array[j]);
            }
            System.out.println("----------------");
       }
    }
}
