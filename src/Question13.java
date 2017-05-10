import java.io.IOError;
import java.io.IOException;

/**
 * Created by CXD4916 on 5/8/2017.
 */
/* 13.	Create a class called ClassA with a main method. Create a second class called ClassB that contains a method called indentifyClass.
ClassA calls for identifyClass. If you do not wrap ClassB’s method with a try/catch how else can you catch the exception?
Hint: be the lazy developer and the pro-active developer. (15 points)
 */

public class Question13 {

    public static void main(String[] args) {
        Question13_1 instantiation = new Question13_1();

        try {
            instantiation.indentifyClass();
        } catch (Throwable e) {
        }
    }
}
