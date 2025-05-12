import java.util.*;

public class LowestFrequecyChar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the string : ");
        String input = sc.nextLine().toLowerCase().replaceAll("\\s+", "");

        HashMap<Character,Integer> visited = new HashMap<>();
        for(char ch : input.toCharArray()){

            visited.put(ch,visited.getOrDefault(ch,0)+1);
        }
        
        char minchar = ' ';
        int mincount = Integer.MAX_VALUE;

        for(char ch : visited.keySet()){
            if(visited.get(ch)<mincount){
                mincount = visited.get(ch);
                minchar = ch;
            }
        }  

        // use case if multiple characters have least frequency
       
        /*  int minfre = Collections.min(visited.values());

        for(Map.Entry<Character,Integer> entry : visited.entrySet()){
            if(entry.getValue()==minfre){
                System.out.println("character "+entry.getKey()+" has appeared "+minfre+" times");
            }
        }   */

        System.out.println("the lowest frequency character is "+minchar+" with frequency "+mincount);
        sc.close();
    }
}
