import java.util.InputMismatchException;
import java.util.Scanner;

public class GetSum {
    public static void main(String [] args){
        int a = getInt(1);
        int b = getInt(2);
        System.out.printf("\nSum is :" + (a+b));
    }
    public static int getInt(int order){
        int a =0;
        while (true){
            System.out.printf("Please input your " + order +" number: \n" );
            try{
                Scanner s = new Scanner(System.in);
                a = s.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.printf("Your input is not int, please try again!\n");
            };
        }

        System.out.printf("Your " + order +" number is:"+a+"\n" );
//        int b = s.nextInt();
        return a;
    }
}
