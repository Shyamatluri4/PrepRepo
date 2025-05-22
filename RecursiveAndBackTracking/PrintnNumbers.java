package RecursiveAndBackTracking;
import java.util.Scanner;

public class PrintnNumbers {
    public static void num(int b,int c){

        if(b>c){
            return;
        }

        System.out.println(b);
        num(b+1, c);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int a=1;
        num(a,n);

        sc.close();
    }
}
