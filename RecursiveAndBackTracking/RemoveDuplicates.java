package RecursiveAndBackTracking;

public class RemoveDuplicates {
    public static boolean[] arr = new boolean[26];

    public static void removeDuplicates(String input,int idx,String newString){
        
        if(idx==input.length()){
            System.out.println(newString);
            return;
        }
        
        char ch = input.charAt(idx);

        if(arr[ch -'a']){
          removeDuplicates(input, idx+1, newString);
        }
        else{
            newString+=ch;
            arr[ch-'a']=true;
            removeDuplicates(input, idx+1, newString);
        }
    }

    public static void main(String[] args) {
        String input = "aaaddbbaaccxxt";
        removeDuplicates(input, 0, "");
    }
}
