package css.ch;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.beans.IntrospectionException;
import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(30)+1;
        int tries = 0;
        Scanner sc = new Scanner(System.in);
        int guess;
        boolean win = false;

        System.out.println("Start");

        while (win == false ) {
            System.out.println("Rate eine Zahl.");
            guess = sc.nextInt();
            tries++;

            if (guess == randomNumber) {
                win = true;
            } else if (guess < randomNumber) {
                System.out.println("higher");
            } else if (guess > randomNumber) {
                System.out.println("lower");
            }
        }
        System.out.println("You win");
        System.out.println("The number was "+randomNumber);
        System.out.println("it took you "+tries+" tries");
    }
}



