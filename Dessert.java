/**
 * class Dessert dibuat dengan menggunakan konsep abstract class dan inheritance.
 * Dalam konsep inheritance, class ini berperan sebagai subclass.
 * Class ini berisi method yang mengoverride method abstarct yang ada di class Makanan (konsep abstract).
 * Class ini juga mewarisi method tidak abstract yang ada di class Makanan (konsep inheritance).
 * 
 * @author (1. Dhaifina Alifa Putri-2108107010018)
 * @author (2. Margfirah-2108107010021)
 * @author (3. Siti Nurrahmasita-2108107010015)
 * @version (08-10-2022)
 */
public class Dessert extends Makanan
{
    /**
     * Dessert
     * @param n merupakan variable yang ada pada super class Makanan
     * @param h juga merupakan variabel yang ada pada super class Makanan
     */
    public Dessert(String n, double h) 
    {
        super(n, h);
    }

    /**
     * display1 berfungsi untuk mengoverride abstract method dari class Makanan
     */
    @Override
    public void display1() 
    {
        System.out.println("\tSpecial Desserts\t");
        System.out.println("--------------------------------------");       
    }

    /**
     * display berfungsi untuk menampilkan nama dan harga makanan dari class Dessert
     */
    @Override
    public void display()
    {
        System.out.println(super.nama+" : "+ "$" + super.harga);
    }   
}
