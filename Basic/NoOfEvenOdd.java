import java.util.Scanner;
public class NoOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n=sc.nextInt();
        int[] array = new int[n];
        
        System.out.println("Enter the numbers : ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }

        int even=0,odd=0;
        for(int j : array){
            if(j%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("No of even numbers in the array are : "+even);
        System.out.println("No of odd numbers in the array are : "+odd);
        sc.close();
    }
}
