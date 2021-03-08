package practice_repl_it;

import java.util.Scanner;

public class PersonalInfo {
    public static void main(String[] args) {

        String firstName, lastName, fullName,email, street,
                state, city, address, contacts;
        int age, zipcode;
        double height, weight;
        boolean isMarried;
        long workPhoneNumber, personalPhoneNumber;

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!\nPlease enter your personal information\nEnter your first name");
        firstName = scan.next();
        System.out.println("Enter your last name");
        lastName = scan.next();
        System.out.println("Enter your email");
        email = scan.next();
        System.out.println("Enter your street");
        street = scan.next();
        System.out.println("Enter your city");
        city = scan.next();
        System.out.println("Enter your  state");
        state = scan.next();
        System.out.println("Enter your zip code");
        zipcode = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your work phone number");
        workPhoneNumber = scan.nextLong();
        scan.nextLine();
        System.out.println("Enter your phone number");





    }
}
