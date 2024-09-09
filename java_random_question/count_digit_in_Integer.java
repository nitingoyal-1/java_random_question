import java.util.*;
public class count_digit_in_Integer {
    public static void main(String[] args) {
        //basic method
        int num=930802;
        int c=0;
        while(num!=0){
            num =num/10;
            c++;
        }
        System.out.println(c);

        //using string
        int num1=930801;
        String str=Integer.toString(num1);
        System.out.println(str.length());


    }
    
}
