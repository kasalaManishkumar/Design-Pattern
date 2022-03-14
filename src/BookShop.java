import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
    private String shopName;
    List<Book> books=new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadData(){
        for (int i=0;i<10;i++){
            Book book=new Book();
            book.setBid(i);
            book.setBname("book"+i);
            getBooks().add(book);

        }
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop shop=new BookShop();
        for(Book book:this.getBooks()){
            shop.getBooks().add(book);
        }
        return shop;
    }

    @Override
    public String toString() {
        return "BookShop{" + "shopName='" + shopName + '\'' + ", books=" + books + '}';
    }
}
