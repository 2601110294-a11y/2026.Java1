package ai0326;

import java.util.Scanner;

public class BMIProgram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);//문자열 입력용
        System.out.println("=======BMI지수======");
        System.out.println("체중을(kg,실수값) 소수점으로 입력해주세요:");


         double weight=s.nextDouble();

        System.out.println("키를을(cm, 실수값소)수점으로 입력해주세요:");
         double height =s.nextDouble();

        System.out.print("성명입력:");
        String name = s1.nextLine();

         double bmi = weight / Math.pow(height/100, 2); //((height/100)*(height/100))



        System.out.printf("%s님의 BMI 지수 결과 : %.2f㎏/㎡입니다.",name , bmi);

        s.close();
        s1.close();



    }
}
