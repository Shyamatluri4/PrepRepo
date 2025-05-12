 
 public class NoOfDigits{
    public static void main(String[] args) {
        
        int num = 3245, count=0;
        while(num>0){

            num/=10;
            count++;
            
        }
        System.out.println("no of digits "+count);
    }
}