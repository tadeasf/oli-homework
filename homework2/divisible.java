package homework2;

import java.util.Scanner;

public class divisible {

    public static void main(String[] args) {
        System.out.println("Enter two integer numbers:");
        Scanner input = new Scanner(System.in);
        int x;
        x = input.nextInt();
        int y;
        y = input.nextInt();
        if (x % y==0) {
            System.out.println("evenly divisible");
        }
        else{
            if (y % x==0) {
                System.out.println("evenly divisible");
            }
            else{
                System.out.println("not evenly divisible");
            }
        }
    }
}
