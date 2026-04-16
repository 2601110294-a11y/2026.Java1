package ai0402;

import java.util.Scanner;

public class LAB1 {
    public static void main(String[] args) {
        int result, result1, result2,result4 ;
        double result5 ;
        Scanner s = new Scanner (System. in);


        System.out.print("정수1 ==>:");
        int num = s.nextInt();

        System.out.print("정수2 ==>:");
        int num1 = s.nextInt();

        result = num + num1 ;
        result1 = num - num1 ;
        result2 = num * num1 ;
        result5 = (double)num / num1 ;
        result4 = num % num1 ;

        System.out.printf("%d + %d = %d\n", num, num1, result);
        System.out.printf("%d - %d = %d\n", num, num1, result1);
        System.out.printf("%d × %d = %d\n", num, num1, result2);
        System.out.printf("%d ÷ %d = %.2f\n", num, num1, result5);
        System.out.printf("%d %% %d = %d\n", num, num1, result4);









    }
}
