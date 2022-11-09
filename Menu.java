import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu{
    public static void main(String[] args){
        System.out.println();
        Scanner s = new Scanner(System.in);
        Pemesan p = new Pemesan();
        System.out.print("Input nama pemesan : ");
        String namaPemesan;
        namaPemesan = s.nextLine();
        System.out.println();
        p.setNama(namaPemesan);
        double h1, h2, h3, h4, h5, h6, h7, h8, h9;
        double harga = 0;


        while(true){
        System.out.println("+-------------------------------------+");
        System.out.println("|        Today's Special Menu         |");
        System.out.println("+-------------------------------------+");
        System.out.println();
               
        Appetizer a1 = new Appetizer("1.1 Bruschetta",25.0);
        Appetizer a2 = new Appetizer("1.2 Fried Calamari", 18.0);
        Appetizer a3 = new Appetizer("1.3 Shrimp Scampi", 20.0);
        
        List<Appetizer> AppetizerList = new ArrayList<>();

        AppetizerList.add(0,a1 );
        AppetizerList.add(1,a2);
        AppetizerList.add(2,a3);

        a1.display1();
        for(Appetizer Appetizer : AppetizerList){
            Appetizer.display();
        }
    
        MainCourse mc1 = new MainCourse("2.1 Butter Chicken", 40.0);
        MainCourse mc2 = new MainCourse("2.2 Beef Barley Soup", 45.0);
        MainCourse mc3 = new MainCourse("2.3 Shrimp Pesto Pasta", 43.0);
        List<MainCourse> MainCourseList = new ArrayList<>();

        MainCourseList.add(0,mc1);
        MainCourseList.add(1,mc2);
        MainCourseList.add(2,mc3);

        System.out.println();
        mc1.display1();
        for(MainCourse MainCourse : MainCourseList){
            MainCourse.display();
        }

        Dessert d1 = new Dessert("3.1 Costco Tiramisu", 15.0);
        Dessert d2 = new Dessert("3.2 Chocolate Maple", 10.0);
        Dessert d3 = new Dessert("3.3 Apple Pie", 10.0);
        List<Dessert> DessertList = new ArrayList<>();

        DessertList.add(0,d1);
        DessertList.add(1,d2);
        DessertList.add(2,d3);

        System.out.println();
        d1.display1();
        for(Dessert Dessert : DessertList){
            Dessert.display();
        }

        System.out.println();
        System.out.print(" Number of menu : ");
        double i;
        int n;
        i = s.nextDouble();
        p.setInput(i);
        System.out.print(" Quantity : ");
        n = s.nextInt();
        p.setJumlah(n);
                
        if (i == 1.1){
            h1 = a1.getHarga()*p.getJumlah();
            p.setTotal(harga += h1);
            System.out.print(" Price : " +  h1);
            System.out.println();
            System.out.println(" Total Price : " + harga);
    
        }

        else if (i == 1.2){
            h2 = a2.getHarga()*p.getJumlah();
            p.setTotal(harga += h2);
            System.out.print(" Price : " +  h2);
            System.out.println();
            System.out.println(" Total Price : " + harga);    
        }

        else if (i == 1.3){
            h3 = a3.getHarga()*p.getJumlah();
            p.setTotal(harga += h3);
            System.out.print(" Price : " +  h3);
            System.out.println();
            System.out.println(" Total Price : " + harga);    
        }
            
        else if (i == 2.1){
            h4 = mc1.getHarga()*p.getJumlah();
            p.setTotal(harga += h4);
            System.out.print(" Price : " +  h4);
            System.out.println();
            System.out.println(" Total Price : " + harga);    
        }
            
        else if (i == 2.2){
            h5 = mc2.getHarga()*p.getJumlah();
            p.setTotal(harga += h5);
            System.out.print(" Price : " + h5);
            System.out.println();
            System.out.println(" Total Price : " + harga);    
        }
            
        else if (i == 2.3){
            h6 = mc3.getHarga()*p.getJumlah();
            p.setTotal(harga += h6);
            System.out.print(" Price : " +  h6);
            System.out.println();
            System.out.println(" Total Price : " + harga);    
        }
            
        else if (i == 3.1){
            h7 = d1.getHarga()*p.getJumlah();
            p.setTotal(harga += h7);
            System.out.print(" Price : " +  h7);
            System.out.println();
            System.out.println(" Total Price : " + harga);    
        }
            
        else if (i == 3.2){
            h8 = d2.getHarga()*p.getJumlah();
            p.setTotal(harga += h8);
            System.out.print(" Price : " +  h8);
            System.out.println();
            System.out.println(" Total Price : " + harga);    
        }
            
        else if (i == 3.3){
            h9 = d3.getHarga()*p.getJumlah();
            p.setTotal(harga += h9);
            System.out.print(" Price : " +  h9);
            System.out.println();
            System.out.println(" Total Price : " + harga);
    
        }
        
        System.out.println();
        System.out.println("\n+-------------------------------------+");
        System.out.println("|        You want to order again?     |");
        System.out.println("|                 1. Yes              |");
        System.out.println("|                 2. No               |");
        System.out.println("+-------------------------------------+");
        System.out.println();
        System.out.print("Enter your choice (1/2): ");
        int pesanLagi = s.nextInt();
        if (pesanLagi <1 || pesanLagi == 2 || pesanLagi > 2 ) {
            System.out.println("\n ^_^ THANK YOU FOR COMING ^_^");
            s.close();
            System.exit(1);
            System.err.println();
        }
        }
    }
}
