import java.lang.reflect.Array;
import java.util.Arrays;

public class csort {
    public static void main(String[] args)
    {
        int [] arr = {1,2,3,7,6,5,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int [] arr)
    {
        int i=0;
        while(i<arr.length)
        {
          int correct=arr[i]-1;
          if(arr[i]!= arr[correct])
          { 
            swap(arr,i,correct);

          }
          else{
            i++;
          }
        }
    }
     
    static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    
}
