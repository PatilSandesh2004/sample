public class insertionsort{

    void sort(int arr[])
    {
        int n =arr.length;
        for(int i=0;i<n;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j >=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j=j-1;}
                arr[j+1]=key;


            }
        }
        static void printarray(int arr[])
        {
            int n=arr.length;
            for(int i=0;i<n;i++)
            System.out.println(arr[i]+"");
        System.out.println();
            }

        public static void main(String args[])
       {
        int arr[]={12,11,15,9,7,8};
        insertionsort ob= insertionsort();
        ob.sort(arr);
        printarray(arr);
       }
    }
