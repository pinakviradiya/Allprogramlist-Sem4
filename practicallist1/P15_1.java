import java.util.*;
public class P15_1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
	System.out.println("Prem Gohel");
	System.out.println("220130318003");
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        // char c = '*';
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
}