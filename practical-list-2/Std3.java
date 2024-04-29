class Std2
{
	int roll_no;
	Std2(int i)
	{
		roll_no=i;
	}
	//return true if it is equal to the invoking object
	boolean equals(Std2 s)
	{
	   if(roll_no==s.roll_no)
		return true;
	   else
		return false;
	}
}
	class Std3
	{
	  public static void main(String args[])
	{
		System.out.println("Pinak viradiya");
		System.out.println("220130318014");
	  Std2 s1=new Std2(30);
  	  Std2 s2=new Std2(30);
	  Std2 s3=new Std2(20);
	  System.out.println("s1==s2 :: "+s1.equals(s2));
	  System.out.println("s1==s3 :: "+s1.equals(s3));
	}
}