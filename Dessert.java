public class Dessert extends Makanan{

    public Dessert(String n, double h) {
        super(n, h);
    }

    @Override
    public void display1() {
        System.out.println("\tSpecial Desserts\t");
        System.out.println("--------------------------------------");       
    }

    public void display(){
        System.out.println(super.nama+" : "+ "$" + super.harga);
    }
    
}
