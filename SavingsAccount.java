public class SavingsAccount extends Account {
    private double interest;

    public SavingsAccount(int a, double interest) {
        super(a);
        this.interest = interest;
    }

    public double addInterest() {
        return getBalance() + (getBalance() * interest);
    }
}