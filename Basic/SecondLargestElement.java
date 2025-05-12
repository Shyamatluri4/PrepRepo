import java.util.Scanner;
public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n=sc.nextInt();
        int[] array = new int[n];
        
        System.out.println("Enter the numbers : ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }

        int h=0,sh=0;
        for(int j : array){
            if(j>h){
                sh=h;
                h=j;                 
            }
            else if(j>h && j>sh){
                sh=j;
            }
        }

        System.out.println("The highest number in the array is : "+h);
        System.out.println("The second highest number in the array is : "+sh);
        sc.close();
    }
}
