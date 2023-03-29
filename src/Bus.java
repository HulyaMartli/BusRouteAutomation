import java.util.Scanner;

public class Bus {
    String name;
    Route route;
    BusStop busStops[];
    static int index;

    public Bus(Route route,String[] allBusStops) {
        this.route=route;
        busStops=route.createRoute(allBusStops);
        name = route.name.replace("Route","");
        System.out.println("Please press ENTER to continue.");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
    }

    public void otobusBilgileri(){
        index++;
        UI.blankLine();
        UI.hr();
        System.out.println("\""+"00"+name+"\" name was\nassigned to bus"+index+" and its' route generated as\n\""+route.name+"\".\nBus stops of route \""+route.name+"\":");
        UI.hr();
        for (BusStop stop : busStops) {
            System.out.println(stop.number+"-"+stop.name);
        }
        UI.hr();
        UI.blankLine();


    }
}
