class Poorvika_Head
{
     int Samsung_S20=25000;
     int Redmi_note9=12000;
     int Realme_k20=15000;
     int Nokia_11=6000;

  public void mobileprice()
    {
    
     System.out.println("Samsung S20=Rs"+Samsung_S20 +"\nRedmi note9=Rs"+Redmi_note9 +"\nRealme K20=Rs"+Realme_k20 +"\nNokia 11=Rs"+Nokia_11);
    }
}
class Poorvika_Tambaram extends Poorvika_Head
{
  
    void offer()
    {
     
    System.out.println("Today Samsung S20 at 10% offer"+"\nGrab the offer"+"\nOffer price="+Samsung_S20*90/100);
    }
    public static void main(String[] args)
    {
    Poorvika_Tambaram obj=new Poorvika_Tambaram();      
    obj.mobileprice();
   //System.out.println(obj.Samsung_S20);
    obj.offer();
    }
}
   
     
