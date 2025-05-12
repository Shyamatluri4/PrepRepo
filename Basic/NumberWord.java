import java.util.*;
public class NumberWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=Math.abs(sc.nextInt());

        System.out.println(convert(num));
        sc.close();

    }    
    
    public static String convert(int number){
       
        String[] units = {"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
        String[] teens = {"TEN","ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINETEEN",};
        String[] tens = {"","","TWENTY","THIRTY","FORTY","FIFTY","SIXTY","SEVENTY","EIGHTY","NINETY"};
       
        if(number<10){
        return units[number];
       } 
       else if(number%1000==0){
        return units[number/1000] + " THOUSAND" ;
       }
       else if(number<20){
        return teens[number-10];
       }
       else if(number<100){
        return tens[number/10] + (number%10 != 0 ? " "+ units[number%10]: "");
       }
       else if(number<1000){
        return units[number/100] + " HUNDRED" + (number%10!=0 ? " and "+ convert(number%100):"");
       }
       else if(number<10000){
        return units[number/1000] + " THOUSAND" + (number%100 !=0 ? " " + convert(number%1000): "");
       }
       else if(number<100000){
        return 
       }

        return null;

    }
}
