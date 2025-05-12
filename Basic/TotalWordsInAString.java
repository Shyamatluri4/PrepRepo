import java.util.Scanner;
public class TotalWordsInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String input = sc.nextLine().trim();
        //int wordcount = 1;
        
        if(input.isEmpty()){
            System.out.println("It is a empty string.");
            sc.close();
            return;
        }
        //for(int i=0;i<input.length();i++){
          //  char ch = input.charAt(i);
            //if(Character.isSpaceChar(ch) && Character.isLetter(input.charAt(i+1))){
              //  wordcount++;
            //}
        //}
        else{
            String[] words = input.split("\\s+");
            System.out.println("There are "+words.length+" words in the string.");
        }
        sc.close();
    }
}