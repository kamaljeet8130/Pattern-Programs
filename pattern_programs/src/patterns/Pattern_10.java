package patterns;

public class Pattern_10 {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1;row<=n;row++){
            int i = 1;
            for(int col=1;col<=n+1;col++){
                if(col%2!=0){
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


//1 1 2 1 3 1
//1 2 2 2 3 2
//1 3 2 3 3 3
//1 2 2 4 3 4
//1 5 2 5 3 5