import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountTextFile{
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("mergedfile.txt"));

            int wordcount=0;
            int charcount=0;
            String line;
            int linecount=0;
            while ((line=reader.readLine())!=null) {
                line=line.trim();
                if(!line.isEmpty()){
                     linecount++;
            
                    for(char ch : line.toCharArray()){
                        
                        if(Character.isLetter(ch)){
                            charcount++;
                        }
                    }
                    String[] words = line.trim().split("\\s+");
                    wordcount += words.length;
                }
            }

            System.out.println("Lines : "+ linecount);
            System.out.println("Words : "+ wordcount);
            System.out.println("Characters : "+ charcount);
            reader.close();
        }
        catch(IOException e){
            System.out.println("An error ocurred");
            e.printStackTrace();
        }
    }
}