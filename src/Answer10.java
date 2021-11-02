/*
10. Write the programme that tell you which line pass through particular stations.
Just use Zone 1 stations name

 */

import java.util.HashMap;
import java.util.Scanner;

public class Answer10 {

    public static void main(String[] args) {
        char result;

        System.out.println("London Underground Zone1 Stations:");

        System.out.println("London Bridge,Southwark,Westminster,Victoria,Marble Arch,Oxford Circus,Bond Street,Baker Street");

        //HashMap object for zone
        HashMap<String, String> zone = new HashMap<String, String>();
        zone.put("London Bridge", "Jubilee Line & Northern Line");
        zone.put("Southwark", "Jubilee Line");
        zone.put("Westminster", "Jubilee Line");
        zone.put("Victoria", "Central Line");
        zone.put("Marble Arch", "Jubilee Line");
        zone.put("Oxford Circus", "Jubilee Line & Bakerloo Line & Victoria Line");
        zone.put("Bond Street", "Jubilee Line & Central Line");
        zone.put("Baker Street", "Jubilee Line & Bakerloo Line");

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter any station name:");
            String stationName = scanner.nextLine();

            //For each loop to display station name and tube lines
            for (String str : zone.keySet()) {
                if (stationName.equals(str)) {

                    System.out.println("Tube Lines:" + zone.get(str));
                }
            }
            System.out.println(" ");
            System.out.println("Do you want to try again 'Y' or 'N':");
            result = scanner.next().charAt(0);
        } while (result == 'Y' || result == 'y');

    }

}

