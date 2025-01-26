/*package patterns;

public class pattern5 {
    public static void main(String[] args) {
        patterns5(5);
    }

    static void patterns5(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int row = n - 1; row > 0; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/

package patterns;



public class pattern5 {
    public static void main(String[] args){
patterns5(6);
    }
static void patterns5(int n)
{
    for(int row=1;row<=n;row++)
    {
        for(int col=1;col<row;col++){
    
    System.out.print("*");
        }
}
System.out.println();

for(int row=n-1;row>0;row--)
{
    for(int col=1;col<=row;col++)
    {
        System.out.print("*");
    }
    System.out.println();
}
}
}
