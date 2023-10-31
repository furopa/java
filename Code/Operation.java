interface Operation
{
	double area();
	double volume();
}
class Cylinder implements Operation
{
	double r;
	double h;
	double PI=3.14;

	public Cylinder(double r,double h)
	{
		this.r=r;
		this.h=h;
	}
	public double area()
	{
		return(2*PI*r*(h+r));
	}
	public double volume()
	{
		return(PI*r*r*h);
	}
}
public class A3seta3
{
	public static void main(String[] args)
	{
		//double r=2.0;
		////double h=3.0;

	Cylinder c=new Cylinder(2.0,3.0);
	System.out.println("Cylinder - Area:"+ c.area());
	System.out.println("Cylinder - Volume:"+ c.volume());
	}
}
