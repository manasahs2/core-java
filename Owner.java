class Owner
{
String name;
String email;
Address permentAddress;
Address temporaryAddress;
 
Owner(String name,String email)
{
this.name=name;
this.email=email;
}

void setinfo(Address permentAddress,Address temporaryAddress)
{
this.permentAddress=permentAddress;
this.temporaryAddress=temporaryAddress;
}

void show()
{
System.out.println("name is :"+name);
System.out.println("email is :"+email);
System.out.println("permentAddress :"+permentAddress);
if(permentAddress!=null)
{
permentAddress.show();
}
System.out.println("temporaryAddress :"+temporaryAddress);
if(temporaryAddress!=null)
{
temporaryAddress.show();
}
}
}