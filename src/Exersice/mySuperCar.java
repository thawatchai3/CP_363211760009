package Exersice;

import Lab7.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class mySuperCar {
    public static void main(String[] args) {
        ArrayList<SuperCar>  mycar = new ArrayList<SuperCar>();
        Scanner sc = new Scanner(System.in);

        System.out.println(" SuperCar?: ");
        int num_car = sc.nextInt();

        //input data
        mycar= inputData(mycar, num_car);

        //display data
        displayData(mycar);
    }

    private static void displayData(ArrayList<SuperCar> mycar) {
        System.out.println("Data object below:");
        for (SuperCar car:mycar ){
            System.out.println(car.toString());

        }
    }

    private static ArrayList<SuperCar> inputData(ArrayList<SuperCar> mycar, int num_car) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter SuPerCar info below: ");

        for (int i = 0; i <num_car ; i++) {
            System.out.println("Enter SuPerCar brand: ");
            String brand = sc.nextLine();
            System.out.println("Enter SuPerCar color: ");
            String color = sc.nextLine();
            System.out.println("Enter SuPerCar engine zine: ");
            String enginezine = sc.nextLine();
            System.out.println("Enter SuPerCar max speed: ");
            String maxspeed = sc.nextLine();
            System.out.println("Enter SuPerCar country of origin: ");
            String countryoforigin = sc.nextLine();
            System.out.println("Enter SuPerCar superCar: ");
            String superCar = sc.nextLine();
            mycar.add(new SuperCar(brand, color, enginezine,Integer.parseInt(maxspeed ),Integer.parseInt(countryoforigin ),superCar));
        }
        return mycar;

    }
}//class
