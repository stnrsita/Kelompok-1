public class Appetizer extends Makanan
{

    public Appetizer(String n, double h) 
    {
        super(n, h);
    }

    @Override
    public void display1() 
    {
        System.out.println("\tSpecial Appetizers\t");
        System.out.println("--------------------------------------");       
    }

    @Override
    public void display()
    {
        System.out.println(super.nama+" : "+ "$" + super.harga);
    }
}
