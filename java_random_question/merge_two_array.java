import java.util.Arrays;

public class merge_two_array {
    public static void main(String[] args) {
        int arr1[]={2,3,4,5,6};
        int arr2[]={45,6,7,8,9,7};
        //using basic method
        int arr[]=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            arr[i]=arr1[i];
        }
        for(int i=arr1.length,k=0;i<arr1.length+arr2.length;i++,k++){
            arr[i]=arr2[k];
        }
        System.out.println(Arrays.toString(arr));

        //using merge function
        int merger_arr[]=new int[arr1.length+arr2.length];
        System.arraycopy(arr1, 0, merger_arr, 0, arr1.length);
        System.arraycopy(arr2, 0, merger_arr, arr1.length, arr2.length);
        System.out.println(Arrays.toString(merger_arr));
    }
    
}
