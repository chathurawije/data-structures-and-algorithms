import sorts.InsertionSort;
public class Main {

	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6};
		 
        InsertionSort ob = new InsertionSort();        
        ob.sort(arr);
         
        printArray(arr);
	}

	
	
	/* A utility function to print array of size n*/
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
}
