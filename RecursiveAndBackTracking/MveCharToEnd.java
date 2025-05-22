package RecursiveAndBackTracking;


public class MveCharToEnd {
    
    public static void moveCharacter(String input,int count,int idx,String newString){

        if(idx==input.length()){
            for(int i=0;i<count;i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }

        char ch=input.charAt(idx);
        if(input.charAt(idx)=='x'){
            count++;            
            moveCharacter(input, count, idx+1, newString);
        }
        else{
            newString+=ch;
            moveCharacter(input, count, idx+1, newString);
        }
      }
    public static void main(String[] args) {
        String input = "axbcxxd";
        moveCharacter(input, 0, 0, "");
    }
}
