import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckFactorial {
    public static void main(String [] args){
        for (int i=1;i<40;i++){
            getFactorial(i);
        }

     }
    public static int getInt(){
        int a =0;
        while (true){
            System.out.printf("\nPlease input the int number : \n" );
            try{
                Scanner s = new Scanner(System.in);
                a = s.nextInt();
                if (a<1){
                    System.out.printf("\nThe number you input "+a+" is too small , please try again!");
                }else if (a>10000){
                    System.out.printf("\nThe number you input "+a+" is too big , please try again!");
                }else {
                    break;
                }
            }catch (InputMismatchException e){
                System.out.printf("Your input is not int, please try again!\n");
            };
        }

        System.out.printf("You just input the number : "+a+"\n" );
//        int b = s.nextInt();
        return a;
    }
    public static void getFactorial(int inputNumber1){
        int inputNumber = inputNumber1;
        long factorialValue = inputNumber;
        String formula ;
        formula = ""+inputNumber;
        while (inputNumber>1){
            factorialValue = factorialValue*(inputNumber-1);
            inputNumber--;
            formula +="*"+inputNumber;
        }
        System.out.printf("Ther factorial of "+inputNumber1+ " is : \n"+formula+"="+factorialValue+"\n");

    }
}
