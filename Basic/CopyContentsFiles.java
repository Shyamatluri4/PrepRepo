import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyContentsFiles {
    public static void main(String[] args) {

        File file = new File("Copyfile.txt");
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader("filecreation.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("CopyFile.txt"));

            String line=reader.readLine();
            while(line!=null){
                if(line.isEmpty()) continue;
                writer.write(line);
                writer.newLine();
            }

            reader.close();
            writer.close();

        }
        catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
