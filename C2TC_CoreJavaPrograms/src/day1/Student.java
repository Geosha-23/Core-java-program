package day1;

public class Student {
	 //int id;
     //String name;
     //int age;
	 //public void show()
	//{
	 //System.out.println("Student class method");
	//System.out.println(id + ":" + name + ":" + age);
	//}
         private int id;
         private String name;
         private int age;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
        
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", age=" + age +"]"; 
		}

}
