class Canteen
{
String type;
String[] utensil;

Canteen()
{
System.out.println("Canteen is main start");
}

void settype(String type)
{
this.type=type;
}

void setutensils(String[] utensil)
{
this.utensil=utensil;
}
void showinfo()
{
System.out.println("Starting showinfo");
System.out.println("type is:"+this.type);
System.out.println("utensils is:"+this.utensil);

if(this.utensil!=null)
{
for(int seq=0;seq<this.utensil.length;seq++)
{
String ref=this.utensil[seq];
System.out.println("refrence is :"+ref+" seq is :"+seq);
}
}
System.out.println("Ending showinfo");
}
}