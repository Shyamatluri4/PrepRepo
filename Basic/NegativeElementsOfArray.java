import java.util.Scanner;
public class NegativeElementsOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array : ");
        int size = sc.nextInt();

        int[] array = new int[size];
        System.out.println("enter the elements of array : ");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }

        System.out.println("the negative elements in the array are : ");
        for(int j=0;j<size;j++){
            if(array[j]<0){
                System.out.println(array[j]);
            }
        }
        sc.close();
    }
}
