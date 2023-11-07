class TentGroup
{
Tent color=Tent.RED;
int width;
double height;

TentGroup()
{
System.out.println("TentGroup is high");
}

boolean open()
{
System.out.println("TentGroup is small");
return true;
}

 boolean close()
{
System.out.println("TentGroup is not small");
return false;
}

void showdetails()
{
System.out.println("color :"+color);
System.out.println("width :"+width);
System.out.println("height :"+height);
}
}