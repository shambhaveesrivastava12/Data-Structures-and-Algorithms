

public class addingelement {
    public void print_array(int arr1[]){
        int n = arr1.length;
        for (int i=0; i<n; i++)
        {
            System.out.println( arr1[i] + " ");
        }
    }
    public void my_array()
    {
        int arr[] = new int[10];
        arr[0]=1;
        arr[1]=4;
        arr[2]=3;
        arr[3]=10;
        arr[4]=18;
        print_array(arr);
    }
    public static void main(String args[])
    {
        addingelement obj = new addingelement();
        obj.my_array();
    }


    }

    


