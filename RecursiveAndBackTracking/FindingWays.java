package RecursiveAndBackTracking;

// to find the number of ways in which we can invite n people to a party in single or pairs.

public class FindingWays {
    public static int callGuests(int n){
        if(n==1 || n==2){
            return n;
        }

        // single 
        int single = callGuests(n-1);

        // in pairs 
        int pairs = (n-1) * callGuests(n-2);

        return single + pairs;
    }

    public static void main(String[] args) {
        int n=4;
        System.out.print("total ways to call the guests in single or pairs : ");
        System.out.println(callGuests(n));
    }
}
