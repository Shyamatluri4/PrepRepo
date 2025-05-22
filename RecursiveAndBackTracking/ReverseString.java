package RecursiveAndBackTracking;


import java.util.Scanner;

public class ReverseString {
    public static void printRev(String input,int n){
        if(n==0){
            return;
        }
        System.out.print(input.charAt(n-1));
        printRev(input,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String to be reversed : ");
        String input = sc.nextLine().trim();
        int n = input.length();
        System.out.print("Reverse of the String is : ");
        printRev(input,n);

        sc.close();
    }
}
