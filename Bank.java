import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class Bank {
    Account[] accounts;

    public Bank (Account[] accounts) {
        this.accounts = accounts;
    }

    public void update() {
        for (int i = 0; i < accounts.length; i++) {
            Account.update(accounts[i]);
        }
    }
}