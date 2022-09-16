package homework2;

import java.util.Scanner;

public class divisible {

    public static void main(String[] args) {
        System.out.println("Enter first integer number:");
        Scanner input = new Scanner(System.in);
        int x;
        x = input.nextInt();
        if (x % 2==0){
            System.out.println("The first integer number you entered is divisible by 2, thus evenly divisible");
        }
        else{
            System.out.println("The first integer number you entered is not evenly divisible");
        }

        System.out.println("Enter second integer number");
        Scanner input2 = new Scanner(System.in);
        int y;
        y = input2.nextInt();
        if (y % 2==0){
            System.out.println("The second integer number you entered is divisible by 2, thus evenly divisible");
        }
        else{
            System.out.println("The second integer number you entered is not evenly divisible");
        }

    }
}
