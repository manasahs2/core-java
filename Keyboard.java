class Keyboard
{
String brand;
String color;
int noofkeys;
String type;
double cost;

Keyboard()
{
System.out.println("keybord varietys");
}

Keyboard(String brand)
{
this.brand=brand;

}

Keyboard(String color,double cost)
{
this.color=color;
this.cost=cost;
}

Keyboard(int noofkeys,String type)
{
this.noofkeys=noofkeys;
this.type=type;
}

Keyboard(double cost,int noofkeys)
{
this.cost=cost;
this.noofkeys=noofkeys;
}

Keyboard(String brand,double cost,int noofkeys)
{
this.brand=brand;
this.cost=cost;
this.noofkeys=noofkeys;
}

Keyboard(String type,double cost,String color)
{
this.type=type;
this.cost=cost;
this.color=color;
}
}