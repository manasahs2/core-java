class Agent
{
int id;
String name;
String company;

void opentent(TentGroup tentgroup)
{
tentgroup.open();
}

void  closetent(TentGroup tentgroup)
{
tentgroup.close();
}

void showinfo()
{
System.out.println("agent id is :"+this.id);
System.out.println("agent name is:"+this.name);
System.out.println("agent company is:"+this.company);
}
}