package ai0514;

import java.util.Scanner;

public class BMITest2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);//문자열 입력용
        System.out.println("=======BMI지수======");
        while (true) {
            System.out.println("체중을(kg,실수값) 소수점으로 입력해주세요:");
            double weight = s.nextDouble();

            System.out.println("키를을(cm, 실수값소)수점으로 입력해주세요:");
            double height = s.nextDouble();

            System.out.print("성명입력(exit:프로그램 종료):");
            String name = s1.nextLine();
            if(name.equals("exit"))
                break;

                double bmi = weight / Math.pow(height / 100, 2); //((height/100)*(height/100))

                if (bmi < 18.5) {
                    System.out.printf("%s님은 저체중입니다\n", name);
                    System.out.println("식단과 운동을 통해 체중을 늘려주세요");
                } else if (bmi <= 22.9) {
                    System.out.printf("%s님은 정상체중입니다\n", name);
                    System.out.println("정상 범위 체중입니다 운동을 병행하여 근육량을 늘려주세요");
                } else if (bmi <= 24.9) {
                    System.out.printf("%s님은 과체중입니다\n", name);
                    System.out.println("과체중 입니다 운동을 병행하여 지방을 줄이고 근육량을 늘려주세요");
                } else if (bmi <= 29.9) {
                    System.out.printf("%s님은 1단계비만입니다\n", name);
                    System.out.println("1단계비만 입니다 운동을 병행하여 지방을 줄이고 근육량을 늘려주세요");
                } else {
                    System.out.printf("%s님은 2단계비만입니다\n", name);
                    System.out.println("2단계비만 입니다 운동을 병행하여 지방을 줄이고 근육량을 늘려주세요");
                }


                System.out.printf("%s님의 BMI 지수 결과 : %.2f㎏/㎡입니다.", name, bmi);




            }
        s.close();
        s1.close();
        }
    }