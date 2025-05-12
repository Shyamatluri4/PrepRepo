import java.util.*;

public class Grading{
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Physics marks : ");
        int p =sc.nextInt();
        System.out.print("Chemistry marks : ");
        int c = sc.nextInt();
        System.out.print("Biology marks : ");
        int b = sc.nextInt();
        System.out.print("Mathematics marks : ");
        int m = sc.nextInt();
        System.out.print("Computers marks : ");
        int com = sc.nextInt();

        //getting the total and percentage
        
        int total = p+c+b+m+com;
        double percentage = total/5;
        System.out.println("The percentage is : "+ percentage+ "%");

        //grading the students 

        int gradeswitch = (int) percentage/10;
        switch (gradeswitch) {
            case 9:
                System.out.println("Grade : A");
                break;
            case 8:
                System.out.println("Grade : B");
                break;
            case 7:
                System.out.println("Grade : C");
                break;
            case 5:
            case 6:
                System.out.println("Grade : D");
                break;
            case 4:
                System.out.println("Grade : E");
                break;
        
            default:
                System.out.println("FAIL");
                break;
        }

        sc.close();
    }
}
