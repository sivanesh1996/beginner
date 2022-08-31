class FatherSal
{
    int salary=25000;
    int availMoney=salary;

}
class Son1 extends FatherSal
{
   int schoolfees=1000;
   int books=500;
   int availMoney=schoolfees-books;
    
}
class Son2 extends Son1
{
    int schoolfees=800; 
    int books=400;
    int availMoney=schoolfees-books;
   
}
class FatherSav extends Son2
{
    void balance()
    {
    System.out.println("Available Savings:"+availMoney);
    }
    public static void main(String[] args)
    {
    FatherSav obj=new FatherSav();
    obj.balance();
    }
}

