public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {4,2,7,8,5,1};


        for(int i=0;i<array.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<array.length;j++){
                if(array[smallest]>array[j]){
                    smallest=j;
                }
            }
            int temp=array[i];
            array[i]=array[smallest];
            array[smallest]=temp;
        }

        System.out.println("sorted array by selection sort");
        for(int i : array){
            System.out.print(i+" ");
        }
    }
}
