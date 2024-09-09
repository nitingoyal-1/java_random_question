import java.util.Arrays;
import java.util.Scanner;

public class sort_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        //brute_force_method
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        //using function
        Arrays.sort(arr);

        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
