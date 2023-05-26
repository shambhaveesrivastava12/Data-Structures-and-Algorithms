public class missingelement { //find the missing element in the array
    public static int missingNumber(int array[]) 
    {
        int actualsum=0; // sum of all the elements of the array
       int n = array.length+1; //size
       int sum = n * (n+1)/2; //possible sum of the array according to the size(N) of the array
       for(int i=0;i<array.length;i++)
       {
        actualsum = actualsum + array[i];
       }

       int missingel = sum - actualsum; //missing element
       return missingel;
    }
    public void demo()
    {
        int array[]= {2,4,5,6,3,1};
        System.out.println("Missing element:" + missingNumber(array));
    }
    /**
     * @param args
     */
    public static void main(String args[])
    {
        missingelement obj = new missingelement();
        obj.demo();
    }
}
