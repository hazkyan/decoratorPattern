public class UpSave extends AbstractDecorator {

    public UpSave(BankAccount bankAccount) {
        super(bankAccount);
    }

    @Override
    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public double getInterestRate() {
        return 0.04; // 4.0%
    }

    @Override
    public String showBenefits() {
        return bankAccount.showBenefits() + ", With Insurance";
    }

    @Override
    public double computeBalanceWithInterest() {
        return bankAccount.getBalance() + (bankAccount.getBalance() * getInterestRate());
    }
}
