import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckLeapyear {
    public static void main(String [] args){
//        while (true){
//            checkLeafyear(getYear());
//        }
        for (int i=0;i<2018;i++){
            checkLeafyear(i);
        }
     }
    public static int getYear(){
        int a =0;
        while (true){
            System.out.printf("\nPlease input the year : \n" );
            try{
                Scanner s = new Scanner(System.in);
                a = s.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.printf("Your input is not int, please try again!\n");
            };
        }

        System.out.printf("You just input the year of : "+a+"\n" );
//        int b = s.nextInt();
        return a;
    }
    public static void checkLeafyear(int yearValue){
        if ((yearValue%100==0 && yearValue%400==0)||(yearValue%100!=0 && yearValue%4==0)){
            System.out.printf("\nYear "+yearValue+" is leap year!");
        }else {
//            System.out.printf("\nSorry, year "+yearValue+" is NOT leap year!");
        }
    }
}
