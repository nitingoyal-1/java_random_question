import java.util.*;
public class anagram {
    public static void main(String[] args) {
        String str="silent";
        String str1="listen";
        char []arr=str.toCharArray();
        char []arr1=str1.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        System.out.println(Arrays.equals(arr, arr1));
    }
    
}
