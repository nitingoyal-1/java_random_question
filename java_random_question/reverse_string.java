import java.util.*;

class reverse_string{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        // using string buffer or string builder
        StringBuilder a1=new StringBuilder(a);
        System.out.println(a1.reverse());

        //using loop 
        for(int i=a.length()-1;i>=0;i--){
            System.out.print(a.charAt(i)+" ");
        }
        sc.close();
    
    }
}