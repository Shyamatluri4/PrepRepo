package RecursiveAndBackTracking;
import java.util.Scanner;

public class SumOfnNum {
    public static void printSum(int n,int a,int sum){
        if(a==n){
            sum+=a;
            System.out.println("the sum is : "+sum);
            return;
        }
        sum+=a;
        printSum(n, a+1,sum);
    }




    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n=sc.nextInt();
        int sum=0;
        int a=1;

        printSum(n, a, sum);
        sc.close();
    }
}
