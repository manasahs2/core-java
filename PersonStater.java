class PersonStater
{
public static void main(String[] args)
{
    Email email[]=new Email[4];
	email[0]=new Email("yahoo.com",4,"manasa","hs");
	email[1]=new Email("gmail.com",5,"vinu","ks");
	email[2]=new Email("yahoo.com",717,"Bhagya","HN");
	email[3]=new Email("facebook.com",4,"sonu","vn");




Person person=new Person("manasa",email);
person.showinfo();





}
}