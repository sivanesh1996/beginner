class Max4
{
    public static void main(String[] args)
    {
     int a=17;
     int b=71;
     int c=7;
     int d=11;
   //  int max=(a>=b)?a:b;
   // int max3=(max>=c)?max:c;
    // int max3=c>=((a>=b)?a:b)?c:((a>=b)?a:b);
       
     int max4=((d>((b>c)?b:c)?d:((b>c)?b:c))<a)?a:(d>((b>c)?b:c)?d:((b>c)?b:c));
     System.out.println(max4);
    }
}
