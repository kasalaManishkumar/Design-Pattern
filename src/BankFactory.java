

class BankFactory extends AbstractFactory{
   public Bank bankName(String bankType){
       if("HDFC".equalsIgnoreCase(bankType)){
           return new HDFCBank();
       }
       else{
           return new ICICBank();
       }
   }
   public Loan getLoan(String loan){
       return null;

   }
}
