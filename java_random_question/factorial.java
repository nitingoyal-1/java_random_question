import java.math.BigInteger;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=1;
        for(int i=a;i>0;i--){
            //for print the calculated value
            b=b*i;
            //for just printed the factorial series
            System.out.print(" "+i+"! * ");
        }
        System.out.println("the factorial of "+a+" is : "+b);


        //the upper code is valid for 11! instead we use long it gives upto 20! 
        //in this we use biginteger.
        
        BigInteger fact=BigInteger.ONE;
        for(int i=a;i>0;i--){
            fact=fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println("factorial is : "+fact);



    }
    
}
