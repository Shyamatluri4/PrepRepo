import java.util.Scanner;

public class FirstlastDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        Integer num = sc.nextInt();
        
        /*String number = num.toString();
         * 
         */
        
        
        int temp=Math.abs(num);
        int firstdigit=temp;
        int lastdigit = temp%10;
        while(firstdigit>=10){            
            firstdigit/=10;
        }
        System.out.println("The first digit of the number is : "+firstdigit);
        System.out.println("The last digit of the number is : "+lastdigit);
        System.out.println("The sum of first and last digits of the number is : "+(firstdigit+lastdigit));
    
        sc.close();
    }

}
