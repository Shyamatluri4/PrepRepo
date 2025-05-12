import java.util.Scanner;
public class NoOfAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String string = sc.nextLine();
        int n = string.length();

        int alphabetcount=0,digitcount=0,specialcount=0;
        for(int i=0;i<n;i++){
            char ch = string.charAt(i);

            if(Character.isLetter(ch)){
                alphabetcount++;
            }
            else if(Character.isDigit(ch)){
                digitcount++;
            }
            else{
                specialcount++;
            }
        }
        System.out.println("Number of alphabets are : "+alphabetcount);
        System.out.println("Number of digits are : "+digitcount);
        System.out.println("Number of special characters are : "+specialcount);
        sc.close();
    }
}
