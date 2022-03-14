

public class Customer {
    public static void main(String args[]){
        AbstractFactory loanFactory=FactoryCreater.getFactory("interfaces.Bank.Loan");
        Loan loan=loanFactory.getLoan("car");
        loan.loanType();
        AbstractFactory bankFactory=FactoryCreater.getFactory("BANK");
        Bank bank=bankFactory.bankName("HDFC");
        bank.bankMethod();
    }
}


/*      customer
           |
     factorycreater
    |              |
    bankfactory    loanfactory
    |                   |
    bank             loan
    |    |            |     |
    hdfc  icic      car    home
 */