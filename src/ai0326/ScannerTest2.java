package ai0326;

import java.util.Scanner;

public class ScannerTest2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("출생년도를 입력해주세요:");

        int num =s.nextInt();
        int num1 = 2026;
        int num2 = num1 - num ;



        System.out.println("본인의 현재 나이는" + num2 +"입니다.");
        s.close();

    }
}
