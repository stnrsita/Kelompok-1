public class Appetizer extends Makanan
{
    String nama;
    double harga;

    public Appetizer() 
    {
        
    }
    
    public Appetizer(String n , double h)
    {
        this.nama = n;
        this.harga = h;

    }

    @Override
    public String getNama() 
    {
        return nama;
    }

    public void setNama(String nama) 
    {
        this.nama = nama;
    }
    
    public double getHarga() 
    {
        return harga;
    }

    @Override
    public void setHarga(double harga) 
    {
        this.harga = harga;
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
        System.out.println(this.nama+" : "+ "$" + this.harga);
    }
}