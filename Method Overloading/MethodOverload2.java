class MethodOverload2
{
    
     void mult(float a,float b)
        {
         float c=a*b;
         System.out.println(c);
        }
     void mult(int a,int b,int c)
        {
         int d=a*b*c;
         System.out.println(d);
        }
  public static void main(String[] args)
    {
     MethodOverload2 obj=new MethodOverload2();
     obj.mult(2.1f,3.2f);
     obj.mult(2,3,4);
    }
}
