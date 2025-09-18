public class bubbleSort {
    public static void main(String[] args) {
        int A[] = {9, 3, 2, 5, 10, 1};
        System.out.print("The Original Array : ");
        // Printing Array Elements
        for(int z=0; z<A.length; z++)
        {
            System.out.print(A[z] + " ");
        }
        int temp = 0;   // Initializing temporary value for swapping purpose

        for(int i=0; i<A.length; i++){  // Pointing index no : 0 of the Array A
            for(int j=i+1; j<A.length; j++){    // Pointing index no : 1 that is index next to pointer of i
                // Swapping if the condition in true
                if(A[i] > A[j]){
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        // Printing Sorted Array 
        System.out.print("\nThe Sorted Array : ");
        for(int k=0; k<A.length; k++){
            System.out.print(A[k] + " ");
        }
    }
}