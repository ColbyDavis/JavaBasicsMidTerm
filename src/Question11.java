/**
 * Created by CXD4916 on 5/8/2017.
 */
/* 11.	Create me a class called ClassA that uses inheritance with ClassB and implements InferfaceA. (5 points)
a.	Requirements: Add Constants to Interface (at least one)
 */
public class Question11 implements Question11_I{

    public static void main(String[] args) {
        int value1 = Question11_I.firstValue;
        int value2 = Question11_I.secondValue;
        int total = value1+value2;

        System.out.println(total);

    }

    }

