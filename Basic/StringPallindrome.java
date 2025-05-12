import java.util.Scanner;
public class StringPallindrome extends ReverseOfString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String input = sc.nextLine().trim();
        int n = input.length();
        String reversedString = reverse(input, n);
        System.out.print("Reverse of the string is : ");
        System.out.println(reversedString);

        if(reversedString.equalsIgnoreCase(input)){
            System.out.println("It is a Pallindrome.");
        }
        else{
            System.out.println("It is not a Pallindrome.");
        }
        sc.close();
    }
}


