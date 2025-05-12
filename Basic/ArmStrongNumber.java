import java.util.Scanner;
public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        String ch = String.valueOf(num);
        int count = ch.length();
        if(isArmStrong(num, count)){
            System.out.println("It is a ArmStrong Number.");
        }
        else{
            System.out.println("It is not a ArmStrong Number.");
        }

        
        sc.close();   
    }
    public static boolean isArmStrong(int number, int count){

        int originalnumber=number;
        int sum=0;
        while(number>0){
            int digit=number%10;
            sum+=Math.pow(digit,count);
            number/=10;
        }
        if(originalnumber!=sum){
            return false;
        }
        else{
            return true;
        }
    }
}
