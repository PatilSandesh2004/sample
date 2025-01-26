package patterns;

public class pattern4 {
    public static void main(String[] args) {
        patterns5(4);
    }
     static void  patterns5(int n){
        for(int row=n;row>=1;row--)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print(col);
            }
            System.out.println();
        }
     }
    
}
