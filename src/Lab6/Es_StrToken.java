package Lab6;

import java.util.StringTokenizer;

public class Es_StrToken {

    public static void main(String[] args) {

        String msg = "The Lord Buddha performs five daily activities as follows. At dawn, he surveys all beings to see who " +
            "he can go and teach on that day. He goes on an alms-round in the morning. He gives a Dhamma lecture to the " +
            "masses in the evening. He addvises his disciples at night. At midnight, he solves problems for celestial beings.";

        System.out.println(msg.length());

        StringTokenizer myToken = new StringTokenizer(msg);
        System.out.println(myToken.countTokens());  // return word count as integer

        while (myToken.hasMoreTokens()){
            System.out.println(myToken.nextToken());
        }




    }
}
