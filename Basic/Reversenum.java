import java.util.Scanner;
public class Reversenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int temp = Math.abs(num);
        int reversednum=0;
        while(temp>0){
            int digit = temp%10;
            reversednum=reversednum*10+digit;
            temp/=10;
        }
        System.out.println("Reverse of the number is : "+reversednum);
        sc.close();
    }
}
