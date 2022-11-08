/**
 * Write a description of class Makanan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Makanan
{
    private String nama;
    private int harga;
    
    public abstract String getNama();
    
    public abstract void setHarga(double harga);
    
    public void display1(){};
    
    public void display(){};
    
    public void setNama(String nama) 
    {
        this.nama = nama;
    }
    
     public double getHarga() 
    {
        return harga;
    }
}