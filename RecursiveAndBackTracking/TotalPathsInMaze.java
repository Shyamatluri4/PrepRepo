package RecursiveAndBackTracking;

/*program to count total paths in a maze with conditions to move
        1)  downwards
        2) right          */

public class TotalPathsInMaze{
    public static int totalPaths(int i, int j, int n,int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==(n-1) && j==(m-1)){
            return 1;
        }
        
        // if it moves towards right
        int rightpaths = totalPaths(i, j+1,n,m);

        // if it moves downwards
        int downpaths = totalPaths(i+1, j,n,m);

        return rightpaths+downpaths;
    }

    public static void main(String[] args) {
        int n=4, m=3;
        System.out.print("total paths : ");
        System.out.println(totalPaths(0, 0, n, m));
    }
}