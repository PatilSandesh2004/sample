package patterns;

 public class pattern3 {
    public static void main(String[] args)
    {
  patterns3(4);
    }
    static void patterns3(int n)
    {
        for(int row=n;row>0;row--)
        {
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
          System.out.println();

        }    }
    
 }

// package patterns;

// public class pattern3 {
//     public static void main(String[] args) {
//         patterns3(4);
//     }

//     static void patterns3(int n) {
//         for (int row = n; row > 0; row--) {
//             for (int col = 1; col <= row; col++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
