import java.util.Scanner;

public class Route {
    String name;
    static int number;

    public BusStop[] createRoute(String[] allBusStops) {
        Scanner sc = new Scanner(System.in);

        UI.hr();
        System.out.println("————————————————— ALL BUS STOPS: ——————————————————");
        UI.hr();
        for (int i = 0; i < allBusStops.length; i++) {
            System.out.println(i + "-" + allBusStops[i]);
        }

        UI.hr();
        UI.blankLine();
        System.out.println("Please enter the index number of the FIRST stop\non the route from the above bus stop list:");
        int beginIndex = sc.nextInt();
        System.out.println("Please enter the index number of the LAST stop\non the route from the above bus stop list:");
        int endIndex = sc.nextInt();

        number++;
        name = "Route" + number + ": " + allBusStops[beginIndex] + "-" + allBusStops[endIndex];

        BusStop busStops[] = new BusStop[endIndex-beginIndex+1];

        for (int i = 0; i < busStops.length; i++) {
            BusStop durak = new BusStop(i + 1, allBusStops[i + beginIndex]);
            busStops[i] = durak;
        }
        return busStops;
    }
}
