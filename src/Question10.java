/**
 * Created by CXD4916 on 5/8/2017.
 */
/* 10.	Create me an Interface that has one of each: 1 abstract method, 1 default method and 1 static method (10 points)
a.	Requirements: Static method must be called from default method
 */

public class Question10 implements Question10_I {

    public static void main(String[] args) {

    }


    @Override
    public void abstractMethod() {

    }

    @Override
    public void defaultMethod() {
        Question10_I.staticMethod();


    }
}
