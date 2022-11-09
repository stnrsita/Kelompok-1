public class Appetizer extends Makanan
{
    /**
     * Appetizer 
     * @param n merupakan variable yang ada pada super class Makanan
     * @param h juga merupakan variabel yang ada pada super class Makanan
     */
    public Appetizer(String n, double h) 
    {
        super(n, h);
    }

    /**
     * display1 berfungsi untuk mengoverride abstract method dari class Makanan
     */
    @Override
    public void display1() 
    {
        System.out.println("\tSpecial Appetizers\t");
        System.out.println("--------------------------------------");       
    }

    /**
     * display berfungsi untuk menampilkan nama dan harga makanan dari class Appetizer
     */
    @Override
    public void display()
    {
        System.out.println(super.nama+" : "+ "$" + super.harga);
    }
}
