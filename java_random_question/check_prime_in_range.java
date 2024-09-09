public class check_prime_in_range {
    public static void main(String[] args) {
        int src=10;
        int dest=50;
        while(src!=dest){
            boolean b=true;
            for(int i=2;i<src/2;i++){
                if(src%i==0){
                    b=false;  
                    break;
                }
            }
            if(b){
                System.out.print(src+" ");
            }
            src++;
        }
    }
    
}
