package ai0514;

public class GuGuDan2 {
    public static void main(String[] args) {
        int i, k ,result;
        for(i=1;i<10;i++){
            for(k=2;k<10;k++){
                System.out.printf("%d * %d = %d\t",k ,i ,i*k);
            }
            System.out.println("");
        }
        for(  i = 2; i <10; i++){
            for(k=1;k<10;k++){
                System.out.printf("%d X %d =%d\n",i,k,i*k);
            }
        }
    }
}


