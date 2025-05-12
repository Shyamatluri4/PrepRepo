import java.util.Scanner;
public class FirstLastOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String input = sc.nextLine().trim().replaceAll("\\s+", "");
        System.out.print("Enter the first occurance character to be found : ");
        String felement = sc.nextLine();
        System.out.print("Enter the last occurance character to be found : ");
        String lelement = sc.nextLine();
        int a = input.lastIndexOf(lelement);
        int n = input.indexOf(felement);
        if(n>0 && a>0){
            System.out.print("The first occurance of the element is in : "+(n+1)+" position\n The last occurance of the Element is in : "+(a+1)+" position");
        }
        else{
            System.out.println("Element not found.");
        }
        sc.close();
    }
}
