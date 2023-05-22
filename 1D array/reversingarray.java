public class reversingarray{

    public static void reverse(int array[], int start, int end)
    {
        while(start < end)
        {
            int temp = array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;

        }
    }
    public static void print_array(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i] + " ");
        }
    }
    public static void main(String ags[])
    {
        int array[]={1,2,3,4,12,34,90};
        System.out.println("Before reversing:");
        print_array(array);
        reverse(array,0,array.length-1);
        System.out.println("After reversing:");
        print_array(array);

    }
}