package patterns;

public class Pattern_09 {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1;row<=n;row++){
            for(int col = 1;col<=n;col++){
                System.out.print(row*col + " ");
            }
            System.out.println();
        }
    }
}
