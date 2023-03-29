import java.util.Scanner;

public class UI {
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        blankLine();
        hr();
        System.out.println("▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢");
        System.out.println("▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢");
        System.out.println(" ▢▢▢▢▢▢▢▢▢ BUS ROUTE AUTOMATION ▢▢▢▢▢▢▢▢▢▢ ");
        System.out.println("▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢");
        System.out.println("▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢");
        hr();
        System.out.println("Please, press ENTER to start the automation.");
        sc.nextLine();
    }

    public static void blankLine(){
        System.out.println();
    }

    public static void hr(){
        System.out.println("——————————————————————————————————————————————————");
    }

    public static void title(int index){
        String [] titles = {"————————— Bus 1 - Route Assignment —————————", "————————— Bus 2 - Route Assignment —————————", "————————— Bus 3 - Route Assignment —————————"};
        hr();
        System.out.println(titles[index]);
        hr();
        blankLine();

    }
}
