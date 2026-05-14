package ai0514;

import java.util.Random;

public class LAB {
    public static void main(String[] args) {
        int dice1 ,dice2,dice3;
        int count =0;

        Random random = new Random();
        while (true){

         dice1 = random.nextInt(6) +1;
         dice2 = random.nextInt(6) +1;
         dice3 = random.nextInt(6) +1;
            count ++ ;
        if(dice1== dice2 && dice2 == dice3){
            System.out.println("3개의 주사위는 모두 " + dice1 +"입니다");
            System.out.println("같은 숫자가 나올때까지 " +count + "번 던졌습니다");
            break;
        }




        }
    }

}