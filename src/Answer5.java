import java.util.ArrayList;
import java.util.ListIterator;

public class Answer5 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);
        numbers.add(90);
        numbers.add(100);
        System.out.println("ArrayList: " + numbers);

        // Creating an instance of ListIterator
        ListIterator<Integer> iterate = numbers.listIterator();
        System.out.println("Iterating over ArrayList");
        while (iterate.hasNext()) {
            System.out.print(iterate.next()+ ", ");
        }

    }
}

