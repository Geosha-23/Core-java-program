package day1;

public class StudentDemo {
       public static void main(String[] args) {
    	   Student st = new Student();
    	   //st.id = 23;
    	   //st.name = "Geo";
    	   //st.age =20;
    	   //st.show();
    	   //System.out.println(st.id + ":" + st.name + ":" + st.age);
    	   st.setId(23);
    	   st.setName("Geo");
    	   st.setAge(20);
    	   System.out.println(st);
    	   //System.out.println("ID:"+st.getId());
    	   //System.out.println("Name:"+st.getName());
    	   //System.out.println("Age:"+st.getAge());
    	   Student st1 = new Student();
    	   st1.setId(26);
    	   st1.setName("Grace");
    	   st1.setAge(20);
    	   System.out.println(st1);
    	   //System.out.println("ID:"+st1.getId());
    	   //System.out.println("Name:"+st1.getName());
    	   //System.out.println("Age:"+st1.getAge());
    	   
       }
}
 