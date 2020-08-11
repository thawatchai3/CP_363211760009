package Exersice;

import java.util.Scanner;

public class Exercise_lab2_3 {
    //global variable
    public  static  final  double PI = 3.141;
    public  static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of circle : ");
        double r = scanner.nextDouble();
        double v = (4 / 3) * PI *r *r *r;
        System.out.println("The capcity of circle is : "+v);




    }

}
