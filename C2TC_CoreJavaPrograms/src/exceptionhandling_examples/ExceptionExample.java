package exceptionhandling_examples;

public class ExceptionExample {
      public static void main(String args[]) 
     
      {
    	  try
    	  {
    	  int a[]= {5,6,7,8};
    	  System.out.println(a[5]);//racing exception object
    	
    	  
      }
      catch (ArrayIndexOutOfBoundsException ae)
      {
    	 System.err.println(" Exception occured:"+ae.getMessage()); 
      }
    	  System.out.println("next line");
}
}
