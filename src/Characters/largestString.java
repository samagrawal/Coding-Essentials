package Characters;

import java.util.ArrayList;
import java.util.List;

public class largestString {
    public static void main(String[] args) {
        List<String> testData = new ArrayList<>();

        testData.add("Hello");
        testData.add("HelloBrother");
        testData.add("HelloHm");
        int stringLength = 0;
        int result =0;
        for(String input : testData){
            stringLength = input.length();
            if(result < stringLength){
                result = stringLength;
            }
        }
        System.out.println("Largest String lenght is =>"+result);
    }
}
