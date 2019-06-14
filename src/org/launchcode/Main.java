package org.launchcode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello the world");
        Scanner in = new Scanner(System.in);
        System.out.println("whats your name?");
        String myname = in.nextLine();
        System.out.println("your name is":+myname);
    }
}
