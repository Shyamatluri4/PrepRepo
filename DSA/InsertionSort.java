public class InsertionSort {
    public static void main(String[] args) {
        int[] array={6,7,5,8,2,1};

        for(int i=1;i<array.length;i++){
            int j=i-1;
            int current=array[i];
            while(j>=0 && current<array[j]){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=current;
        }

        System.out.println(" sorted array using insertion sort");
        for(int i : array){
            System.out.print(i+" ");
        }
    }
}
