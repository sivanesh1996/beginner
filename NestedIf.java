public class NestedIf
{
	public static void main(String[] args)
	 {
	    int mark=1100;
		if(mark>=0 && mark<=1200)
		{
		    if(mark>=500 && mark<=1200)
		    {
		    if(mark<1100)
		    {
		        System.out.println("Average mark");
		    }
		    else{
		        System.out.println("Super mark");
		    }
		    }
		else
		{
		    if (mark<=300)
		    {
		        System.out.println("Fail");
		    }
		    else
		    {
		         System.out.println("Below average mark");
		    }
		}
		
		
	}
	else{
		    System.out.println("Enter valid mark");
		}
    }
}
