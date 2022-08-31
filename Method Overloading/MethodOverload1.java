class MethodOverload1
{
    
     void mult(int a,int b)
        {
         int c=a*b;
         System.out.println(c);
        }
     void mult(int a,int b,int c)
        {
         int d=a*b*c;
         System.out.println(d);
        }
  public static void main(String[] args)
    {
     MethodOverload1 obj=new MethodOverload1();
     obj.mult(2,3);
     obj.mult(2,3,4);
    }
}
