class Address
{
String street;
int pincode;
City city;

void setStreet(String street)
{
this.street=street;
}

void setShows(int pincode)
{
this.pincode=pincode;

}
void setCity(City city)
{
this.city=city;
}
void show()
{
System.out.println("Street is :"+this.street);
System.out.println("pincode is:"+this.pincode);
System.out.println("city is :"+this.city);

if(this.city!=null)
{
this.city.showinfo();
}
}
}