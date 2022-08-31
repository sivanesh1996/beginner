class MainBank
{
  int min_bal=5000;
}
class SubBank extends MainBank
{
 public static void main(String[] args)
  {
   SubBank obj=new SubBank();
   System.out.println(+obj.min_bal);
  }
}
