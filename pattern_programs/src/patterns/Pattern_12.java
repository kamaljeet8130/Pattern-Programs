package patterns;

public class Pattern_12 {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1;row<=n;row++){
            int i=row;
            for(int col = 1;col<=n;col++){
                System.out.print(i+ " ");
                i+=n;
            }
            System.out.println();
        }
    }
}



