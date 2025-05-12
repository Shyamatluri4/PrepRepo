import java.util.Scanner;
public class CopyElementsToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n=sc.nextInt();
        int[] array = new int[n];
        
        System.out.println("Enter the numbers : ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }

        int[] newarray = new int[n];
        System.out.println("The new array is : ");
        for(int j=0;j<n;j++){
            newarray[j]=array[j];
            System.out.print(newarray[j]+" ");
        }
        sc.close();

    }
}
