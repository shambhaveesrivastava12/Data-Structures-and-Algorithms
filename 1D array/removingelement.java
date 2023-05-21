public class removingelement {
    public static void print_array(int arr1[])
    {
        for(int i=0; i<arr1.length; i++)
        {
          System.out.println(arr1[i] + " ");
        }
    }
    public static int[] return_count(int arr1[])
    {
        int oddArray=0;
        for(int i=0; i<arr1.length; i++)
        {
            if (arr1[i]%2!=0)
            {
                oddArray++;
            }
        }
        int result[] = new int[oddArray];
        int indx=0;
        for(int j=0; j<arr1.length; j++)
        {
            if (arr1[j]%2!=0)
            {
                result[indx]=arr1[j];
                indx++;
            }
        }
        return result;
    }
   
    public static void main(String args[])
    {
        int arr1[]= {2,3,4,6,7,8,10,11};
        print_array(arr1);
        int result[] = return_count(arr1);
        System.out.println("After operation:");
        print_array(result);
    }
    
}
