import java.util.*;

class ReverseNum {
    

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Pinak viradiya");
		System.out.println("220130318014");
        int number = sc.nextInt();
        int rev = 0;
	
        
        while(number != 0) {
            int rem = number % 10;
            rev = rev * 10 + rem;
            number /= 10;
        }
        
        System.out.println(rev);
    }
}