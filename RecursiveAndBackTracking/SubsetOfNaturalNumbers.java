package RecursiveAndBackTracking;


import java.util.ArrayList;

public class SubsetOfNaturalNumbers {
    public static void printSubsets(ArrayList<Integer> subset){
        for(int i : subset){
            System.out.print(i+ " ");
        }
        System.err.println();
    }
    
    public static void findSubsets(int n, ArrayList<Integer> subset){
        if(n==0){
            printSubsets(subset);
            return;
        }

        subset.add(n);
        findSubsets(n-1, subset);

        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);
    } 

    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> subset = new ArrayList<>();
        System.out.println("the subsets for n natural numbers : ");
        findSubsets(n,subset);
    }
}
