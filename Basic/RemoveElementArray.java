import java.util.Scanner;
public class RemoveElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n =sc.nextInt();
        int[] array = new int[n];
        
        System.out.println("Enter the numbers : ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
    
        }

        System.out.print("Enter the element to be removed : ");
        int num = sc.nextInt();
        int count=0;
        for(int j=0;j<n;j++){
            if(array[j]==num){
                count++;
            }
        }
        int k=0;
        int[] newarray = new int[n-count];
        for(int j : array){
            if(j!=num){
                newarray[k++]=j;
            }
        }
        for(int i : newarray){
            System.out.print(i+" ");
        }
        sc.close();
    }    
}
