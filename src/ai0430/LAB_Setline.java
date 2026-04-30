package ai0430;

public class LAB_Setline {
    public static void main(String[] args) {
        int fact = 1 ;
        int friends = 5;
        for(int i = 1; i <= friends ; i++){
           fact = fact * i ;

        }
        System.out.println("A,B,C,D,E 학생들이 순서대로 세우는 경우의 수는:"+ fact);
    }
}
