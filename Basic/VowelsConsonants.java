import java.util.Scanner;
public class VowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String string = sc.nextLine();
        int n = string.length();
        string = string.toLowerCase();
        int vowelscount = 0,consonantcount=0;

        for(int i=0;i<n;i++){
            char ch = string.charAt(i);

            if(Character.isLetter(ch)){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowelscount++;
                }
                else{
                    consonantcount++;
                }
            }
        }
        System.out.println("Vowels : "+vowelscount+" \nConsonants : "+consonantcount);
        sc.close();
    }
}
