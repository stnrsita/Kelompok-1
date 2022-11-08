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
               
        Appetizer a1 = new Appetizer("Bruschetta",25.00);
        Appetizer a2 = new Appetizer("Fried Calamari", 18.00);
        Appetizer a3 = new Appetizer("Shrimp Scampi", 20.00);
        List<Appetizer> AppetizerList = new ArrayList<>();

        AppetizerList.add(0,a1 );
        AppetizerList.add(1,a2);
        AppetizerList.add(2,a3);

        System.out.println("+-------------------------------------+");
        System.out.println("|        Today's Special Menu         |");
        System.out.println("+-------------------------------------+");
        System.out.println();
    
        a1.display1();
        for(Appetizer Appetizer : AppetizerList){
            Appetizer.display();
        }
    
        MainCourse mc1 = new MainCourse("Butter Chicken", 40.00);
        MainCourse mc2 = new MainCourse("Beef Barley Soup", 45.00);
        MainCourse mc3 = new MainCourse("Shrimp Pesto Pasta", 43.00);

        List<MainCourse> MainCourseList = new ArrayList<>();

        MainCourseList.add(0,mc1);
        MainCourseList.add(1,mc2);
        MainCourseList.add(2,mc3);

        System.out.println();
        mc1.display1();
        for(MainCourse MainCourse : MainCourseList){
            MainCourse.display();
        }

        Dessert d1 = new Dessert("Costro Tiramisu", 15.00);
        Dessert d2 = new Dessert("Chocolate Maple", 10.00);
        Dessert d3 = new Dessert("Apple Pie", 10.00);

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
    }
}


