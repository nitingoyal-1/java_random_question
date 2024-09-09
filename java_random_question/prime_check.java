import java.util.Scanner;

public class prime_check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean b=true;
        int a=sc.nextInt();
        for(int i=2;i<a/2;i++){
            if(a%i==0){
                b=false;
                break;
            }
        }
        if(b){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
    
}
