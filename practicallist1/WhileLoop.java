import java.util.*;
public class WhileLoop {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
	System.out.println("Prem Gohel");
	System.out.println("220130318003");
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements of array:");
        int arr[],pro = 1;
        arr = new int[n];
        int i = 0;
        while(i<n){
            arr[i] = sc.nextInt();
            pro = pro * arr[i];
            i++;
        }
        System.out.print("The array is:");
        i = 0;
        while(i<n)
        {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
        System.out.println("The product of all elements of array is:"+pro);
        sc.close();
    }
}