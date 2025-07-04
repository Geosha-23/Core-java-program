package Polymorphism.overriding;

public class Executor {

	public static void main(String[] args) {
		//dynamic binding or late binding
		Shape s1=new Shape();
		
		s1.calArea();
		
		s1=new Square(2.3f);
		s1.calArea();
		
        s1= new Rectangle(2.4d,2.5d);
        s1.calArea();
	}

}
