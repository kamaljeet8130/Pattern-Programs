package patterns;

public class Pattern_06 {
    public static void main(String[] args) {
        int n = 5;
        int steps = 1;
        for(int row = 1;row<=n;row++){
            for(int col = 1;col<=n;col++){
                System.out.print(steps + " ");
                steps++;
            }
            System.out.println();
        }
    }
}
