class AnonymousObj
{
  int id;
  long mobile;
  boolean status;
  void empdetails()
     {
       System.out.println("id:"+id +"\nmobile:"+mobile +"\nAlive:"+status);
     }
  public static void main(String[] agrs)
    {
    /* AnonymousObj obj=new AnonymousObj();
     obj.id=001;
     obj.mobile=948756854L;
     obj.status=true;
     obj.empdetails(); */
     System.out.println("-----------------------------------");
     new AnonymousObj().empdetails();
     new AnonymousObj().id=002;
     new AnonymousObj().mobile=9876541235L;
     new AnonymousObj().status=true;
     new AnonymousObj().empdetails();
    }
}

     
     
