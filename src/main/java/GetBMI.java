import java.util.InputMismatchException;
import java.util.Scanner;

public class GetBMI {
    public static void main(String [] args){
        float a = getFloat("tall (cm)");
        float b = getFloat("weigth (kg)");
        getBMI(a/100,b);
    }
    public static float getFloat(String type){
        float a =0;
        while (true){
            System.out.printf("Please input your " + type +" value: \n" );
            try{
                Scanner s = new Scanner(System.in);
                a = s.nextFloat();
                if (a<0.1) {
                    System.out.printf("Your input value is too small, please try again! \n");
                }else {
                    break;
                }
            }catch (InputMismatchException e){
                System.out.printf("Your input is invalid, please try again!\n");
            };
        }

        System.out.printf("Your " + type +" value is:"+a+"\n" );
//        int b = s.nextInt();
        return a;
    }
    public static void getBMI(float heigth, float weigth){
        float bmi = weigth/(heigth*heigth);
        System.out.printf("你的BMI 值是："+bmi+"\n");
        if (bmi<18.5){
            System.out.printf("体重过轻！");
        }else if (bmi<24){
            System.out.printf("正常范围");
        }else if (bmi<27){
            System.out.printf("体重过重");
        }else if (bmi<30){
            System.out.printf("轻度肥胖");
        }else if (bmi<35){
            System.out.printf("中度肥胖");
        }else if (bmi>=35){
            System.out.printf("重度肥胖");
        }
    }
}
