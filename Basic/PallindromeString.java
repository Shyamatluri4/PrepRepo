import java.util.*;

public class PallindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word : ");
        String name = sc.nextLine();

        // using regular expression we reduce the string by removing empty spaces. 
        String cleaninput = name.replaceAll("[^a-z A-Z 0-9]","").toLowerCase();
        
        int len = cleaninput.length();
        boolean ispallindrome = true;

        for(int i=0;i<len/2;i++){
            if(name.charAt(i) != name.charAt(len-1-i)){
                ispallindrome=false;
                break;
            }
        }

        if(ispallindrome){
            System.out.println("Its a pallindrome.");
        }
        else{
            System.out.println("Its not a pallindrome.");
        }
        sc.close();
    }
}
