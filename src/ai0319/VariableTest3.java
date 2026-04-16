package ai0319;

public class VariableTest3 {
    public static void main(String[] args) {
        int n1, n2;
        double result;

        n1 = 300;
        n2 = 500;

        result = (double) n1 / n2;

        //ㄷ 한자 덧셈 곱셉 나누기 표현 //.2 뒤에 몇번째 소수점까지 나타내겠다
        System.out.printf("%d ÷ %d = %.2f" , n1 , n2, result);
    }
}