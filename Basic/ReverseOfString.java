import java.util.Scanner;
public class ReverseOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String input = sc.nextLine().trim();
        int n = input.length();
        System.out.print("Reverse of the String is : ");
        System.out.println(reverse(input,n));
        sc.close();
    }    
    
    public static String reverse(String string,int length){
        String r="";
        for(int i=0;i<length;i++){
            char ch = string.charAt(i);
            r=ch+r;
        }
        return r;
    }
}
