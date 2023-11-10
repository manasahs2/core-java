class Hardware
{
String name;
String type;
String brand;

Hardware(String name,String type,String brand)
{
this.name=name;
this.type=type;
this.brand=brand;
}

void show()
{
System.out.println("name is :"+name);
System.out.println("type is :"+type);
System.out.println("brand is :"+brand);

}
}