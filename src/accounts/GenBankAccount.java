package accounts;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class GenBankAccount {
    private double amount;
    private double initialAmount;
    protected double sum = 0;
    protected Calendar addedDate = new GregorianCalendar(1990, Calendar.JANUARY, 1);
    protected SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yy");

    Calendar todayDate = Calendar.getInstance();

    public GenBankAccount(double initialAmount)
    {
        this.sum = initialAmount;
        System.out.println("Остаток по счету: " + sum);
        System.out.println("---");
    }

    public void addAmount(double amount)
    {
        this.sum += amount;
        System.out.println("Счет пополнен на сумму " + amount);
        System.out.println("Дата проведения операции: " + dateFormat.format(todayDate.getTime()));
        System.out.println("---");
        this.addedDate = todayDate;
    }

    public void takeAmount(double amount)
    {
        if (amount > sum){
            System.out.println("Недостаточно средств для снятия");
            System.out.println("---");
        } else {
            this.sum -= amount;
            System.out.println("Общая сумма, снятая со счета: " + amount);
            System.out.println("Дата проведения операции: " + dateFormat.format(todayDate.getTime()));
            System.out.println("---");
        }
    }

    public double showAccount()
    {
        String message = "Остаток по Вашему счету: ";
        message += sum;
        Calendar todayDate = Calendar.getInstance();
        System.out.println(message);
        System.out.println("Дата проведения операции: " + dateFormat.format(todayDate.getTime()));
        System.out.println("---");
        return sum;
    }
}
