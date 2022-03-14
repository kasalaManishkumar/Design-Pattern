public class Printer {
    private static Printer printer;
    private Printer(){

    }
    public static Printer getInstance(){
        if(printer==null){
            printer=new Printer();
            System.out.println("your connected to new printer ");
            return printer;
        }
        System.out.println("your connected to the same printer that other device is connected");
        return printer;
    }
}
