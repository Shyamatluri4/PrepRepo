import java.util.Scanner;
public class PrimeFactors extends PrimeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("The prime factors of "+num+" are :");
        for(int i=2;i<num;i++){
            if(num%i==0 && isprime(i)){
                System.out.print(i +" ");
            }
        }
        sc.close();
    }
}
