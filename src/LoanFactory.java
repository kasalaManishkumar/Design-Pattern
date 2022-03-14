
class LoanFactory extends AbstractFactory{
    public Loan getLoan(String Type){
        if(Type.equalsIgnoreCase("HomeLoan")){
            return new HomeLoan();
        }
        else {
            return new Carloan();
        }
    }
    public Bank bankName(String bankType){
        return null;
    }
}
