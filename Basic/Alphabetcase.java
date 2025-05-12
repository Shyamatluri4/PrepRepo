import java.util.*;

public class Alphabetcase {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        //System.out.print("enter the character : ");
     //   char i = sc.next().charAt(0);

       // if(Character.isUpperCase(i)){
       //     System.out.println("it is Upper case");
       // }
       // else if (Character.isLowerCase(i)) {
      //      System.out.println("it is Lower case");
      //  }
      //  else{
        //    System.out.println("Not a Character");
       // }
    
      //  sc.close();
    
      System.out.print("Enter the string : ");  
      String word = sc.nextLine();
        
      boolean allUpperCase=true;  
      
      for(int i=0;i<word.length();i++){
            
            char ch = word.charAt(i);
            if(Character.isLetter(ch)  && !Character.isUpperCase(ch)){
                allUpperCase=false;
                break;
            }
      }
        
      if(allUpperCase){
                System.out.println("all characters in the string are uppercase.");
            }
      else{
                System.out.println("not all characters are upper case.");
            }
        
    sc.close();
    }
}
