import java.util.*;
import java.io.*;

public class ReadFile extends CreateFile{
    public static void main(String[] args) {
        //try{
            
            /*File obj = new File("filecreation.txt");
            Scanner sc = new Scanner(obj);

            while(sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }

            sc.close();    */

            String file = "filecreation.txt";
            try(BufferedReader reader = new BufferedReader(new FileReader(file))){

                String line;
                while((line=reader.readLine())!=null){
                    System.out.println(line);
                }
            }
        //}
        catch(IOException e){
            System.out.println("An error has occured.");
            e.printStackTrace();
        }
    }   
}


