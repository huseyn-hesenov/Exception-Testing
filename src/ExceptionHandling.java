import java.io.IOException;
import java.util.Scanner;


class MyException extends ArithmeticException{
    @Override
    public String getMessage() {
        return "bu menimkidir";
    }
}


public class ExceptionHandling {

    public static void main(String[] args){


try {
    System.out.println(4/0);

}catch (MyException myException){
    System.out.println( myException.getMessage());
}


    }
}
