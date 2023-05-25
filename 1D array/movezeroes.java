public class movezeroes { //moving all the zeroes to the end
    public void printArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i] + " ");
        }
    }
    /**
     * @param arr
     * @param n
     */
    public void movezero(int arr[], int n)
    {
        int j=0;
        for(int i=0; i<arr.length; i++)
        {
        if(arr[i]!=0 && arr[j]==0)
        {
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        if(arr[j]!=0){
            j++;
        }
    }
}
    public void returnarray()
    {
        int arr[]= {12,0,6,0,9,0};
        System.out.println("Before amending changes:");
        printArray(arr);
        movezero(arr,arr.length);
        System.out.println("After amending changes:");
        printArray(arr);
    }

    public static void main(String args[])
    {
        movezeroes obj = new movezeroes();
        obj.returnarray();
    }

}

