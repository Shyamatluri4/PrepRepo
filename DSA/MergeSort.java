
public class MergeSort {
    public static void conquer(int[] arr,int f,int mid, int l){
        int[] merged = new int[l-f+1];
        
        int idx1 = f;
        int idx2 = mid+1;
        int x=0;

        while(idx1<=mid && idx2<=l){
            if(arr[idx1]<arr[idx2]){
                merged[x++]=arr[idx1++];
            }
            else{
                merged[x++]=arr[idx2++];
            }
        }

        while (idx1<=mid) {
            merged[x++]=arr[idx1++];
        }

        while(idx2<=l){
            merged[x++]=arr[idx2++];
        }

        for(int i=0,j=f;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }

    }
    public static void divide(int[] arr, int f, int l){
        if(f>=l){
            return;
        }
        
        int mid = f+(l-f)/2;
        divide(arr, f, mid);   // first half
        divide(arr, mid+1, l);  //second half

        conquer(arr, f, mid, l);
    }

    public static void main(String[] args) {
        int[] arr = {6,7,3,5,8,9};
        int n=arr.length;

        divide(arr, 0, n-1);
        System.out.print("Sorted array using merge sort is : ");
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
