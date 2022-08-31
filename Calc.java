class Calc
{
    public static void main(String args[])
    {
     Calc obj=new Calc();
     float d=obj.add(5.5f,5.2f);
     System.out.println(d);
     System.out.println(obj.sub());
     obj.mult(9,2);
     obj.div();
    }
    public float add(float b,float c)
    {
      float a=b+c;
      return a;
     }
    public int sub()
    {
     int a=9;
     int b=7;
     int c=a-b;
     return c;
    }
    public void mult(int b,int c)
    {
     int a=b*c;
    System.out.println(a);
    }
    public void div()
    {
     int a=7;
     int b=3;
     int c=a/b;
     System.out.println(c);
    }
}
    
