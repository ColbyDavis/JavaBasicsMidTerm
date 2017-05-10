import java.util.Random;

/**
 * Created by CXD4916 on 5/8/2017.
 */

/* 5.	Create a method that returns a random number from 1-100 (3 points)
*/

public class Question5 {

    public static void main(String[] args) {

            Random r = new Random();
            int randomInt = r.nextInt(100) + 1;
            //
        System.out.println("Random Number is "+ randomInt);

        }


    }

