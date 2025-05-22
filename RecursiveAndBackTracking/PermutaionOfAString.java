package RecursiveAndBackTracking;

public class PermutaionOfAString {
    public static void permutaions(String str,String permutaion){
        if(str.length() == 0){
            System.out.println(permutaion);
            return;
        }


        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            String newstr=str.substring(0,i) + str.substring(i+1);

            permutaions(newstr, permutaion+ch);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        permutaions(str, "");
    }
}
