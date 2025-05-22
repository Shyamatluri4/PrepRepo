package RecursiveAndBackTracking;

import java.util.ArrayList;

//the subsequences form a tree structure which only has two nodes. "TO BE" OR "NOT TO BE".

public class SubSequence {
    public static void subSeq(String input,int idx,String newString,ArrayList<String> set){
        
        if(idx==input.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                set.add(newString);
                System.out.println(newString);
                return;
            }
        }
        char ch = input.charAt(idx);
        
        //to be
        subSeq(input, idx+1, newString+ch,set);

        //not to be 
        subSeq(input, idx+1, newString,set);
    }

    public static void main(String[] args) {
        String input="aaa";
        
        //for unique substrings.
        ArrayList<String> set = new ArrayList<>();
        subSeq(input, 0, "",set);
    }
}
