package Characters;

public class FindDigitsAndSpaces {
    private static char c1;


    public static void main(String[] args) {
        int spaceCount =0;
        int digitCount =0;
        int alphaCount =0;
        String data = "Hello How 5 are 6 you";
        for(char c1 : data.toCharArray()){
                if(c1 == ' '){
                    spaceCount = spaceCount + 1;
                }
                if(Character.isDigit(c1)){
                    digitCount = digitCount +1;
                }
            if(Character.isAlphabetic(c1)){
                alphaCount = alphaCount +1;
            }
        }
        System.out.println("Digit count =>" +digitCount);
        System.out.println("Space count =>" +spaceCount);
        System.out.println("alpha count =>" +alphaCount);
    }
}
