class Matchboxstater
{
public static void main(String[] args)
{
Matchboxx matchboxx=new Matchboxx("pigon",34);
System.out.println("matchboxx brand :"+matchboxx.brand);
System.out.println("matchboxx noofsticks :"+matchboxx.noofStick);

Matchboxx matchboxx1=new Matchboxx(23,"pigon");
System.out.println("matchboxx length:"+matchboxx1.length);
System.out.println("matchboxx brand :"+matchboxx1.brand);

Matchboxx matchboxx2=new Matchboxx(10,"pigon",9);
System.out.println("matchboxx price:"+matchboxx2.price);
System.out.println("matchboxx brand :"+matchboxx2.brand);
System.out.println("matchboxx size :"+matchboxx2.size);

Matchboxx matchboxx3=new Matchboxx(9,23);
System.out.println("matchboxx size :"+matchboxx3.size);
System.out.println("matchboxx length:"+matchboxx3.length);

Matchboxx matchboxx4=new Matchboxx(34,"wood");
System.out.println("matchboxx weight :"+matchboxx4.weight);
System.out.println("matchboxx type:"+matchboxx4.type);

Matchboxx matchboxx5=new Matchboxx("wood",10);
System.out.println("matchboxx type:"+matchboxx5.type);
System.out.println("matchboxx price:"+matchboxx5.price);
}

}