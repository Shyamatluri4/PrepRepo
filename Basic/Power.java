import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        System.out.print("Enter the power : ");
        int power = sc.nextInt();

        //double result = Math.pow(num,power);

        for(int i=1;i<power;i++){
         num*=num;
        }

        System.out.println("The result is : "+num);

        sc.close();
    }
}
