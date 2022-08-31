public class Ladder
{
	public static void main(String[] args)
	{
		int m=9100;
		if(m>=1100 && m<=1200)
		{
		   System.out.println("Topper");
		  
		}
		else if(m<1100 && m>=500)
		{
		    System.out.println("Average mark");
		}
		else if(m<500 && m>=300)
		{
		    System.out.println("Below Average mark");
		}
		else if(m>0 && m<300)
		{
		    System.out.println("Fail");
		}
		else if(m== -100)
		{
		    System.out.println("Absent");
		}
		else
		{
		    System.out.println("Enter valid mark");
		}
	}
}
