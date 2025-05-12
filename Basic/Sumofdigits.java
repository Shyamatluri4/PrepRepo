import java.util.Scanner;
public class Sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int digit=0;
        int sum=0;
        int product=1;
        int temp=Math.abs(num);

        while(temp>0){
            digit=temp%10;
            sum+=digit;
            product*=digit;
            temp/=10;
        }
        System.out.println("Sum of the digits of the number is : "+sum);
        System.out.println("Product of the digits in the number is : "+product);

        sc.close();
    }
}
