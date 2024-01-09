package Assignment;

// NAME: NUR AMIRA NABILA BINTI MOHD AB RAHMAN
// MATRIC NO : 2220682

class CheckingAccount extends Account{
    private double insufficientFee;

    public CheckingAccount(double init_balance, double insufficientFee) {
        super(init_balance);
        this.insufficientFee = insufficientFee;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount + insufficientFee) {
            balance -= amount + insufficientFee;
            return true;
        }
        return false;
    }
}