import java.io.*;
public class ssort {
    void sort(int arr[]){
        int n= arr.length;
        for(int i=0;i<n-1;i++)
{
    int min_index=i;
    for(int j=i+1;j<n;j++)
    if(arr[j]<arr[min_index])
       min_index=j;


       int temp=arr[min_index];
       arr[min_index]=arr[i];
       arr[i]=temp;

}

    }

    void printarray(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;++i)
        
            System.out.println(arr[i]+"");
        System.out.println();
    }

    public static void main(String args[])
{
   ssort ob=new ssort();
   int arr[]={64,12,54,34,56,99};
   ob.sort(arr);
   System.out.println("sorted array");
   ob.printarray(arr);


}
}
