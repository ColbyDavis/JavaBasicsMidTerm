/**
 * Created by CXD4916 on 5/8/2017.
 */

/* 6.	Create a method that receives an integer argument from 0-100 and returns your test grade in a String format. (10 points)
a.	Example: Input = 79	Output = “Your score of 79 got you a C.”
 */

public class Question6 {
    public static final int myScoure = 79;

    public static void main(String[] args) {
        if (myScoure == 100) {
            System.out.println("Nice job! 100 Score!!");}
        else if (myScoure >= 90 && myScoure <= 99) {
            System.out.println("You received an A");
        } else if (myScoure >= 80 && myScoure <= 89) {
            System.out.println("You received an B");
        } else if (myScoure >= 70 && myScoure <= 79) {
            System.out.println("Your score of 79 got you a C");
        }   else {
            System.out.println("You failed!!");
        }

        }



    }


