import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        if(isprime(num)){
            System.out.println(num+" is a prime number.");
        }
        else{
            System.out.println(num+" is not a prime number.");
        }
        sc.close();
    }
        
    public static boolean isprime(int number){
    
        if(number<=1){
            return false;
        }
        else{
            for(int i=2;i<=Math.sqrt(number);i++){
                if(number%i==0){
                    return false;
                }
            }
        }
        return true;
    }    
}
