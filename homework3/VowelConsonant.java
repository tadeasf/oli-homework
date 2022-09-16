package homework3;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        System.out.println("Enter a character:");
        Scanner input = new Scanner(System.in);
        char x;
        x = input.next().charAt(0);

        /*
        if(Character.isLetter(x))
            if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E'
                || x == 'I' || x == 'O' || x == 'U' || x == 'Y' || x == 'y' )
            System.out.println(x + " is Vowel");
            else
                System.out.println(x + " is Consonant");
        else{
            System.out.println(x + " is not a Character");
        }
        */


        switch (x) {
            case 'e', 'i', 'o', 'u', 'a', 'A', 'E', 'I', 'O', 'U', 'y', 'Y' -> System.out.println(x + " is a Vowel");
            case 'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','z',
                    'B','C','D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Z' ->
                    System.out.println((x + "is a Non-Vowel Character"));
            default -> System.out.println(x + " is not a Character");
        }

        // we are using Y/y as a vowel here, can be removed
        // in switch statement, we are using the 'dumb' method of finding whether input is a character or not
        // reason: we could do if/else statement for input and then do the switch with simpler cases
        // but we should do either if/else or switch. thus I opted for this version of the switch statement

    }
}
