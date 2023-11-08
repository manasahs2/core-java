class Email
{
String domain;
int id;
String Firstname="SONU";
String Lastname;



Email(String domain,int id,String Firstname,String Lastname)
{
this.domain=domain;
this.id=id;
this.Firstname=Firstname;
this.Lastname=Lastname;
}

void showinfo()
{
System.out.println("domain:"+this.domain);
System.out.println("id:"+this.id);
System.out.println("Firstname:"+this.Firstname);
System.out.println("Lastname:"+this.Lastname);

}
}