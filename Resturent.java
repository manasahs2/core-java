class Resturent
{
String ownername;
String[] specialitems;

Resturent()
{
System.out.println("Resturent is starting");
}

void setOwnername(String ownername)
{
this.ownername=ownername;
}

void setSpecialitems(String[] specialitems)
{
this.specialitems=specialitems;
}

void showinfo()
{
System.out.println("Starting showinfo");
System.out.println("ownername is:"+this.ownername);
System.out.println("specialitems is:"+this.specialitems);

if(this.specialitems!=null)
{
for(int seq=0;seq<this.specialitems.length;seq++)
{
String ref=this.specialitems[seq];
System.out.println("refrence is :"+ref+" seq is :"+seq);

}
}
System.out.println("Ending showinfo");
}
}


