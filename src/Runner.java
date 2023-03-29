import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                // London Metro (Tube) - Central Line stops are used as example
                String [] allBusStops = {"Mile End","Bethnal Green","Liverpool Street","Bank", "St. Paul's", "Chancery Lane", "Holborn", "Bond Street","Marble Arch", "Queens Way", "White city"};

                UI.menu();

                UI.title(0);
                Route route1 = new Route();
                Bus bus1 = new Bus(route1,allBusStops);


                UI.title(1);
                Route route2 = new Route();
                Bus bus2 = new Bus(route2,allBusStops);

                UI.title(2);
                Route route3 = new Route();
                Bus bus3 = new Bus(route3,allBusStops);

                System.out.println("Thank you! Names and routes of all the busses\nin the system are assigned.\n\nPlease, press ENTER to list buses' info.");
                sc.nextLine();


                bus1.otobusBilgileri();

                bus2.otobusBilgileri();

                bus3.otobusBilgileri();

        }
    }
