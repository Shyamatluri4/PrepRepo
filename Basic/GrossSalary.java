import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        
        Float HRA,DA;

        //input salary
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the employee Salary : ");
        Float Salary = sc.nextFloat();

        //check the salary
        if(Salary<20000){
            HRA=(Salary*20)/100;
            DA=(Salary*80)/100;
            System.out.println("HRA : "+HRA);
            System.out.println("DA : "+DA);
            System.out.println("The Gross Salary of the employee is "+(HRA+DA+Salary));
        }
        else if(Salary<=20000){
            HRA=Salary*25/100;
            DA=Salary*90/100;
            System.out.println("HRA : "+HRA);
            System.out.println("DA : "+DA);
            System.out.println("The Gross Salary of the employee is "+(HRA+DA+Salary));
        }
        else{
            HRA=Salary*30/100;
            DA=Salary*95/100;
            System.out.println("HRA : "+HRA);
            System.out.println("DA : "+DA);
            System.out.println("The Gross Salary of the employee is "+(HRA+DA+Salary));
        }

        sc.close();
    }
}
