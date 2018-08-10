import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckSeason {
    public static void main(String [] args){
//        while (true){
//            checkLeafyear(getYear());
//        }
        for (int i=0;i<13;i++){
            checkSeason(i);
        }
     }
    public static int getMonth(){
        int a =0;
        while (true){
            System.out.printf("\nPlease input the month (eg: 1 for Jan): \n" );
            try{
                Scanner s = new Scanner(System.in);
                a = s.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.printf("Your input is not int, please try again!\n");
            };
        }

        System.out.printf("You just input the month of : "+a+"\n" );
//        int b = s.nextInt();
        return a;
    }
    public static void checkSeason(int monthValue){
        String orderName = "th";
        String [] seasonList = new String[]{
                "Spring","Summer","Fall","Winter"
        };
        String [] monthList = new String[]{
          "","Jan","Feb","Mar","Arg","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"
        };
        if (monthValue>0 && monthValue <13){
            switch (monthValue){
                case 1:
                    orderName = "st";break;
                case 2:
                    orderName = "nd";break;
            }
            System.out.printf(monthList[monthValue]+" is the "+ monthValue+orderName+" month, which is in Season: "+ seasonList[monthValue/4]+"\n");
        } else {
            System.out.printf("\nThe month of " +monthValue+" not exist!\n");
        }
    }
}
