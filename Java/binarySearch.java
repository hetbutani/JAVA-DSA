import java.util.*;

public class binarySearch {
    // bubbleSort method definition
    static void bubbleSort(int A[])
    {
        for(int i=0; i<A.length; i++)
        {
            for(int j=i+1; j<A.length; j++)
            {
                if(A[i] > A[j])
                {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        for(int k=0; k<A.length; k++)
        {
            System.out.print(A[k] + " ");
        }
    }
    // binarySearch method definition
    static int BinarySearch(int A[],int left,int right,int x)
    {
        while(left <= right)    // here left points to index no 1, while right points to last index of the array
        {
            int mid = (left + right)/2; // This will points to the middle element of array
            if(A[mid] == x)
            {
                return A[mid];
            }
            else if(A[mid] > x)
            {
                right = mid - 1;    // This will points right index to just before mid 
            }
            else 
            {
                left = mid + 1;     // This will points left index to just after mid
            }
        }
        return -1;  // If any of above condition doesn't match, then it will return -1
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[5];   // Array declaration
        System.out.print("Enter array elements : ");
        // Taking input of array element
        for(int i=0; i<A.length; i++)
        {
            A[i] = sc.nextInt();
        }
        // Prints original array
        System.out.print("Array Before Sort : ");
        for(int j=0; j<A.length; j++)
        {
            System.out.print(A[j] + " ");
        }
        // Prints array after sort using bubble sort
        System.out.print("\nArray After Sort : ");
        bubbleSort(A);  //bubble sort Method call by passing array as parameter
        System.out.print("\nEnter element to find : ");
        int x = sc.nextInt();

        int n = A.length;

        int result = BinarySearch(A, 0, n-1, x);    // binary search method call by passing all required parameters

        if(result == -1)
        {
            System.out.println(x + " is not found");
        }
        else 
        {
            System.out.println(x + " is found");
        }
        sc.close();
    }
}