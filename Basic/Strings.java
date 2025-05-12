import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string 1 : ");
        String string1 = sc.nextLine();
        System.out.print("Enter the string 2 : ");
        String string2 = sc.nextLine();

        // length of the string
        int len1 = string1.length();
        System.out.println("length of string1 : "+len1);
        int len2 = string2.length();
        System.out.println("length of string2 : "+len2);

        //comparing the 2 strings
        if(string1.equals(string2)){
            System.out.println("Both the strings are same.");
        }
        else{
            System.out.println("String1 and String2 are not same.");
        }

        String string3 = string1.concat(string2);
        System.out.println("After concatenation : "+string3);
        sc.close();
    }
}
