import java.util.HashMap;
import java.util.Scanner;
public class HighestFrequencyCharacterInAString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String input = sc.nextLine().toLowerCase().replaceAll("\\s+", "");

        HashMap<Character,Integer> visited = new HashMap<>();

        for(char ch : input.toCharArray()){

            visited.put(ch,visited.getOrDefault(ch,0)+1);
        }

        char maxchar = ' ';
        int maxcount=0;
        for(char ch : visited.keySet()){
            if(visited.get(ch)>maxcount){
                maxcount=visited.get(ch);
                maxchar=ch;
            }
        }

        System.out.println("the highest frequency character is "+maxchar+" with frequency "+maxcount);
        sc.close();
    }
}