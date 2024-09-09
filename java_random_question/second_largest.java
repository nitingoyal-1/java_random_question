public class second_largest {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,99,2,41};
        int large=0;
        int sec_large=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                sec_large=large;
                large=arr[i];
            }
            else if(arr[i]>sec_large && sec_large!=large){
                sec_large=arr[i];
            }
        }
        System.out.println(sec_large);
    }
    
}
