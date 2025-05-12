import java.util.*;
public class DigitFrequency{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        int temp=Math.abs(num);
        
        int[] array = new int[10];

        while (temp>0) {
            int digit = temp%10;
            array[digit]++;
            temp/=10;
        }

        for(int i=0;i<10;i++){
            if(array[i]!=0){
                System.out.println("Frequency of "+i+" in the number is : "+array[i]);
            }
        }
        sc.close();
    }
}    