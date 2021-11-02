
/*
9. Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.

 */

import java.util.HashMap;

public class Answer9 {

    public static void main(String[] args) {

        // HashMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        // Add keys and values (Players name & runs)
        people.put("Paresh", 9);
        people.put("Mitesh", 18);
        people.put("Jigar", 14);
        people.put("Kintal", 23);
        people.put("Jayendra", 26);

        for (String i : people.keySet()) {
            System.out.println("Key: " + i + " value: " + people.get(i));
        }
    }
}
