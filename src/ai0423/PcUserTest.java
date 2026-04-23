package ai0423;

import java.util.Scanner;

public class PcUserTest {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);


        System.out.print("나이를 입력하세요 :");
        int age = s.nextInt();

        if(age >=19)
            System.out.println("즐거운 시간 보내세요");
        else
            System.out.println("집에 갈 시간입니다.");
        System.out.println("협조 감사합니다");


        s.close();

    }
}
