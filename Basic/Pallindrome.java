import java.util.Scanner;

public class Pallindrome{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int originalnum = num;
        int reversednum = 0;
        while(num>0){
            int digit = num%10;

            reversednum=(reversednum*10)+digit;
            num/=10;
        }

        if(originalnum==reversednum){
            System.out.println("Its a pallindrome");
        }
        else{
            System.out.println("Its not a pallindrome");
        }
        sc.close();
    }
}
