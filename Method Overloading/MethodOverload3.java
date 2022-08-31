class MethodOverload3
{
    
     void mult(int a,float b)
        {
         float c=a*b;
         System.out.println(c);
        }
     void mult(int a,int b,float c, char f)
        {
         float d=a*b*c;
         System.out.println(d);
         System.out.println("Entered character is:"+f);
        }
  public static void main(String[] args)
    {
     MethodOverload3 obj=new MethodOverload3();
     obj.mult(2,3.2f);
     obj.mult(2,3,4.0f,'M');
    }
}
