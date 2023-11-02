class PrinterStater
{
public static void main(String[] args)
{
System.out.println("starting main in PrinterStater");
Printer printer = new Printer("xenon","lrs",4.5);
System.out.println("printer brand is :"+printer.brand);
System.out.println("printer name is :"+printer.name);
System.out.println("printer ratings is :"+printer.ratings);

Printer printer1 = new Printer("xenon","lrs",4.5,6000);
System.out.println("printer brand is :"+printer1.brand);
System.out.println("printer name is :"+printer1.name);
System.out.println("printer ratings is :"+printer1.ratings);
System.out.println("printer cost is :"+printer1.cost);

Printer printer2 = new Printer("xenon","lrs",4.5,6000);
System.out.println("printer brand is :"+printer2.brand);
System.out.println("printer name is :"+printer2.name);
System.out.println("printer ratings is :"+printer2.ratings);
System.out.println("printer cost is :"+printer2.cost);

Printer printer3 = new Printer("xenon","lrs",4.5);
System.out.println("printer brand is :"+printer3.brand);
System.out.println("printer name is :"+printer3.name);
System.out.println("printer ratings is :"+printer3.ratings);

Printer printer4 = new Printer("xenon","lrs",4.5,6000);
System.out.println("printer brand is :"+printer4.brand);
System.out.println("printer name is :"+printer4.name);
System.out.println("printer ratings is :"+printer4.ratings);
System.out.println("printer cost is :"+printer4.cost);
}
}