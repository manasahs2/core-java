class Laptop
{
Hardware[] hardware;
Owner owner;
Brand brand;

Laptop(Hardware[] hardware,Owner owner,Brand brand)
{
this.hardware=hardware;
this.owner=owner;
this.brand=brand;
}
void show()
{
System.out.println("hardware is :"+hardware);
if(hardware!=null)
{
for(int seq=0;seq<hardware.length;seq++)
{
Hardware ref=hardware[seq];
ref.show();
}
}
System.out.println("Owner is :"+owner);
if(owner!=null);
{
owner.show();
}
System.out.println("brand is :"+brand);
if(owner!=null)
{
brand.showinfo();
}
}
}
