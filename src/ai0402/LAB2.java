package ai0402;

import java.util.Scanner;

public class LAB2 {
    public static void main(String[] args) {
        double num , num2,result ,result1;

        Scanner s = new Scanner(System.in);
        System.out.print("파운더리 (lb)입력하세요 (kg)변환해줍니다:");

        int pound = s.nextInt();

        System.out.print("킬로그램(kg)입력하세요 (lb)변환해줍니다.");
        int kg = s.nextInt();

        num  = 0.453592 ;
        num2 = 2.204623 ;
        result = pound * num ;
        result1 = kg * num2 ;

        System.out.printf("%d × %f = %.3f\n",pound ,num,result );
        System.out.printf("%d × %f = %.3f\n", kg , num2,result1);

        s.close();

    }
}
