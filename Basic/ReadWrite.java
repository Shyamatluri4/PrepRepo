import java.io.*;

public class ReadWrite {
    public static void main(String[] args) {
        String filename = "Numbers.txt";
        File obj = new File("NumbersSeperated.txt");
        String outputfile = "NumbersSeperated.txt";

        try{
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputfile));
            String line;
            while((line=reader.readLine())!=null){
                if(line.trim().isEmpty()) continue;

                int num;
                try{
                    num = Integer.parseInt(line.trim());
                }
                catch(NumberFormatException e){
                    writer.write("Invalid number");
                    writer.newLine();
                    continue;
                }
                
                String type = (num % 2==0) ? "Even" :"Odd";
                String prime = isprime(num) ? "Prime" : "NotPrime"; 

                writer.write(num+ " is "+type+" and "+prime);
                writer.newLine();

            }

            writer.close();
            reader.close();
        }
        catch(IOException e){
            System.out.println("An error ocuured");
            e.printStackTrace();
        }
    }

    public static boolean isprime(int number){
        if(number<=1) return false;
        if(number==2) return true;
        int sqrt = (int)Math.sqrt(number);
        for(int i=2;i<=sqrt;i++){
            if(number%i==0) return false;
        }
        return true;
    }
}
