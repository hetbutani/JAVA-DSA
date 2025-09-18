public class selectionSort {
    public static void main(String[] args)
    {
        int A[] = {12, 7, 8, 3, 9, 1};
        System.out.print("The Original Array : ");
        for(int z=0; z<A.length; z++)
        {
            System.out.print(A[z] + " ");   // Printing the original Array
        }
        int temp = 0;   // Taking temporary variable for swapping

        for(int i=0; i<A.length; i++)
        {
            int smallest = i;   // Let i be the smallest element of the list 
            for(int j=i+1; j<A.length; j++) // Here the i+1 signifies the pointing index next to pointer of i
            {
                if(A[j] < A[smallest])  // Comparing
                {
                    smallest = j;       // If the value of j is smaller then variable "smallest" then assign the value of j to smallest
                }
            }
            // Swapping if the condition is true
            temp = A[i];    
            A[i] = A[smallest];
            A[smallest] = temp;
        }
        // Displaying Sorted Array
        System.out.print("\nThe Sorted Array : ");
        for(int k=0; k<A.length; k++)  
        {
            System.out.print(A[k] + " ");
        }

    }
}
