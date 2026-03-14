package ATMProject;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        AtmOperationInterFace op = new AtmOperationImpl();
        int atmNum = 12345;
        int atmPin = 123;

        Scanner sc = new Scanner(System.in);
        System.out.println("============= Welcome To YourBank ATM =============");
        System.out.print("Enter ATM Number :");
        int atmNumIs = sc.nextInt();
        System.out.print("Enter Pin :");
        int pin = sc.nextInt();

        if((atmNum == atmNumIs) && (atmPin == pin)){
             while(true){
                 System.out.println("1. View Available Balance \n 2.WithDraw Amount \n 3.Deposit Amount \n 4.Exit ");
                 System.out.println("Enter Choice :");
                 int ch = sc.nextInt();
                 if(ch ==1){
                    op.viewBalance();
                 }
                 else if(ch == 2){
                     System.out.println("Enter amount to WithDraw");
                     double withdrawAmount= sc.nextDouble();
                     op.withDrawAmount(withdrawAmount);

                 }
                 else if(ch == 3){
                     System.out.println("Enter Amount You want to Deposit : ");
                     double depositAmount = sc.nextDouble();
                     op.depositAmount(depositAmount);
                 }
                 else if(ch == 4){
                     System.out.println("Collect Your ATM Card \n Have A Good Day!");
                     System.exit(0);
                 }
                 else{
                     System.out.println("Invalid Choice");
                 }
             }
        }else{
            System.out.println("Incorrect ATM Number or Pin");
            System.exit(0);
        }

    }
}
