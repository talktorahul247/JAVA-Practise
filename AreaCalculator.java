package javaPractise;

public class AreaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(area(5.0));
		System.out.println(area(5,10));
		System.out.println(area(-5.0));
		System.out.println(area(5,-10));
		
	}

	public static double area(double radius)
	{ 
		if(radius <0)
			return -1d;
		else 
		{
		return Math.PI* Math.pow(radius, 2);
		}
	}

	public static double area(double x, double y)
	{	
		if(x<0 || y<0)
		return -1d;
		
		else
		return x*y;
	
	}
}
