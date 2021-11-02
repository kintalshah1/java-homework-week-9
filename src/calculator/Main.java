
package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculator calculator =new Calculator();
        char ch;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter First number:");
            int a =scanner.nextInt();
            System.out.println("Enter second number:");
            int b =scanner.nextInt();

            Scanner scanner1 =new Scanner(System.in);
            System.out.println(" Please enter one of symbol +, - , *, /,:");
            String str = scanner1.nextLine();

            char symbol =str.charAt(0); //String to char conversion

            calculator.calculationResult(a,b,symbol);
            System.out.println("Would you like to do more calculation then please enter \"Y\"  or \"N\":");
            String str1 =scanner1.nextLine();
            ch =str1.charAt(0);

        }while (ch =='Y' || ch == 'y');


    }



}





