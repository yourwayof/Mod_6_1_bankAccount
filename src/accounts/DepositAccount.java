package accounts;

import java.util.Calendar;

public class DepositAccount extends GenBankAccount {
    public DepositAccount (int initialAmount){
        super(initialAmount);
    }

    @Override
    public void takeAmount(int amount) {
        todayDate = Calendar.getInstance();
        Calendar allowedTakeDate = addedDate;
        allowedTakeDate.add(Calendar.MONTH, 1);
        if (todayDate.before(allowedTakeDate)){
            System.out.println("В снятии отказано: с последнего пополнения счета прошло менее месяца.");
            System.out.println("---");
        } else {
            if (amount > sum){
            System.out.println("Недостаточно средств для снятия");
                System.out.println("---");
        } else {
            this.sum -= amount;
            System.out.println("Со счета снята сумма " + amount);
            System.out.println("Дата проведения операции: " + dateFormat.format(todayDate.getTime()));
                System.out.println("---");
        }}
    }


}
