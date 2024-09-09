import java.util.Arrays;

public class reverse_number {
    public static void main(String[] args) {
        int num=360828997;
        int a=num;
        //using string as output 
        String str="";
        while(a!=0){
            int digit=a%10;
            str=str+Integer.toString(digit);
            a=a/10;
        }
        System.out.println(str);

        //using integer as output
        int n=0;
        while(num!=0){
            n=n*10+num%10;
            num=num/10;
        }
        System.out.println(n);
    }
    
}
