import java.util.Scanner;
public class MaxMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n=sc.nextInt();
        int[] array = new int[n];
        
        System.out.println("Enter the numbers : ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }

        int h=array[0],l=array[0];
        for(int j : array){
            if(j>h){
                h=j;
            }
            if(j<l){
                l=j;
            }
        }

        System.out.println("The highest number in the array is : "+h);
        System.out.println("The lowest number in the array is : "+l);
        sc.close();
    }
}
