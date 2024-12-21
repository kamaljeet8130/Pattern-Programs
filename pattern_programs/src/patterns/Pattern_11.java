package patterns;

public class Pattern_11 {
    public static void main(String[] args) {
        int n = 5;
        for(int row =1;row<=n;row++){
            int i = 1;
            for(int col = 1;col<=n+1;col++){
                if(col%2==0){
                    System.out.print(i + " ");
                    i++;
                }
                else{
                    System.out.print(row + " ");
                }
            }
            System.out.println();
        }
    }
}
