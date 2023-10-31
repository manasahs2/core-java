class Matchboxx
{
String brand;
int noofStick;
double length;
double price;
int size;
int weight;
String type;

Matchboxx(String brand,int noofStick)
{
	this.brand=brand;
	this.noofStick=noofStick;
}

Matchboxx(double length,String brand)
{
	this.length=length;
	this.brand=brand;
}
Matchboxx(double price,String brand,int size)
{
	this.price=price;
	this.brand=brand;
	this.size=size;
}
Matchboxx(int size,double length)
{
	this.size=size;
	this.length=length;
}
Matchboxx(int weight,String type)
{
	this.weight=weight;
	this.type=type;
}
Matchboxx(String type,double price)
{
	this.type=type;
	this.price=price;
}
}