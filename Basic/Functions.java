import java.util.*;

public class Functions {
    public static int add(int a, int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("first number : ");
        int a = sc.nextInt();
        System.out.print("second number : ");
        int b = sc.nextInt();
        
        int sum = add(a, b);
        System.out.println("the sum is "+sum);
        sc.close();
    }

}