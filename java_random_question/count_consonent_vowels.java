import java.util.Scanner;

public class count_consonent_vowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str=str1.replace(" ",""); //this line for removing space
        int vowels=0;
        int consonant=0;
        for(int i=0;i<str.length();i++){
            if("AEIOUaeiou".indexOf(str.charAt(i))!=-1){
                vowels++;
            }
            else{
                consonant++;
            }

        }
        System.out.println("vowels are : "+vowels );
        System.out.println("consonant are : "+consonant );
    }
    
    
}
