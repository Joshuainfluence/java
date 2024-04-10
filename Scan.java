import java.util.Scanner;

public class Scan {
    public static void main(String[] args){
        Scanner scaner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scaner.nextLine();
        System.out.println("How old are you? ");
        int age = scaner.nextInt();
        System.out.println("Hello " + name);
        System.out.println("You are " + age + "years old");
    }
}
