// // class snp{
// //     public String name="snp";
// //     public int age=12;
// //     public void mnp(){
// //         System.out.println("hello boysss.");
// //     }

// // }

// // public class abhi extends snp{
// //     public String nameee="abhii";

// //     public static void main(String[] args) {
// //         abhi x=new abhi();
// //         x.mnp();
// //     }
    

// // }

// class  abhi{
//     public void hello(){
//         System.out.println("hello keep focusing dont distract");
//     }
// }

// public class snp extends abhi{
//     public String name="sandeshh";
//     public int age=12;
//     public static void main(String[] args) {
//         abhi y= new abhi();
//         y.hello();
//     }

// }

// inheretience alli diffirent class use madbeku (" dont use the sub classes")

class student{
    public void sub(){
        System.out.println("maths");
    }}
    class boys extends  student{
       public void  sub()
       {
        System.out.println("science");
       }
    }

       class girls extends student{
        public void sub()
        {
            System.out.println("chem");

        }
       }



public class snp{
    public static void main(String[] args) {
        boys y=new boys();
        y.sub();
        girls x=new girls();
        x.sub();


    }
}
