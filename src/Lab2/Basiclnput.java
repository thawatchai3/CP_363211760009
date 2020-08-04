package Lab2;

import java.util.Scanner;

public class Basiclnput {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.println("What is your name? : ");
        name = scanner.nextLine();
        System.out.println("Your name is "+name);

        System.out.println("what is your major? : ");
        String major = scanner.nextLine();
        System.out.println("Your major is "+major);

        System.out.println("What You is age? : ");
        String age = scanner.nextLine();
        System.out.println("You is age"+age);

        System.out.println("What is you email? ; ");
        String email = scanner.nextLine();
        System.out.println("You is email"+email);


    }//main


}//mail
