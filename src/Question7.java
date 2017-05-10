/**
 * Created by CXD4916 on 5/8/2017.
 */
/* 7.	Create a main method that loops through a double array of integers. The loop should output the value of the greatest number. (10 points)
a.	Requirements: Row > 5 and Col > 5
b.	Define your double array
*/

public class Question7 {


    public static void main(String[] args) {
        int ROWS = 5;
        int COLUMNS = 5;
        int largestNumber = 0;

        int[][] newArray = {
                {0,1,2,3,4},
                {6,7,8,9,10},
                {12,13,14,15555,16},
                {18,19,20,21,2233333},
                {22,23,24,25,556666666}
        };


        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++)
                if (newArray[i][j] > largestNumber) {
                    largestNumber = newArray[i][j];
                }
        }
        System.out.println("Largest value of the 2D Array " + largestNumber);
    }

        }




