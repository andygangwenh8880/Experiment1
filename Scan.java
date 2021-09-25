import java.util.Scanner;
import java.lang.Math;

class Scan {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // make this print "Hello Github Classroom"
        // make sure you can compile+run it in your terminal!
        System.out.println("Hello! Welcome to Github Classroom!");
        System.out.println("What is your name?");
        String name;
        name = scan.nextLine();
        System.out.println("It's nice to meet you " + name + "!");

    }
}
