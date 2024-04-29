import java.util.*;
public class DoWhileLoop{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Pinak viradiya");
		System.out.println("220130318014");
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements of array:");
        int arr[],max = 0;
        arr = new int[n];
        int i = 0;
        do{
            arr[i] = sc.nextInt();
            i++;
        }while(i<n);
        // max = arr[0];
        System.out.print("The array is:");
        i = 0;
        do
        {
            System.out.print(arr[i] + " ");
            if(max<arr[i])
            {
                max = arr[i];
            }
            i++;
        }while(i<n);
        System.out.println();
        System.out.println("The maximum element is:"+max);
        sc.close();
    }
}