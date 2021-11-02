/*

4. Write a Java program to create a new array list, add some colours (string) and
printout the collection using for each loop
 */


import java.util.ArrayList;

class Answer4 {

     public static void main(String[] args) {

         ArrayList<String> colours = new ArrayList<>();

         colours.add("Pink");
         colours.add("White");
         colours.add("Orchid");
         colours.add("Black");
         colours.add("Purple");
         colours.add("Chocolate");
         colours.add("Yellow");
         colours.add("Wheat");
         colours.add("Turquoise");
         colours.add("Maroon");

         for (String data : colours) {
             System.out.println(data);
         }

     }
}
