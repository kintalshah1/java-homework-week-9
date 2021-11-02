import java.util.ArrayList;

/*
7. Write a Java program to test an array list is empty or not. Define array list with
underground tube names

 */
public class Answer7 {

    public static void main(String[] args) {

        // ArrayList of String type
        ArrayList<String> list = new ArrayList<>();

        // Checking whether the list is empty
        System.out.println("Is ArrayList Empty: " + list.isEmpty());

        // Adding Integer elements
        list.add("Harrow & Wealdstone");
        list.add("Kenton");
        list.add("South Kenton");
        list.add("North Wembley");
        list.add("Wembley Central");
        list.add("Stonebridge Park");

        // Checking again for the list is empty or not
        System.out.println("Is Arraylist Empty: " + list.isEmpty());

        // Displaying elements of the list
        for (String str : list) {
            System.out.println(str);
        }
    }
}
