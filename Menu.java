import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu{

    public static void main(String[] args) {
        System.out.println();
        Scanner s = new Scanner(System.in);
        Pemesan p = new Pemesan();
        System.out.print("Input nama pemesan : ");
        String namaPemesan;
        namaPemesan = s.nextLine();
        s.close();
        System.out.println();
        p.setNama(namaPemesan);

        System.out.println("+-------------------------------------+");
        System.out.println("|        Today's Special Menu         |");
        System.out.println("+-------------------------------------+");
        System.out.println();
               
        Makanan a1 = new Appetizer("Bruschetta",25.00);
        Makanan a2 = new Appetizer("Fried Calamari", 18.00);
        Makanan a3 = new Appetizer("Shrimp Scampi", 20.00);
        List<Makanan> AppetizerList = new ArrayList<>();

        AppetizerList.add(0,a1 );
        AppetizerList.add(1,a2);
        AppetizerList.add(2,a3);

        a1.display1();
        for(Makanan Appetizer : AppetizerList){
            Appetizer.display();
        }
    
        Makanan mc1 = new MainCourse("Butter Chicken", 40.00);
        Makanan mc2 = new MainCourse("Beef Barley Soup", 45.00);
        Makanan mc3 = new MainCourse("Shrimp Pesto Pasta", 43.00);
        List<Makanan> MainCourseList = new ArrayList<>();

        MainCourseList.add(0,mc1);
        MainCourseList.add(1,mc2);
        MainCourseList.add(2,mc3);

        System.out.println();
        mc1.display1();
        for(Makanan MainCourse : MainCourseList){
            MainCourse.display();
        }

        Makanan d1 = new Dessert("Costro Tiramisu", 15.00);
        Makanan d2 = new Dessert("Chocolate Maple", 10.00);
        Makanan d3 = new Dessert("Apple Pie", 10.00);
        List<Makanan> DessertList = new ArrayList<>();

        DessertList.add(0,d1);
        DessertList.add(1,d2);
        DessertList.add(2,d3);

        System.out.println();
        d1.display1();
        for(Makanan Dessert : DessertList){
            Dessert.display();
        }
        System.out.println();
    }
}


