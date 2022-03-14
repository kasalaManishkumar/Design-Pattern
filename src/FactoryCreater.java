public class FactoryCreater {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("BANK")){
            return new BankFactory();
        }
        else{
            return new LoanFactory();
        }
    }
}
