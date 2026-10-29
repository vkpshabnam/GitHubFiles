package assignment4;

public class Paliandrome {
	static int num=12321;
	static int rev=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paliandrome.reverse(num);
		Paliandrome.check(num, rev);

	}
	public static int reverse(int a)
	{
		num=a;
		int digit=0;
		while(num!=0)
		{
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		
	System.out.println("Reverse of the number is : "+rev);
	return rev;
	}
	public static void check(int num, int rev)
	{
		if(num==rev)
		{
			System.out.println("Number is a paliandrome");
		}
		else
			System.out.println("Not a paliandrome");
	}

}
