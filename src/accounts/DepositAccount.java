package accounts;

import java.util.Calendar;

public class DepositAccount extends GenBankAccount {
    public DepositAccount (double initialAmount){
        super(initialAmount);
    }

    @Override
    public void takeAmount(double amount) {
        todayDate = Calendar.getInstance();
        Calendar allowedTakeDate = addedDate;
        allowedTakeDate.add(Calendar.MONTH, 1);
        if (todayDate.before(allowedTakeDate)){
            System.out.println("В снятии отказано: с последнего пополнения счета прошло менее месяца.");
            System.out.println("---");
        } else {
            super.takeAmount(amount);
        }
    }
}



