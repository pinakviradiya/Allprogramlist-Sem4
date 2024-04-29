import java.util.*;
public class IterateOfArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Pinak viradiya");
		System.out.println("220130318014");

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter "+n+" elements of array:");
        int arr[],sum = 0;
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.print("The array is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The sum of all elements of array is:"+sum);
        sc.close();
    }
}