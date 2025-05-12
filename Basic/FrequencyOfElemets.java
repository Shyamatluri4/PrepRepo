import java.util.Scanner;
public class FrequencyOfElemets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n=sc.nextInt();
        int[] array = new int[n];
        
        System.out.println("Enter the elements : ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }

        boolean[] newarray = new boolean[n];
        for(int i=0;i<n;i++){
            if(newarray[i]){
                continue;
            }
            int count=1;
            for(int j=i+1;j<n;j++){
                if(array[i]==array[j]){
                    count++;
                    newarray[j]=true;
                }
            }
            if(count==1){
                System.out.println("The element "+array[i]+" is unique.");    
            }
            else{
                System.out.println("The element "+array[i]+" occured "+count+" times.");
            }
        }
        sc.close();
    }
}
