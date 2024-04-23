import java.util.*;
public class P15_2 {
        public static void main(String[] args) {
          
        Scanner sc = new Scanner(System.in);
	System.out.println("Prem Gohel");
	System.out.println("220130318003");
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        // char c = '*';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}