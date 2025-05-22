package RecursiveAndBackTracking;

public class KeyPadCombination {
    public static String[] arr = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"}; 
    
    public static void combinations(String input,int idx,String combination) {
        if(idx==input.length()){
            System.out.println(combination);
            return;
        }
        char ch = input.charAt(idx);
        String mapping = arr[ch-'0'];
        //mapping with the array arr
        for(int i=0;i<mapping.length();i++){
            combinations(input, idx+1, combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String input="23";
        combinations(input, 0, "");
    }
}
