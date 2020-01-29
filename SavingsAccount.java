public class SavingsAccount extends Account {
    private double interest;

    public SavingsAccount(int a, double interest) {
        super(a);
        this.interest = interest;
    }

    public void addInterest() {
        setBalance(getBalance() + (getBalance() * interest));
    }
}