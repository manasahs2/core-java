class Showroomstater
{
public static void main(String[] args)
{
System.out.println("starting main in Showroomstater");
Showroom showroom1=new Showroom(50,"vinay");
Showroom showroom2=new Showroom(50000);
Showroom showroom3=new Showroom("honda",5000);
Showroom showroom4=new Showroom(4);
Showroom showroom5=new Showroom("good");
Showroom showroom6=new Showroom("vinay");
Showroom showroom7=new Showroom(35);
Showroom showroom8=new Showroom(9);
System.out.println("noofworkers is :"+showroom1.noofworkers);
System.out.println("showroom name :"+showroom1.name);
System.out.println("showroom items :"+showroom2.items);
System.out.println("showroom name :"+showroom3.name);
System.out.println("showroom name :"+showroom3.items);
System.out.println("showroom floors :"+showroom4.floors);
System.out.println("showroom quality is :"+showroom5.quality);
System.out.println("showroom managername :"+showroom6.managername);
System.out.println("showroom width :"+showroom7.width);
System.out.println("showroom cleaners  :"+showroom8.showroomcleaners);
}
}