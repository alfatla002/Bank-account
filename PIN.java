package com.company;
import java.util.Random;
import java.util.Scanner;

class PIN {
    long pin;

    void getPin() {
        Random rand = new Random();
        pin = rand.nextInt(8999) + 1000;
        System.out.println("Your Pin: " + pin);
    }

    void checkPin() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your pin: ");

        int upin = input.nextInt();
        if (pin == upin) {
            System.out.println("Success - Balance: 10000 USD");
        } else {
            System.out.println("Wrong Pin");
        }
    }
}


