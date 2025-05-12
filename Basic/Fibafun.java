import java.util.*;

public class Fibafun{

    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return(fibonacci(n-1)+fibonacci(n-2));
    
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("number : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(fibonacci(n));
    }
}