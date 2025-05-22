package RecursiveAndBackTracking;

public class TilesPlacement {
    public static int totalWays(int n,int m){
        if(n==m){
            return 2; 
        }

        if(n<m){
            return 1;
        }

        // if the tile is placed vertically then n-m are left
        int vertically = totalWays(n-m, m);

        // if the tile is placed horizontally then n-1 are left
        int horizontally = totalWays(n-1,m);

        return vertically + horizontally;
    }

    public static void main(String[] args) {
        int n=4,m=2;
        System.out.print("total ways to place the tile : ");
        System.out.println(totalWays(n, m));
    }
}
