import java.util.Scanner;
public class AllOccurancesInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String input= sc.nextLine().trim().replaceAll("\\s+", "");

        System.out.print("Enter the element to be found : ");
        char element = sc.next().charAt(0);

        System.out.println("Occurances of the Character in the String are At : ");
        for(int i=0;i<input.length();i++){
            char ch= input.charAt(i);

            if(ch==element){
                System.out.println("Position : "+(i+1));
            }
        }

        sc.close();
    }
}
