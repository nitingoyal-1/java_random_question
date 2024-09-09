import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str_main=sc.nextLine();
        
        //using loop
        String str=str_main.toLowerCase();
        String str1="";
        String str2="";
        for(int i=0;i<str.length()/2;i++){
            str1=str1+str.charAt(i);
        }
        if(str.length()%2==0){
            for(int i=str.length()-1;i>=str.length()/2;i--){
                str2=str2+str.charAt(i);
            }
        }
        else{
            for(int i=str.length()-1;i>str.length()/2;i--){
                str2=str2+str.charAt(i);
            }
        }
        
        if(str1.equals(str2)){
            System.out.println("yes it is palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }


        //using string builder or string buffer

        StringBuffer a=new StringBuffer(str_main).reverse();
        String a1=a.toString();
        if(str_main.equals(a1)){
            System.out.println("yes it is palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }



    }
    
}
