package patterns;

public class Pattern_08 {
    public static void main(String[] args) {
        int n = 5;
        int steps = 2;
        for(int row = 1;row<=n;row++){
            for(int col = 1;col<=n;col++){
                System.out.print(steps + " ");
                steps+=2;
            }
            System.out.println();
        }
    }
}
