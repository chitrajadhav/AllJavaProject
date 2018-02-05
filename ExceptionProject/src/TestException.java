
public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("start");
		
		try{
			  System.out.println(" Outer try");
			 //int a=10/0;
			 try
			 {
				 System.out.println("inner try");
				 int b=10/0;
				 System.out.println("inner try end"); 
			 }
			 catch(NullPointerException e)
			 {
				 System.out.println("inner catch");
				 
			 }
			 finally{
				 System.out.println("inner finally");
				 
			 }
			 System.out.println("outer try end");
			  
		}
		catch(Exception e1)
		{
			System.out.println("outer catch block");
		}
		finally
		{
			System.out.println("outer finally");
		}
		
		System.out.println("program end");
		
	}

}
