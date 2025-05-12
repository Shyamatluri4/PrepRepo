import java.util.*;

public class Fibanocci {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("number : ");
        int n = sc.nextInt();

        int a=0,b=1;

        if(n>1){
            for(int i=0; i<n; i++){

                System.out.print(a+ " ");
                int temp=b;
                b=b+a;
                a=temp;

            }
        }
        else{
            System.out.println("invalid number.");
        }
        sc.close();
    }
}
