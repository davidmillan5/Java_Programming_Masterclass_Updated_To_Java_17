import com.bankaccount.domain.BankAccount;

public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(1,3500,"Estefania Osorio","estefania@gmail.com",12345678);

        System.out.println(account1);
        System.out.println(account1.getAccountBalance());

        account1.deposit(2500);
        System.out.println(account1.getAccountBalance());
        account1.withdraw(2500);
        System.out.println(account1.getAccountBalance());
    }
}
