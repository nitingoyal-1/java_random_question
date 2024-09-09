import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class remove_duplicate_element_from_array {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,6,6,4,3,2,3,4,5,5};

        //using hashset

        HashSet <Integer> hashSet=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hashSet.add(arr[i]);
        }
        System.out.println(hashSet);

        //using arraylist
        ArrayList <Integer> arrlist=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(!arrlist.contains(arr[i])){
                arrlist.add(arr[i]);
            }
        }
        System.out.println(arrlist);

        



    }
    
}
