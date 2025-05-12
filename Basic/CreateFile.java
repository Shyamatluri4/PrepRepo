import java.io.*;

public class CreateFile {
        public static void main(String[] args) {
          //  try{
                File obj = new File("filecreation.txt");

            /*     if(obj.createNewFile()){
                    System.out.println("file created : "+obj.getName());
                }
                else{
                    System.out.println("file not created");
                }
            }   

            catch(IOException e){
                System.out.println("An error occured");
            }  */


            try{
                FileWriter writer = new FileWriter("filecreation.txt");
                writer.write("The file is created successfully");
                writer.close();
            }
            catch(IOException e){
                System.out.println("An erroe occured");
                e.printStackTrace();
            }
        }    
}
