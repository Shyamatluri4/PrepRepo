import java.util.Scanner;
public class AllPrimeNumber extends PrimeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int sum=0;
        System.out.println("The prime numbers between 0 to "+num+" are :");
        for(int i=0;i<num;i++){
            if(isprime(i)){
                System.out.print(i+ " ");
                sum+=i;
            }
        }
        System.out.println();
        System.out.println("Sum of all prime numbers btw 0 and "+num+" is : "+sum);
        sc.close();
    }
}
