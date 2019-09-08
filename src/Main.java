import accounts.CardAccount;
import accounts.DepositAccount;
import accounts.GenBankAccount;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Создайте класс, который будет представлять собой расчётный счёт в банке. \nНа этот расчётный счёт деньги можно положить, с него их можно снять, и ещё можно посмотреть, сколько денег на счёте. \nСоздайте два класса-наследника - депозитарный расчётный счёт, с которого нельзя снимать деньги в течение месяца после последнего внесения, и карточный счёт, \nпри снятии денег с которого будет взиматься комиссия 1%.");
        System.out.println("---");
        GenBankAccount newAccount = new GenBankAccount(10000);
        newAccount.addAmount(1000);
        newAccount.addAmount(250);
        newAccount.takeAmount(753);
        newAccount.showAccount();
        newAccount.takeAmount(100000);
        newAccount.showAccount();

        CardAccount newCardAccount = new CardAccount(15000);
        newCardAccount.addAmount(5000);
        newCardAccount.showAccount();
        newCardAccount.takeAmount(5000);
        newCardAccount.showAccount();
        newCardAccount.takeAmount(15000);
        newCardAccount.showAccount();

        DepositAccount newDepositAccount = new DepositAccount(10000);
        newDepositAccount.addAmount(5000);
        newDepositAccount.takeAmount(5000);
        newDepositAccount.showAccount();

    }


 }
