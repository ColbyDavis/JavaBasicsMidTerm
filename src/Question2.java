/**
 * Created by CXD4916 on 5/8/2017.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Question2 {

    // 2.	Create a class called MyClass (Question2), with a main method that prints in new lines the following array of values (5 points)
    // a.	Apple, Orange, Pineapple, Banana, Berry, Peach

    public static void main(String[] args) {
        String[] fruit = new String[6];
        fruit[0] = "Apple";
        fruit[1] = "Orange";
        fruit[2] = "Pineapple";
        fruit[3] = "Banana";
        fruit[4] = "Berry";
        fruit[5] = "Peach";

        for (int i = 0; i < fruit.length; i++) {
            String element = fruit[i];
            System.out.println(element);
        }

        System.out.println("------------------------");


        String[] fruit2 = {"Apple", "Orange", "Pineapple", "Banana", "Berry", "Peach"};
        for (int i = 0; i < fruit2.length; i++){
            String element = fruit2 [i];
            System.out.println(element);

        }
    }

}

