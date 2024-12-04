public abstract class AbstractDecorator implements BankAccountDecorator {
    protected BankAccount bankAccount;

    public AbstractDecorator(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String showAccountType() {
        return bankAccount.showAccountType();
    }

    @Override
    public double getInterestRate() {
        return bankAccount.getInterestRate();
    }

    @Override
    public double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public String showBenefits() {
        return bankAccount.showBenefits();
    }

    @Override
    public double computeBalanceWithInterest() {
        return bankAccount.computeBalanceWithInterest();
    }

    @Override
    public String showInfo() {
        return bankAccount.showInfo();
    }
}
