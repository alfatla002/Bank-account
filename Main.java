package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int decision;
    PIN mypin = new PIN();
    Scanner input = new Scanner(System.in);
    System.out.println("Do you need a new Pin? YES: press 1/ NO: press 0");
    decision = input.nextInt();
    if(decision == 1){
        mypin.getPin();
        mypin.checkPin();
    }
    else {
        mypin.checkPin();
    }
    }
}
