package Lab5;

import java.util.Scanner;

public class BasicArray2D {
    public static void main(String[] args){

        int number[][] = new int[2][3]; //2*3 = 6 blocks

        //in put data to array 2D
        number = inputdata(number);
        //display data in array 2D
        displayarray(number);
        //find total value in array
        findTotalValue(number);
        //find max value
        findMaxValue(number);
        //find min value
        findMinValue(number);

    }

    private static void findMinValue(int[][] number) {
        int min = number[0][0];
        for (int i = 0; i < number.length; i++) {   //row
            for (int j = 0; j < number[i].length; j++) {    //column
                // condition
                if(min >= number[i][j]){
                    min = number[i][j];
    }
        }
            System.out.println("The minimum value: "+min);
    }
    }

    private static void findMaxValue(int[][] number) {
        int max = number[0][0];
        for (int i = 0; i < number.length; i++) {   //row
            for (int j = 0; j < number[i].length; j++) {    //column
                // condition
                if(max <= number[i][j]){
                    max = number[i][j];
                }
    }
        System.out.println("The maximum value: "+max);
        }

    }
    private static void findTotalValue(int[][] number) {
        int t = 0;
        for (int i = 0; i < number.length; i++) {   //row
            for (int j = 0; j < number[i].length; j++) {    //column

                t += t+number[i][j]; //t =t+number[i][j]


            }

        }
        System.out.println("Total value in array: " + t);
    }

    private static void displayarray(int[][] number) {
        System.out.println("Data in array 2D: ");
        for (int i = 0; i < number.length; i++) {   //row
            for (int j = 0; j < number[i].length; j++) {    //column
                System.out.print(number[i][j]+" "); //number[0][0]:



            }
            System.out.println();
        }
    }

    private static int[][] inputdata(int[][] number) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Pleaes, input integers to array 2D: ");
        for (int i = 0; i < number.length; i++) {   //row
            for (int j = 0; j < number[i].length; j++) {    //column
                System.out.print("number["+i+"]["+j+"]: "); //number[0][0]:
                number[i][j] = sc.nextInt();


            }

        }
        return number;
    }
}
