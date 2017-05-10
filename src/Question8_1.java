/**
 * Created by CXD4916 on 5/10/2017.
 */
public class Question8_1 {

    public String myName = "Colby Davis";
    public int counter = 0;

    public void replaceCharacters() {

        char[] arryChar = myName.toCharArray();
        for (int i = 0; i < arryChar.length; i++) {
            if (arryChar[i] == 'a' ||
                    arryChar[i] == 'e' ||
                    arryChar[i] == 'i' ||
                    arryChar[i] == 'o' ||
                    arryChar[i] == 'u' ||
                    arryChar[i] == 'A' ||
                    arryChar[i] == 'E' ||
                    arryChar[i] == 'I' ||
                    arryChar[i] == 'O' ||
                    arryChar[i] == 'U') {
                arryChar[i] = '9';
                counter++;


            }
            System.out.print(arryChar[i]);

        }
        System.out.println("\n"+counter);

    }
}





