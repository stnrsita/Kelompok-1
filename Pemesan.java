/**
 * class Pemesan berisi data yang berhubungan dengan pelanggan yang berkunjung ke restaurant. 
 * Class ini diposisikan sebagai user dalam mengakses menu-menu makanan.
 * 
 * @author (1. Dhaifina Alifa Putri-2108107010018)
 * @author (2. Margfirah-2108107010021)
 * @author (3. Siti Nurrahmasita-2108107010015)
 * @version (08-10-2022)
 */
public class Pemesan
{
    //instance variables
    private String nama;
    private double input;
    private double total;
    private int jumlah;
    private double harga;

    /**
     * Constructor for objects of class hh
     */
    public Pemesan()
    {
        
    }
    
    /**
     * setNama untuk mengatur nama pelanggan
     * @param nama untuk mengubah nama pelanggan
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    
    /**
     * getNama untuk mendapatkan nama pelanggan
     * @return this.nama untuk mengembalikan informasi dasar dari nama pelanggan
     */
    public String getNama()
    {
        return this.nama;
    }

    /**
     * setInput untuk mengatur inputan saat memilih menu dan jumlah
     * @param i sebagai inisialisasi inputan untuk mengubah inputan
     */
    public void setInput(double i)
    {
        this.input = i;
    }

    /**
     * getInput untuk mendapatkan inputan pelanggan
     * @return this.input untuk mengembalikan informasi dasar dari inputan pelanggan
     */
    public double getInput()
    {
        return this.input;
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
     * @param harga untuk mengubah harga makanan sesuai dengan jumlah yang diinput
     */
    public void setHarga(double harga)
    {
        this.harga = harga;
    }

    /**
     * setJumlah untuk menetapkan nilai jumlah
     * @param j sebagai inisialisasi untuk mengubah jumlah pesanan
     */
    public void setJumlah(int j)
    {
        this.jumlah = j;
    }

    /**
     * getHarga untuk mendapatkan nilai jumlah
     * @return this.harga untuk mengembalikan informasi dasar harga makanan
     */
    public int getJumlah()
    {
        return this.jumlah;
    }

    /**
     * setTotal untuk menetapkan nilai total
     * @param total untuk mengubah total pesanan
     */
    public void setTotal(double total)
    {
        this.total = total;
    }
    
    /**
     * getHarga untuk mendapatkan nilai total harga
     * @return this.total untuk mengembalikan informasi dasar total harga pesanan
     */
    public double getTotal()
    {
        return this.total;
    }
}
