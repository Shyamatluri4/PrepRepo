import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergingFiles {
    public static void main(String[] args) {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader("filecreation.txt"));
            BufferedReader reader2 = new BufferedReader(new FileReader("Copyfile.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("mergedfile.txt"));

            String line;
            while((line=reader1.readLine())!=null){
                if(line.isEmpty()) continue;
                writer.write(line);
                writer.newLine();
            }

            while((line=reader2.readLine())!=null){
                writer.write(line);
                writer.newLine();
            }

            reader1.close();
            reader2.close();
            writer.close();

            System.out.println("Files merged successfully");

        }

        catch(IOException e){
            System.out.println("An error ocuured");
            e.printStackTrace();
        }
    }
}
