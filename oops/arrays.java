
public class arrays {
    public static void main(String[] args) {
        int array[]=new int[10];
        int Array[] =new int[8];
        System.out.println("Before adding the element to the arr:\n");
    
        for(int i=0;i<array.length;i++)
        {
            System.out.println("Adding"+" "+i+""+"at index"+i);

        }
        System.out.println("To print an array\n");
       System.out.println();
       System.out.println();

       System.out.println("to add the the new element at index 2:");
       for(int i=0;i<array.length;i++)
       {
        if (array[i]==2)
        {
System.out.println("The element found at index:"+i);
        }
       }


       System.out.println("to insert the value at 2 nd positoiom value is 3");
       array[2]=20;
       for(int i=0;i<array.length;i++){
       System.out.println(array[i]);
       }

    }
}
