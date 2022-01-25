package Characters;

public class FindShortestPath {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        String resultString ="";
        String path = "SNNNEWE";
        for (char c : path.toCharArray()) {
            switch (c) {
                case 'N':
                    y++;
                break;
                case 'S':
                    y--;
                break;
                case 'E':
                    x++;
                break;
                case 'W':
                    x--;
                break;
            }
        }
        System.out.println("X is " +x);
        System.out.println(",And Y is "+y);

        //we need to find the quadrant and position
        if(x >0 && y>0){
            while(y-- >0){
                System.out.print('N');
               // y--;
            }
            while(x-- >0){
                System.out.print('E');
               // x--;
            }
        }
    }
}