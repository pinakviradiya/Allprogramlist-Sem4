import java.util.*;
public class NetSalary {
        public static void main(String[] args) {

	
         double basic_sal,net_sal,hra,da;
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Prem Gohel");
	 System.out.println("220130318003");

	 System.out.print("Enter the basic salary of any employee ::");
	 basic_sal=sc.nextDouble();

	 if(basic_sal<1500)
	 {
		hra=basic_sal*10/100;
		da=basic_sal*90/100;
	 }
	 else
	 {
		hra=500;
		da=basic_sal*98/100;
	 }	 

	 net_sal=basic_sal+hra+da;
		
	 System.out.println("Grocc salary of given employee is ::"+net_sal);
	}
}