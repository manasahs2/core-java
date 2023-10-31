class Showroom
{
double noofworkers;
long items;
String name;
int floors;
String quality;
String managername;
double width;
int showroomcleaners;

Showroom(double noofworkers,String name)
{
  this.noofworkers=noofworkers;
 this.name=name;  
}

Showroom(long items)
{
  this.items=items;
}

Showroom(String name,long items)
{
  this.name=name;
  this.items=items;
}


Showroom(int floors,long items)
{
	this.floors=floors;
	this.items=items;
}

Showroom(String quality,double noofworkers)
{
	this.quality=quality;
	this.noofworkers=noofworkers;
}

Showroom(String managername)
{
	this.managername=managername;
}

Showroom(double width,double noofworkers)
{
	this.width=width;
	this.noofworkers=noofworkers;
}
Showroom(int showroomcleaners)
{
	this.showroomcleaners=showroomcleaners;
}
}





