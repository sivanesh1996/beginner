class Vehicle
{
 void drive()
    {
     System.out.println("Ready to drive....");
    }
}
class Car extends Vehicle
    {
     int wheel=4;
     int headlamp=2;
     int seat=4;
     void Braking()
        {
         System.out.println("Brake applied successfully");
        }
      void moving()
        {
        System.out.println("speed:100km/hr");
        }
    }
class SingleInheritance
{
    public static void main(String[] args)
    {
    Car obj=new Car();
    obj.moving();
    obj.drive();
    System.out.println(obj.wheel);
    }
}

