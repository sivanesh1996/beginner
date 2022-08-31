class Whleloop
{
        void method1() //this method prints hi ten times
        {
        int counter=0;
        while(counter<10)
        {
        System.out.println("hi");
        counter++; 
        }
        }
   
        
        void method2() //this method prints 1 to hundred
        {
        int counter=1;
        while(counter<=100)
        {
        if(counter%2==0)
        {
        System.out.println(counter);
        }
        counter++;
        }
        }

        void method3() //this method prints 100 to 1
        {
        int counter=100;    
        while(counter>=1)
        {
        System.out.println(counter);
        counter--;
        }
        } 
        
        void method4() //this method prints 1-100 even numbers
        {
        int counter=1;
        while(counter<=100)
       {
        if(counter%2==0)
        {
        System.out.println(counter);
        }
        counter++;
        }
        }

        void method5() //this method prints 1-100 odd numbers
        {
        int counter=1;
        while(counter<=100)
        {
        if(counter%2==1)
        {
        System.out.println(counter);
        }
        counter++;
        }
        }

        void method6()  //this method prints 100-1 even numbers
        {
        int counter=100;
        while(counter>=1)
        {
        System.out.println(counter);
        counter=counter-2;
        }
        }

        void method7()  //this method prints 100-1 odd numbers
        {
        int counter=99;
        while(counter>=1)
        {
        System.out.println(counter);
        counter=counter-2;
        }
        }
    public static void main(String[] args)
    {
     Whleloop obj=new Whleloop();
     //System.out.println("Printing hi ten times:");
     //obj.method1();
     //System.out.println("Printing 1 to 100:");
     //obj.method2();
     //System.out.println("Printing 100 to 1:");
     //obj.method3();
     //System.out.println("Printing 1-100 even numbers:");
     //obj.method4();
     //System.out.println("Printing 1-100 odd numbers:");
     //obj.method5();
     //System.out.println("Printing 100-1 even numbers:");
     //obj.method6();
        System.out.println("Printing 100-1 odd numbers:");
        obj.method7();
    }
}

         
