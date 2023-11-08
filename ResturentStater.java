class ResturentStater
{
public static void main(String[] food)
{
Resturent resturent=new Resturent();
String[] specialitems=new String[5];

specialitems[0]="dosa";
specialitems[1]="idli";
specialitems[2]="vada";
specialitems[3]="carrot alva";
specialitems[4]="biriyani";
resturent.setSpecialitems(specialitems);
resturent.setOwnername("vishnu");
resturent.showinfo();
}
}