package patterns;

public class Pattern_05 {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1;row<=n;row++){
            for(int col = 1;col<=n;col++){
                System.out.print(n-col+1+ " ");
            }
            System.out.println();
        }
    }
}
