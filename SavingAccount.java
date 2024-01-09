package Assignment;

// NAME: NUR AMIRA NABILA BINTI MOHD AB RAHMAN
// MATRIC NO : 2220682

class SavingAccount extends Account {
            private double annualInterest;

    public SavingAccount(double init_balance, double annualInterest) {
        super(init_balance);
        this.annualInterest = annualInterest;
    }

    public boolean depositMonthlyInterest() {
        balance += balance * (annualInterest / 12);
        return true;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}