public abstract class AbstractFactory {
    public abstract Bank bankName(String bankType);
    public abstract Loan getLoan(String loanType);
}
