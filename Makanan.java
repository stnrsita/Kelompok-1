/**
 * Write a description of class Makanan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Makanan
{
    String nama;
    double harga;

    public Makanan() {
        
    }
    
    public Makanan(String n , double h){
        this.nama = n;
        this.harga = h;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    public abstract void display1();

    public void display(){
        System.out.println(this.nama+" : " +"$"+this.harga);
    }
}
