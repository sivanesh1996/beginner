class Max3
{
    public static void main(String[] args)
    {
     int a=9;
     int b=7;
     int c=7;
   //  int max=(a>=b)?a:b;
   // int max3=(max>=c)?max:c;
     int max3=c>=((a>=b)?a:b)?c:((a>=b)?a:b);
     System.out.println(max3);
    }
}
