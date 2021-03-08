package Day01_string_input;

import java.util.Scanner;

public class UserInputDemo1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //system.in ia standard input stream
        System.out.println("Enter a string");
        String string = scan.nextLine();
        //scan.nextLine is reading string
        System.out.println("You have entered:"   + string);

    }
}
