public class SingletonPrinter {
    public static void main(String args[]){
        Printer mobile=Printer.getInstance();
        Printer laptop=new Printer();
        System.out.println(mobile.hashCode());
        System.out.println(laptop.hashCode());
    }
}
