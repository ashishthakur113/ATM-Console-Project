package ATMProject;

public class AtmOperationImpl implements AtmOperationInterFace {

    ATM atm = new ATM();

    @Override
    public void viewBalance() {
        System.out.println("Available Balance is : " + atm.getBalance());
    }

    @Override
    public void withDrawAmount(double withDrawAmount) {

        System.out.println("============================================================");

        if (withDrawAmount <= atm.getBalance()) {

            System.out.println("Collect The Cash From Machine : " + withDrawAmount);
            atm.setBalance(atm.getBalance() - withDrawAmount);

            viewBalance();
        } else {
            System.out.println("Insufficient Balance !!");
        }

        System.out.println("============================================================");
    }

    @Override
    public void depositAmount(double depositAmount) {

        System.out.println("============================================================");

        System.out.println(depositAmount + " Deposited Successfully !!");
        atm.setBalance(atm.getBalance() + depositAmount);

        viewBalance();

        System.out.println("============================================================");
    }
}