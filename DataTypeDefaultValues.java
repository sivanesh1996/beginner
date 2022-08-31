class DataTypeDefaultValues
{
    public static void main(String args[])
    {
     DataTypeDefaultValues obj=new DataTypeDefaultValues();
     DataTypeDefaultValues obj1=new DataTypeDefaultValues();
     obj.patientdetails();
      System.out.println("Before initialization:Patient name:Raju:"+obj.weight);
     obj.age=21;
     obj.height=170;
     obj.weight=55;
     obj.a='M';
     obj.covid=true;
     obj.patientdetails();
     System.out.println("After initialization:Patient name:Raju:"+obj.weight);
     
     obj1.patientdetails();
     obj1.age=50;
     obj1.height=165;
     obj1.weight=70;
     obj1.a='F';
     obj1.covid=false;
     obj1.patientdetails(); 
     
     
     
    
    }
 

    void patientdetails()
    {
      int age;
 int height;
 float weight;
 char a;
 boolean covid;
     System.out.println("Patient details:\n" +" Age:"+age +"\n Gender:"+a+ "\n Height:"+height+ "\n Weight:"+weight +"\n Passed Covid Test:"+covid);
     System.out.println(a);
    }
}
        
