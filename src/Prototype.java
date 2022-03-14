public class Prototype {
    public static void main(String args[]) throws CloneNotSupportedException {
    BookShop bookShop=new BookShop();
    bookShop.setShopName("Novelity");
    bookShop.loadData();


    BookShop bookShop1= bookShop.clone();
    bookShop.getBooks().remove(0);
    bookShop1.setShopName("Shraddha");
    System.out.println(bookShop);
    System.out.println(bookShop1);
    }
}
