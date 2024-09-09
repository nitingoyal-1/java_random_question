import java.util.Arrays;

public class largest_element {
    public static void main(String[] args) {
        int arr[]={4,5,6,32,2,4,4,5};
        int num=0;
        //using loop
        for(int i=0;i<arr.length;i++){
            if(arr[i]>num){
                num=arr[i];
            }
        }
        System.out.println(num);
        
        //using sorting method

        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);

    }
    
}
