import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Total units used : ");
        float TotalUnits = sc.nextFloat();

        double Totalbill=0;

        if(TotalUnits<=50){
            System.out.println("Your Electricity bill is "+ (Totalbill+=TotalUnits*0.5));
        }
        else if(TotalUnits<=150){
            System.out.println("Your Electricity bill is "+ (Totalbill+=((0.5*50)+((TotalUnits-50)*0.75))));
        }
        else if(TotalUnits<=250){
            System.out.println("Your Electricity bill is "+ (Totalbill+=((0.5*50)+(100*0.75)+((TotalUnits-100)*1.20))));
        }
        else{
            double TotalbillWS=((50*0.5)+(100*0.75)+(150*1.20)+((TotalUnits-150)*1.50));
            double surge = (TotalbillWS*20)/100;
            System.out.println("Your Electricity bill is "+ (Totalbill+=(TotalbillWS+surge)));
        }

        sc.close();
    }
}
