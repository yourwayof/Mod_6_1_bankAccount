package accounts;

public class CardAccount extends GenBankAccount{
    public CardAccount(int initialAmount)
    {
        super(initialAmount);
    }

    @Override
    public void takeAmount(double amount) {
        System.out.println("Запрашиваемая сумма для снятия: " + amount);
        super.takeAmount(1.01 * amount);
    }
}
