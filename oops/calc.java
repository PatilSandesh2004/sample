public class calc {
   public int add(int a,int b)
   {
    return a+b;
   }
   public int sub(int a,int b)
   {
    return a-b;
   }
   public int mul(int a,int b)
   {
    return a*b;
   }
   public float div(float  a,float b)
   {
    if(b==0)
    {
        System.out.println("Divison error is not allowed");

    }
    return a/b;

   }

   public static void main(String[] args) {
    calc cal=new calc();
int  num1=10;
   int num2=5;
    System.out.println("Addition:"+cal.add(num1,num2));
    System.out.println("substraction:"+cal.sub(num1, num2));
    System.out.println("multiply:"+cal.mul(num1, num2));
    System.out.println("division:"+cal.div(num1, num2));
    



   }
}
