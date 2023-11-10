class LaptopStater
{
public static void main(String[] args)
{
System.out.println("starting main in LaptopStater");

String[] cities=new String[6];
cities[0]="davanagere";
cities[1]="bangalore";
cities[2]="hubli";
cities[3]="dharwad";
cities[4]="thumkur";
cities[5]="chitradurga";
Brand brand=new Brand(cities);
brand.showinfo();

City city=new City();
city.setname("Mysore");
city.StateName("karnataka");

Address address=new Address();
address.setStreet("btm");
address.setShows(5648900);
address.setCity(city);


Owner owner=new Owner("VISHNU","hsmanas3@gmail.com");
owner.setinfo(address,address);
owner.show();

Hardware[] hardware=new Hardware[10];
	    hardware[0]=new Hardware("Keyboard","wire","HP");
		hardware[1]=new Hardware("Mouse","Wire","Lenova");
		hardware[2]=new Hardware("Jack","Wire","HP");
		hardware[3]=new Hardware("Scanner","Wire","Sony");
		hardware[4]=new Hardware("Printer","Wire","Dell");
		hardware[5]=new Hardware("CPU","Wire","HP");
		hardware[6]=new Hardware("Mother BOard","wire","HP");
		hardware[7]=new Hardware("HDD","Wire","Sony");
		hardware[8]=new Hardware("RAM","wire","HP");
		hardware[9]=new Hardware("Moniter","Wire","Sony");
		

Laptop laptop=new Laptop(hardware,owner,brand);
laptop.show();
}
}



