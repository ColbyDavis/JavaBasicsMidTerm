/**
 * Created by CXD4916 on 5/10/2017.
 */
public class Question12_1 {

    public int divByZero() {

        int num1 = 1;
        int num2 = 0;

        try {
            return num1 / num2;
        }catch(ArithmeticException ae){
            System.out.println("Can't divide by 0...");
        }
        // I still do not understand why we return -1
        return -1;
        }

    }
