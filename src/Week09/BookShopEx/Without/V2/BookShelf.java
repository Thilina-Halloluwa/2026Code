package Week09.BookShopEx.Without.V2;

import Week09.BookShopEx.*;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
    private List<Book> inventory = new ArrayList<>();

    public void addItem(Book item) {
        inventory.add(item);
    }

    public Book getItem(int index) {
        return inventory.get(index);
    }

    public void displayBooks() {
        for (Book book : inventory) {
            System.out.println(book.getTitle() + " (" + book.getGenre() + ")");
        }
    }
}
