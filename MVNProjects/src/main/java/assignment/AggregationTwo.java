package assignment;



public class AggregationTwo {

	int x;
	int y;
	AggregationOne o;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggregationOne x=new AggregationOne();
		x.assign(3,4);
		AggregationTwo t=new AggregationTwo();
		t.method1(5,6,x);
		t.display();

	}
	public void method1(int x,int y,AggregationOne u)
	{
		this.x=x;
		this.y=y;
		this.o=u;
	}
	
	public void display()
	{
		System.out.println("x="+x+" y="+y);
		System.out.println("a="+o.a+" b="+o.b);
	}
	

}
