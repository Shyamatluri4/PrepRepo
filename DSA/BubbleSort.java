
public class BubbleSort{
    public static void main(String[] args) {
        int[] array ={5,6,4,9,7,8};
        int len=array.length;
        int temp =0;
        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-i-1;j++){
                if(array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array by bubble sort : ");
        for(int b : array){
        System.out.print(b+" ");
       }
    }   
}