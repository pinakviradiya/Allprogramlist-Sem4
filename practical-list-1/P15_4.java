import java.util.*;
public class P15_4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Pinak viradiya");
		System.out.println("220130318014");
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        // char c = '*';
        for (int i=0; i<n; i++)   
        {  
            //inner loop work for space      
            for (int j=2*(n-i); j>=0; j--)         
            {  
                //prints space between two stars      
                System.out.print(" ");   
            }   
            //inner loop for columns  
            for (int j=0; j<=i; j++ )   
            {   
                //prints star      
                System.out.print("* ");   
            }   
            System.out.println();
        }
        sc.close();
    }
}