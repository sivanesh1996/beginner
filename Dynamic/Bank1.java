 public class Bank1 //extends Bank
{
    void deposit()
    {
     System.out.println("Rs.500 deposited \nThank you");
    }
    void withdraw()
    {
     System.out.println("Rs.200 withdrawn successfully \nThank you");   
    }
    void grievance()
    {
     System.out.println("Please note the ref no:789 for tracking the status \nThank you");
    }

    public static void main(String[] args)
    {
     Bank obj=new Bank1();
     obj.grievance();
    }
    
}
