package ai0409;

public class PrintFormatest {
    public static void main(String[] args) {
        System.out.printf("%d\n",123);
        System.out.printf("%5d\n",123);
        System.out.printf("%05d\n",123);


        System.out.printf("난생처음 자바\n");
        System.out.println("난생처음 자바");
        System.out.printf("%30s","난생처음 자바\n");

        String s1 = "인공지\b능\'소프트웨어과\'";
        System.out.println(s1);

        String s2 = "한국\n폴리\\텍\n대\t\t\t학";//이스케이 문자
        System.out.println(s2);






    }
}
