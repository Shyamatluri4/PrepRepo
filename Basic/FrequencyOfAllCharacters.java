import java.util.ArrayList;
import java.util.Scanner;
public class FrequencyOfAllCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String input = sc.nextLine().trim().replaceAll("\\s+", "");

        ArrayList<Character> visited = new ArrayList<>();
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            
            if (!visited.contains(ch)) {
                int count=0;
            
                for(int j=0;j<input.length();j++){
                
                    if(ch==input.charAt(j)){
                        count++;
                    }
                }
                visited.add(ch);
                System.out.println("The character "+ch+" has appeared "+count+" times.");
            }
        }
        sc.close();
    }
}
