class Printer
{
String brand;
String name;
double ratings;
long cost;
double speed;

Printer()
{
this("xenon","lrs",4.5);
}
Printer(String brand,String name,double ratings)
{
this.brand=brand;
this.name=name;
this.ratings=ratings;
System.out.println("printer brand is :"+brand+",name is :"+name+",ratings is :"+ratings);
}
Printer(String brand,String name,double ratings,long cost)
{
this(brand,name,ratings);
this.cost=cost;
System.out.println("printer brand is :"+brand+",name is :"+name+",ratings is :"+ratings+",cost is :"+cost);
}
}