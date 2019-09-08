package accounts;

public class CardAccount extends GenBankAccount{
    public CardAccount(int initialAmount)
    {
        super(initialAmount);
    }

    @Override
    public void takeAmount(int amount) {
        if (sum < amount*1.01){
            System.out.println("Недостаточно средств для снятия");
            System.out.println("---");
        }
        else {
            this.sum -= amount * 1.01;
        }
    }
}
