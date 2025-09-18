import java.util.Scanner;
public class linearSearch{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int customerID[] = {1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1010};
        System.out.print("Customer ID : ");
        for(int i=0; i<customerID.length; i++)
        {
            System.out.print(customerID[i] + " ");  // Displaying array elements
        }
        try{
            System.out.print("\nEnter a key : ");
            int key = sc.nextInt(); // Taking input for checking element if it is present or not
            boolean flag = false;   // Flag is the indication that should be true or false
            for(int j=0; j<customerID.length; j++)
            {
                // Checking condition if the statement is true then break the loop and goes to next operation
                if(key == customerID[j])
                {
                    flag = true;
                    break;
                }
            }
            if(flag == true)
            {
                System.out.println("Found");
            }
            else
            {
                System.out.println("Not Found");
            }
        }
        catch(Exception e)  // If user inputs invalid value e.g. : Abc which is not an integer value then this message will display
        {
            System.out.println("Please enter integer value !");
        }
        sc.close();
    }
}
