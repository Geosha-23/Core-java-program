package Polymorphism.overriding;

public class Square extends Shape{
	
	public Square(float Area)
	{
		super.Area=Area;
	}
	public void calArea()
    {
    	System.out.println("From square class:" +super.Area*super.Area);
    }
}
