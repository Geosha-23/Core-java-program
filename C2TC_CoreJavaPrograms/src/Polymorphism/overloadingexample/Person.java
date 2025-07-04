package Polymorphism.overloadingexample;

public class Person {
          private int pid;
          private String name;
          private String city;
          
		public Person() //default constructor
		{
			this.pid = 23;
			this.name = "Geo";
			this.city = "Kerala";
		}

		public Person(int pid, String name)
		//only two parameters
		{
			
			this.pid = pid;
			this.name = name;
			this.city = "Bangalore";
		}

		public Person(int pid, String name, String city) //3 parameters
		{
			this.pid = pid;
			this.name = name;
			this.city = city;
		}

		@Override
		public String toString() {
			return "Person [pid=" + pid + ", name=" + name + ", city=" + city + "]";
		}
		
          
          
}
