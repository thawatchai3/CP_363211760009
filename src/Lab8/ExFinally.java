package Lab8;

import java.io.*;

public class ExFinally {
    public static void main(String[] args) {
        File myFile = new File("myFile.txt");
        BufferedReader reader = null;


        try {
            reader = new BufferedReader(new FileReader(myFile));
            String txt = null;

            while ((txt = reader.readLine ()) !=null){
                //display
                System.out.println(txt);
            }//while
        } catch (FileNotFoundException e) {
            System.out.println("File could not found.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Can not read text from file.");
            e.printStackTrace();
        }


    }//main
}//class
