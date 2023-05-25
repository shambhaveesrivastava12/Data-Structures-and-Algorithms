public class minimumval
{
    public int findminval(int array[])
    {
        if(array == null || array.length==0)
        {
            throw new IllegalArgumentException("Invalid input");
        }
        int min =array[0];
        for(int i=1; i<array.length;i++)
        {
            if (array[i]<min)
            {
                min=array[i];
            }
        }
        return min;
    }
    public static void main(String args[])
    {
        int arr[]= {2,5,7,1,18,99};
        minimumval obj = new minimumval();
        System.out.println(obj.findminval(arr));
    }
}