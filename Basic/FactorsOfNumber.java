import java.util.Scanner;
public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = Math.abs(sc.nextInt());

        System.err.print("The factors of "+num+" are : ");
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                System.out.print(i+ ", ");
            }
        }System.out.print(num);
        sc.close();
    }
}
