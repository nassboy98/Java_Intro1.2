package qa.automation;

import java.util.Scanner;

public class MyFirstClass {

    public static void main(String[] args) {
        //writes the text in the console
        System.out.println("Please enter your first name");

        //Scanner is class for reading values from the console
        Scanner scanner = new Scanner(System.in);

        //a string variable that will store the value entered from the user
        String firstName = scanner.next();

    System.out.println("Your name is: " + firstName);

        System.out.println("Please, enter your age:");

        //a integer variable that store the age from the user
        int userAge = scanner.nextInt();

        //"\n" is new line in the print
        System.out.println("Your name is: " + firstName +
                "\nYour age is: " + userAge);

        if (userAge >= 18){
            System.out.println(firstName + " can buy alcohol!!!");
        }
        if (userAge < 18){
            System.out.println(firstName + " can't buy alcohol!!!");
        }
        if (userAge >= 65){
            System.out.println(firstName + " is retired");

        }
    }

}
