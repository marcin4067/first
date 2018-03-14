/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counteraplication;

import java.util.Scanner;

/**
 *
 * @author marcin7500
 */
public class CounterAplication {

    public static void main(String[] args) {
        int choice;
        Counter sheep = new Counter();
        Scanner stdin = new Scanner(System.in);

        System.out.println("Welcome to the Tally Counter application");
        System.out.println("1 = Increment, 2 = Reset, 0 = Exit");
        do {
            System.out.println("Current value of counter = " + sheep.value());
            System.out.print("Next action: ");
            choice = stdin.nextInt();
            if (choice == 1) {
                sheep.increment();
            } else if (choice == 2) {
                sheep.reset();
            } else if (choice != 0) {
                System.out.println("Error: Valid choices are 0, 1 or 2");
            }
        } while (choice != 0);
        System.out.println("Goodbye");
    }
}

