class JJHostel extends Hostel
{
    void cubboard()
        {
         System.out.println("Each cart have one cub board");
        }

     void attachedbathroom()
        {   
         System.out.println("Western toilet");
        }

     void food()
        {
         System.out.println("We provide 3 times food");
        }

    public static void main(String[] args)
        {
         JJHostel obj=new JJHostel();
         obj.cubboard();
         obj.attachedbathroom();
         obj.food();
         obj.roomsize();
        }


 }
