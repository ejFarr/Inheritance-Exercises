public class CurrentAccount extends Account {
    private double overdraft;

    public CurrentAccount(int a, double overdraft) {
        super(a);
        this.overdraft = overdraft;
    }

    public void withdraw(double sum) {
        if (sum > 0 && sum <= getBalance() + overdraft) {
            setBalance(getBalance() - sum);
        }
        else
	    System.err.println("Account.withdraw(...): "
			       +"cannot withdraw negative amount.");    
        }
    }
}