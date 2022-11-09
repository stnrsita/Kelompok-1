/**
 * class Makanan dibuat dengan menggunakan konsep abstract class dan inheritance. 
 * Dalam konsep inheritance, class ini berperan sebagai superclass.
 * Class ini berisi method yang nantinya dioverride dan diturunkan kepada class Appetizer, MainCourse, dan Dessert.
 *
 * @author (1. Dhaifina Alifa Putri-2108107010018)
 * @author (2. Margfirah-2108107010021)
 * @author (3. Siti Nurrahmasita-2108107010015)
 * @version (08-10-2022)
 */
public abstract class Makanan
{
    //variable instance
    String nama;
    double harga;
    
    /**
     * Makanan
     * @param n untuk mengubah inisialisasi nama makanan
     * @param h untuk mengubah inisialisasi harga makanan
     */
    public Makanan(String n , double h)
    {
        this.nama = n;
        this.harga = h;
    }
    
    /**
     * getNama untuk mendapatkan nama makanan
     * @return this.nama untuk mengembalikan informasi dasar dari nama makanan
     */
    public String getNama() 
    {
        return this.nama;
    }

    /**
     * setNama untuk mengatur nama makanan
     * @param nama untuk mengubah nama makanan
     */
    public void setNama(String nama) 
    {
        this.nama = nama;
    }
    
    /**
     * getHarga untuk mendapatkan nilai harga
     * @return this.harga untuk mengembalikan informasi dasar harga makanan
     */
    public double getHarga() 
    {
        return this.harga;
    }

    /**
     * setHarga untuk menetapkan nilai harga
     * @param harga untuk mengubah harga makanan
     */
    public void setHarga(double harga) 
    {
        this.harga = harga;
    }
    
    /**
     * display1 untuk menampilkan subjudul menu
     * Method ini akan dioverride pada setiap subclass
     */
    public abstract void display1();

    /**
     * display untuk menampilkan nama dan harga makanan dari setiap subjudul menu
     * Method ini akan dioverride pada setiap subclass
     */
    public void display()
    {
        
    }
}
