class Brand
{
String name="hp";
String origin="india";
String Ceoname="joseph";
String cities[];

Brand(String cities[])
{
	this.cities=cities;
}
void showinfo()
{
	System.out.println("name is :"+name);
	System.out.println("origin is :"+origin);
	System.out.println("Ceoname is :"+Ceoname);
	System.out.println("cities :"+cities);
	if(cities!=null)
	{
	for(int seq=0;seq<cities.length;seq++)
	{
		String ref=cities[seq];
		System.out.println("the ref is :"+ref+" seq is :"+seq);
	}		
		
	}
}
}
