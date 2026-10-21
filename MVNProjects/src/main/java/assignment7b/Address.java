package assignment7b;



public class Address {

	String c;
	Student s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student x= new Student();
		x.student1("Shabnam",5);
		
		Address a=new Address();
		a.student2("Kerala",x);
		a.print();
		
	}
	public void student2(String c, Student s)
	{
		this.c=c;
		this.s=s;
		
	}
	
	
	public void print()
	{
		System.out.println("Name 	    : "+s.a);
		System.out.println("Roll Number : "+s.b);
		System.out.println("Address is  : "+c);
	}

}
