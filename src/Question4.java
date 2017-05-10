import java.lang.reflect.Array;

/**
 * Created by CXD4916 on 5/8/2017.
 */

/* 4.	Create a method that returns back the largest number in an array of integers (5 points)
a.	The method should receive an array of integers
*/

public class Question4 {

    public static void main(String[] args) {
        int [] findLargest = {1,2,3,4,5,6,7,8,9,1000};
        int largest = findLargest[0];

        for(int index = 1; index < findLargest.length; index++){
            if(findLargest[index] > largest){
                largest = findLargest[index];
            }
        }
        System.out.println("Largest number is = " +largest);

    }
}
