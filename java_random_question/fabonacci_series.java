import java.util.*;
import java.util.logging.Logger;

public class fabonacci_series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int zero=0;
        int one=1;
        System.out.print(zero+" ");
        System.out.print(one+" ");
        for(int i=2;i<n;i++){
            System.out.print(zero+one+" ");
            int fakezero=zero;
            zero=one;
            one=fakezero+one;
        }

    }
    
}
