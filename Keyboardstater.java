class Keyboardstater
{
public static void main(String[] args)
{
Keyboard keyboard=new Keyboard("dell");
System.out.println("keyboard brand:"+keyboard.brand);




Keyboard keyboard1=new Keyboard("black",400);
System.out.println("keyboard color:"+keyboard1.color);
System.out.println("keyboard cost:"+keyboard1.cost);

Keyboard keyboard2=new Keyboard(78,"intel");
System.out.println("keyboard noofkeys:"+keyboard2.noofkeys);
System.out.println("keyboard type:"+keyboard2.type);

Keyboard keyboard3=new Keyboard(400,78);
System.out.println("keyboard noofkeys:"+keyboard3.noofkeys);
System.out.println("keyboard cost:"+keyboard3.cost);

Keyboard keyboard4=new Keyboard("intel",400);
System.out.println("keyboard brand:"+keyboard4.brand);
System.out.println("keyboard cost:"+keyboard4.cost);

Keyboard keyboard5=new Keyboard("intel",400);
System.out.println("keyboard type:"+keyboard5.type);
System.out.println("keyboard cost:"+keyboard5.cost);

}
}